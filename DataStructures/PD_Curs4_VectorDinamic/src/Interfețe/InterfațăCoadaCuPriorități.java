package Interfețe;

/*	Coada cu priorități (Priority Queue) reprezintă o Coadă,
 * dar care are returnează elementele în funcție de prioritatea
 * dată ca parametru în operația creează().
 * 
 * 	!Principiu de funcționare: Highes Priority First.
 * 		Din acesta decurg câteva diferențe în ce vor returna operațiile.
 * 
 * 
 * 	Observație: Coada cu Priorități NU POATE FI ITERATĂ, NU are iterator! 
 * Nu avem metode de a vedea toate elementele Cozii cu Priorități, doar 
 * cel cu prioritate maximă. 
 * 	Totuși, dacă vrem să vedem restul elementelor trebuie să tot ștergem din aceasta.
 */

public interface InterfațăCoadaCuPriorități<T> {

	public void creează(/*Relație*/);
	/* Descriere: creează o PQ. nouă vidă.
	 * 
	 * Condiții:
	 * 			pre: R este o relație (funcție) care specifică prioritatea.
	 * 			post: o PQ. vidă este creată.
	 */
	
	public void adaugă(T element, T prioritate);
	/*	Descriere: adaugă un element în coadă în funcție de prioritatea acestuia.
	 * 
	 * 	Condiții:
	 * 			pre: PQ. este o Coadă cu Priorități, T element este elementul de adăugat,
	 * 				T prioritate este priortatea în funcție de care se adaugă.
	 * 
	 * 			post: elementul cu prioritatea specificată este adăugat în coadă.
	 */
	
	public void ștergeElementPrioritateMaximă();
	/*	Descriere:
	 * 			a. ȘTERGE elementul cu PRIORITATE MAXIMĂ și
	 *    			 +
	 *    		b. RETURNEAZĂ o percehe: elementul șters + prioritatea sa.
	 * 
	 * 	Condiții:
	 * 			pre: PQ. este o Coadă cu Priorități + NU ESTE VIDĂ.
	 * 
	 * 			post: șterge elementul cu priorit. maximă și RETURNEAAZĂ o PERECHE ELEMENT + PRIORITATE.
	 * 
	 * 	Aruncă: excepție, dacă Coada cu Priorități este vidă.
	 * 
	 * 
	 * 	!N.B.: DACĂ EXISTĂ MAI MULTE ELEMENTE CU PRIORITATE MAXIMĂ
	 * ORICARE DIN ACESTEA POATE FI ȘTERS + RETURNAT.
	 * 
	 */
	
	public void elementPrioritateMaximă();
	/*	Descriere: RETRUNEAZĂ PERCEHE ELEMENT PRIORIT. MAXIMĂ + PRIORITATEA LUI;
	 * 			!NU șterge elementul returnat.
	 * 
	 * 	Condiții:
	 * 			pre: Coada cu Priorități NU este vidă.
	 * 			post: retrunează percehea element priorit. maximă + prioritate.
	 * 
	 * 
	 * 	Aruncă: excepție dacă Coada cu Priorități este vidă.
	 * 
	 * 	!N.B: DACĂ EXISTĂ MAI MULTE ELEMENTE CU PRIORITATE MAXIMĂ
	 * ORICARE DIN ACESTEA POATE FI RETURNAT + PRIORITATEA SA.
	 * 
	 */
	
	public boolean vidă();
	//Descirere: returnează ADEVĂRAT dacă este viđă și FALS dacă nu este vidă.
}