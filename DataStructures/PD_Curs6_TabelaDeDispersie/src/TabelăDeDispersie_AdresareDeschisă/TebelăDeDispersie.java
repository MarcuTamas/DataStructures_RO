package TabelăDeDispersie_AdresareDeschisă;
/* Prealabil:
 * 	FUNCȚIA DE DISPERSIE este: d(c) = (c%m).
 * 		Aceasta va returna o valoare în intervalul 0,m-1.
 * 		Elementele funcției sunt c = elementulDeAđăugat și m = capacitateaTabelei (vectoruluiDinamic).
 *	
 *	Tabela de dispersi o folosim la continere unde NU avem poziții (toate în afară de Listă).
 * 
 * 	Coliziunea reprezintă situația în care 2 elemente diferite ar trebui puse pe aceeași poziție.
 * 		Rezolvarea coliziunilor (x2 metode):
 * 			a. Prin liste independente;
 * 			b. Prin adresare deschisă.
 * 
 * 
 * 	Factorul de încărcare (Load factor) 𝞪 = n/m.
 * 		Mai exact: numărulDeElemente / Capacitate (sau numărul de poziții).
 * 	Indiferent de modul în care tratăm coliziunea, avem nevoie să știm cât de plin e vectorul dinamic
 * al tabelei de dispersie.
 * 	
 * 		În cazul rezolvării cu adresare deschisă 𝞪 (i.e. factorul de încărcare),
 * poate fi maxim 1, mai exact atunci când numarulDeElemente (n) este egal cu
 * numărul de poziții (m sau capacitatea vectoruluiDinamic).
 * 		Acest maxim reise din modul în care așezăm elementele tabelei de dispersie,
 * care în cazul adresării deschise vor fi puse chiar în vectorul dinamic, iar NU
 * în afara sa (NU într-o listă independentă).
 */


//a. Prin liste independente (simplu înlănțuite).
public class TebelăDeDispersie {
	//Reprezentare. | x3, inclusiv funcția de dispersie.

	int capacitate;			//Câte elemente vom putea păstra în tabela de dispersie (care e un VD).
	int[] elemente;
	//funcțiaDeDispersie, care e puțin diferită, mai exact va fi ((elementDeAdăugat%capacitate)+numărulDeÎncercare+2*numărulDeîncercare^2)%capacitate.
	//Opțional putem avea și numărElemente (length);

	
	//Constructor
	public TebelăDeDispersie() {
		creează();
	}
	
	public void creează() {
		this.capacitate = 11;
		this.elemente = new int[this.capacitate];
		//Opțional this.numărElemente = 0;
	}

	public int funcțiaDeDispersie(int elementDeAdăugat, int numărulDeÎncercare) {
		return (int) ((elementDeAdăugat%this.capacitate)+numărulDeÎncercare+2*(Math.pow(numărulDeÎncercare, 2))%this.capacitate);
	}

	public void adăugare(int elementDeAdăugat) {	//Complexitate: caz favorabil θ(1), caz defavorabil θ(n) și caz mediu θ(1). 
		int i, poziție;								//i reprezintăNumărulDeÎncercare.
		i = 0;
		poziție = this.funcțiaDeDispersie(elementDeAdăugat, i);

		while(i<this.capacitate && this.elemente[poziție] != 0) {
			i++;			//Creștem numărul de încercare.
			poziție = this.funcțiaDeDispersie(elementDeAdăugat, i);			//Recalculăm poziția cu noul număr de încercare.
		}
		/*Verificăm să nu fi încercat deja toate pozițiile și dacă poziția nu e goală.
		 * 	În Java, deoarece variabilele care conțin date primitive vor fi întotdeauna inițializate
		 * cu ceva valoarea, e.g. la int vor avea valoarea implicită 0, NU vom putea testa condiția
		 * ca poziția să fie golă cu null (NU există null pentru date primitive), ci vom presupune că
		 * o poziție este goală atunci când aceasta are valoare 0, pe care Java o pune în mod implicit.
		 */
		
		//Verificăm dacă poziția la ieșirea din while avem toate pozițiile ocupate.
		if(this.elemente[poziție] > 0) {												//Dacă e mai mare ca 0, respectiv ca valoarea implicită Java, însemnă că poziția este ocupată.
			this.măreșteCapacitateaȘiAdaugă(elementDeAdăugat);							//Trebuie să mutăm toate elementele din vectorul vechi în vectorul nou, respectând funcția de dispersie. Apelăm subAlgoritmul care face acest lucru.
		}else {																		
			//Altfel dacă nu am ajuns la capacitate, deoarece mai am poziții libere.
			this.elemente[poziție] = elementDeAdăugat;
		}

	}
	
	//resizeAndAdd.
	public void măreșteCapacitateaȘiAdaugă(int elementDeAdăugat) {
		this.capacitate = capacitate*2;
		int[] vectorNou = new int[capacitate];
		int numărulDeÎncercare, poziție;									//În pseudocod numărulDeÎncercare apare ca index.
																				//Este în regulă să fie așa, deoarece numărul de încercare va fi indexul noului vector.
		
		//1. subAlgoritm de mărire a capacității și de mutare a elementelor.
		//Parcuregm vectorul vechi și adăugăm fiecare element.
		for(int i = 0; i<this.capacitate/2; i++) {							//!N.B: mergem până la this.capacitate/2, deoarece aceasta este vecha capacitate ce a fost atinsă.
			if(this.elemente[i] > 0) {										//Dacă avem element pe acea poziție în vechiul vector.
				numărulDeÎncercare = 0;
				poziție = this.funcțiaDeDispersie(this.elemente[i], numărulDeÎncercare);			//Trecem elemenutul prin funcția de dispersie pentru a-i afla poziția din noul vector.
				
				//Verificăm să nu fi ajuns la noua capacitate și să am poziție liberă în noul vector creat.
				while(numărulDeÎncercare<this.capacitate && vectorNou[numărulDeÎncercare] > 0) {	//!N.B: this.capacitate este acum capacitate*2. Prin urmare valoarea din funcția de dispersie va fi alta.
					numărulDeÎncercare++;
					poziție = this.funcțiaDeDispersie(elementDeAdăugat, numărulDeÎncercare);
				}
				vectorNou[poziție] = this.elemente[i];				//Copiem propriu-zis valoarea elementelor vechiului vector, în pozițiile corecte ale noului vector.
			}
		}
		this.elemente = vectorNou;			//Schimbăm referința și astfel elemente va deveni vector nou.
		
		
		//2. subAlgoritm de adăugare a noului element ce ar fi depășit vechia capacitate. 
		//Deoarece am finalizat mărirea capacității și mutarea vechiilor element, respectând d(c,i), putem adăuga și elementul nou care ar fi depășit vechea capacitate.
		numărulDeÎncercare = 0;
		poziție = this.funcțiaDeDispersie(elementDeAdăugat, numărulDeÎncercare);

		//Căutăm o poziție goală.
		while(numărulDeÎncercare<this.capacitate && vectorNou[numărulDeÎncercare] > 0) {			//Putem folosi vectorNou, deoarece this.elemente referă la acesa și orice schimbare se vede și pentru this.elemente.
			numărulDeÎncercare++;
			poziție = this.funcțiaDeDispersie(elementDeAdăugat, numărulDeÎncercare);
		}
		//După ce ieșim din while ar trebui să găsim o poziție goală, deoarece capacitatea a fost anterior dublată.
		//Putem adăuga elementul în tabela de dispersie.
		vectorNou[poziție] = elementDeAdăugat;
	}






}
