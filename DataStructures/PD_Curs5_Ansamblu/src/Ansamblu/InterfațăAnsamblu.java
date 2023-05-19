package Ansamblu;
/*	Prealabil:
 * 		Ansamblul este o structură de date folosită doar la Coada cu priorități. Acesta reprezintă
 * 	un hibrid între vectorDinamic și arboreBinar, deoarece este un vectorDinamic (structură 
 * 	liniară), care este privit ca un arboreBinar (structură neliniară).
 * 
 *	Ecuații pentru aflarea descendențiilor și a părintelui:
 *		a. DESCENDENȚII:
 *				o Regulă = { D1 = 2*indexPărinte și  D2 = 2*indexPărinte+1 };
 *					o Excepția [DESCENDENȚII RĂDĂCINI] = {2*indexRădăcină + 1 și 2*indexRădăcină+2);
 * 						!N.B. Ansablul fiind un vectorDinamic, va avea întotdeauna rađăcina
 * 						la indexul 0.							
 * 
 * 		b. Părintele: (indexDescendent-1)/2;
 * 
 * 
 *  !N.B. NU orice arbore binar este și un ansamblu, deoarece pentru a fi ansamblu trebuie
 *  respectată STRUCTURA și PROPRIETATEA DE ANSAMBLU.
 *  
 *  
 *  STRUCTURA: NU EXISTĂ "GĂURI"
 *  	!R: FIECARE NOD ARE EXACT 2 DESCENDENȚI.
 *  	 !E: ULTIMUL DOUĂ NIVELE -> DESCENDENTII SUNT COMPLETAȚI DE LA STÂNGA LA DREAPTA.
 *  			= pot exita 1/2 sau niciun descendent (i.e. atunci este frunză).
 *  
 *  PROPRIETATEA DE ANSAMBLU (ALTERNATIV):
 *  	SORTARE MAXHEAP: 
 *  				a. relatția dintre un nod și descendenții săi este >= (mai mare sau egal);
 *  				b. RADĂCINA conține ELEMNTUL MAXIM din ansablu;
 *  
 *  			MINHEAP: 
 *  				a. relatția dintre un nod și descendenții săi este <= (mai mic sau egal);
 *  				b. RADĂCINA conține ELEMNTUL MINIM din ansamblu.
 *  
 *  	!N.B. chiar dacă MAX/MINHEAP sunt valide, acest lucru nu înseamnă că elementele ansamblului
 *  	care sunt stocate într-un vectorDinamic sunt așezate ordonat în acesta.
 *  		e.g. maxHeapValid = 54,11,30,9,5,7;
 *  			 minHeapValid = 4,41,30,59,54;
 */


public interface InterfațăAnsamblu {

	//Operații ansamblu. | x2 Adăugare (END) și ștergere (FRONT = rădăcină).
	
	public void adăugare(int elementDeAdăugat);
	/*	Deoerece folosim ansamblu pentru a reprezenta coada cu priorităț,
	 * trebuie respectat principiul acesteia de a adâuga la final (END).
	 */
	
	public int șterge();
	// Ibidem, trebuie să ștergem rădăcina (FRONT).
	
	
}
