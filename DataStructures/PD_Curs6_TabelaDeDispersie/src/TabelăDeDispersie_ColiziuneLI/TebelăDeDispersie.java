package TabelăDeDispersie_ColiziuneLI;
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
 * 
 * 
 * 
 * !NB: în cazul adresării deschise avem de efectuat următoarele x3 operații:
 *			1. calculăm poziția elementului (v. funcția de dispersie);
 *			2. dacă poziția este ocupată calculăm o altă poziție, până găsim o poziție liberă;
 *			3. dacă am parcurs toate pozițiile și nu am găsit niciuna liberă, însemnă ca (vectorul dinamic)
 *			tabela de dispersie este plină (capacitatea m a ajuns la maxim) și atunci trebuie să o mărim.
 */


//b. Prin adresare deschisă.
public class TebelăDeDispersie {
	//Reprezentare. | x3, inclusiv funcția de dispersie.

	int capacitate;			//Câte elemente vom putea păstra în tabela de dispersie (care e un VD).
	Nod[] elemente;			//VectorulDinamic în care păstrăm referința primului nod, iar dacă listele sunt goale null.



	public void creează() {
		this.capacitate = 11;
		this.elemente = new Nod[this.capacitate];
		//		this.funcțiaDeDisperise(int elementDeAdăugat, this.capacitate);
		int i;

		//Inițializăm vectorul.
		for(i = 0; i<this.capacitate; i++) {			//Complexitate θ(m), unde m este capacitatea sau dimensiunea tabelei de dispersie.
			this.elemente[i] = null;
		}
	}

	public int funcțiaDeDisperise(int elementDeAdăugat) {
		return (elementDeAdăugat%this.capacitate);			//Îmi va returna poziția la care trebuie adăugat elementul.
	}

	public void adaugă(int elementDeAdăugat) {			//Complexitate θ(1).
		int pozițieLaCareAdăugăm;
		pozițieLaCareAdăugăm = this.funcțiaDeDisperise(elementDeAdăugat);
		Nod nodNou = new Nod();
		nodNou.element = elementDeAdăugat;
		nodNou.nodUrmător = null;				//creeăm un nod nou următor.

		//Verificăm dacă lista este goală și atunci punem nodul nou în vector.
		//Mai exact primul element al vectorului de liste nu va mai fi null, ci referința la nodul nou.
		if(this.elemente[pozițieLaCareAdăugăm] == null) {
			this.elemente[pozițieLaCareAdăugăm] = nodNou;
		}else {			
			nodNou.nodUrmător = this.elemente[pozițieLaCareAdăugăm];
			this.elemente[pozițieLaCareAdăugăm] = nodNou;
		}
	}
	/*	Alftel, dacă mai am elemente în listă, adăugăm nodul nou la începutul acesteia.
	 * Prin urmare, va trebui să schimbăm referințele, respectiv nodul nou adăugat va trebui
	 * să refere (ca nod următor) la vechiul primul nod, a cărui referința exista în vectorul
	 * dinamic, iar apoi schimbăm referința din vector la nodul nou (care va fi acum primul nod).
	 * 
	 * 	!Atenție: este similar cu o listă simplă, numai că în loc de primulElement, vom avea
	 * this.elemente[pozițieLaCareAdăugăm], aceasta fiind referința la primul nod.
	 */



	public void șterge(int elementDeșters) {					//Complexitate O(n), cazul defavorabil fiind când toate elementele tabelei sunt într-o singură listă.
		int pozițieDeUndeȘtergem;								//COmplexitate medie θ(1).
		pozițieDeUndeȘtergem = this.funcțiaDeDisperise(elementDeșters);
		Nod nodCurent = this.elemente[pozițieDeUndeȘtergem];				//Echivalent nodCurent = primulNod.
		Nod nodAnterior = null;
		
		//Verificăm să nu avem o listă vidă.
		while(nodCurent != null) {
			//Verificăm dacă elementul de șters nu este chiar primul element.
			if(nodCurent.element == elementDeșters) {
				if(nodAnterior == null) {
					//Schumbăm referința poziției la următorul nod a primului nod (așa ștergem primul nod).
					this.elemente[pozițieDeUndeȘtergem] = this.elemente[pozițieDeUndeȘtergem].nodUrmător;
				}else {
					nodAnterior.nodUrmător = nodCurent.nodUrmător;
				}
			}else {
				//Altfel parcurgem lista până găsim elementul de șters.
				nodAnterior = nodCurent;
				nodCurent = nodCurent.nodUrmător;
			}
		}

	}
	/*NU trebuie parcurs vectorul dinamic, deoarece prin apelarea funcției de dispersie vom 
	 * găsi exact poziția de unde trebuie șters elementul.	
	 * Cu toate acestea, totuși va trebui să parcrugem elementele listei, ca să găsim elementul
	 * ce trebuie șters. Din acest motiv, va trebui să implementăm un nodCurent și un nodAndterior.
	 */
	
	
	public boolean cautăint (int elementDeCăutat) {			//Complexitate θ(n), caz defavorabil și θ(1) caz mediu.
		int poziție;
		poziție = this.funcțiaDeDisperise(elementDeCăutat);
		Nod nodCurent = this.elemente[poziție];
		
		boolean existăElement = false;
		
		while(nodCurent != null && existăElement == false) {
			if(nodCurent.element == elementDeCăutat) {
				existăElement = true;
			}else {
				//Altfel parcurgem lista de elemente.
				nodCurent = nodCurent.nodUrmător;
			}
		}
		return existăElement;
	}
	
}
