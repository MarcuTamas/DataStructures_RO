package ArboriBinariDeCăutare;

/* Prealabil:
 * 		a. este tot un arbore binar, deci are structura unui ansamblu;
 * 		b. în cazul său și proprietatea este mai apropiată de ansmablu, față de arborele binar.
 * 			Astfel, vom avea doi subarbori, unul de „minHeap” și unul de „maxHeap”.
 * 		Pe subArborele stâng așezăm toate elementele MAI MICI sau EGALE cu rădăcina/părintele subArborelui (un fel de maxHeap);
 * 		Pe subArboreleDrept așzăm toate elementele MAI MARI decât rădăcina/părintele subArborelui (un fel de minHeap).
 * 
 * 		c. spre deosebire de arborii simplii sau cei binari(n-ari), care nu au operații specifie TAD.
 *		și astfel nu pot fi folosiți ca structuri de date pentru a reprezenta un TAD, în cazul arborilor
 *		binari de căutare avem următoarele operații:
 * 			o adaugă;
 * 			o șterge;
 * 			o caută.
 * 
 * 		d. vom putea folosii ABC. pentru a reprezenta ORICE TAD. ORDONAT ÎN CARE NU EXISTĂ POZIȚII. 
 * 
 * 
 * 	!Totuși nu va avea prorietatea veritabilă a unui ansamblu, dar din rațiuni de înțelegere am făcut
 * această comparație.
 * 
 * 	Importanța algoritmului de parcurgere:
 * 		a. preOrdine;
 * 		b. inOrdine;		= vom avea toate elementele sortate crescător.
 * 		c. postOrinde.
 */

public class ArboreBinarDeCăutare {
	//Reprezentare. | x1 atribut (similar arborilorBinari).

	Nod rădăcina;

	public void adaugăElement(int elementDeAdăugat) {			//Complexitate O(n).
		Nod nodNou, nodCurent, părinteNodCurent;

		nodNou = new Nod();

		nodNou.informațieDinNod = elementDeAdăugat;
		nodNou.fiuStâng = null;									//Nodul nou este de fapt o frunază (nu are descendenți).
		nodNou.fiuDrept = null;

		if(this.rădăcina == null) {								//Dacă arborele este gol, nodul nou va fi chiar rădăcina.
			this.rădăcina = nodNou;
		}else {
			nodCurent = this.rădăcina;							//Altfel parcuregm elementele ca să așezăm nodul nou.
			părinteNodCurent = null; 							
				//Rădăcina nu are părinte.
			
			
			//Parcurgem elementele și ne asigurăm că vom ajunge în partea care trebuie.
			while(nodCurent != null) {
				părinteNodCurent = nodCurent;
				if(elementDeAdăugat <= nodCurent.informațieDinNod) {
					nodCurent = nodCurent.fiuStâng;
				}else {
					nodCurent = nodCurent.fiuDrept;
				}
			}
			
			//După ce ieșim din while ajungem la părintele la care trebuie adăugat nodul nou.
			//Trebuie să verificăm în ce partea vom pune nodul nou, prin compararea valorii (ca să respectăm proprietatea ABC.).
			if(elementDeAdăugat <= părinteNodCurent.informațieDinNod) {
				părinteNodCurent.fiuStâng = nodCurent;
			}else {
				părinteNodCurent.fiuDrept = nodCurent;
			}
			
			
		}
	}




	public boolean căutareElement(int elementDeCăutat) {			//Complexitate: caz defavorabil θ(n), caz mediu θ(log2n).
		Nod nodCurent;
		nodCurent = this.rădăcina;			//Răđăcina este primul element.

		//Parcurgem elementele arborelui pentru a căuta elementul.
		while(nodCurent != null && nodCurent.informațieDinNod != elementDeCăutat){
			if(elementDeCăutat < nodCurent.informațieDinNod) {
				//Dacă este mai mic mergem pe stânga.
				nodCurent = nodCurent.fiuStâng;
			}else {
				//Altfel mergem pe dreapta.
				nodCurent = nodCurent.fiuDrept;
			}
		}

		//Verificăm dacă cumva elementul nu există.
		if(nodCurent == null) {
			return false;
		}else {
			return true;
		}
	}


}