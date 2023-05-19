package TAD_Interfețe_Operații_Condiții;

/*Coada(Queue) este un continer unde accesul la elemente este restricționat
* la CELE DOUĂ capete al acestuia
* 	Astfel, vom avea acces doar la cele două capete, respectiv FRONT și END.
* 		i.e. ADĂUGAREA unui element = se face la capătul cozii (END);
* 			 ȘTERGEREA și
* 			 ACCESUL unui element are loc la celalat capăt (FRONT).
* 
*	PRINCIPIU APLICABIL = FIFO (First In First Out).				//Spre deosebire de stivă(LIFO).
*	
*	Spre deosebire de Colecție, Mulțime și coadă, în cazul Stivei
* NU AVEM metode de a itera elementele acesteia = NU avem iterator.
* 
* 	De altfel, se ASEMĂNĂ Stiva și coadaCuPriorități, deoarece nici ele
* NU au iterator, iar numele operațiilor sunt aceleși.
* 
* 	Totuși se deosbește de stivă, deoarece în cazul cozii accesul este restricționat
* la AMBELE CAPETE ale acesteia, respecti FRONT șî END și nu doar la unul dintre ele,
* precum în cazul primului continer aminiti, mai exact la VÂRFUL stivei.										
*/


public interface InterfațăCoada<T> {
	
	public void creează();
	
	//queue.push();
	public void adaugăEnd(T elementDeAdăugat);
	/*	Descriere: adaugă un element la END-ul cozii.
	 * 
	 *	Codiții:
	 *		pre: coada este o coadă, T element este un element;
	 *		post: T element este adăugat la END-ul cozii;
	 */
	
	//queue.pop();
	public T ștergeFront();
	/*	Descriere: șterge și RETURNEAZĂ FRONT-UL cozii.
	 * 
	 *	Codiții:
	 *		pre: coada este o coadă, T element elementul de la începutul cozii,
	 *		astfel este chiar primul element adăugat în coadă;
	 *		post: șterge și RETURNEAZĂ FRONT-ul cozii;
	 *			i.e. doar la acesta vom avea acces.
	 *
	 *		aruncă: excepție, dacă coada este vidă.
	 */
	
	//queue.peek sau queue.top;
	public T elementDinFront();
	/*	Descriere: RETURNEAZĂ FRONT-UL cozii, dar NU îl șterge.
	 * 
	 *	Codiții:
	 *		pre: coada este o coadă, T element elementul de la începutul cozii,
	 *		astfel este chiar primul element adăugat în coadă;
	 *		post: RETURNEAZĂ FRONT-ul cozii;
	 *			i.e. doar la acesta vom avea acces.
	 *
	 *		aruncă: excepție, dacă coada este vidă.
	 */
	
	public boolean vidă();
	/*	Descriere: verifică dacă coada este vidă.
	 * 
	 *	Codiții:
	 *		pre: coada este o coadă;
	 *		post: 
	 *			a. retrunrează TRUE, dacă coada nu conține niciun element;
	 *			b. FALSE, dacă are cel puțin un element.
	 */
	
	
	
	/*Observație: Coada nu poate fi iterată, NU are iterator! 
	Nu avem metode de a vedea toate elementele Cozii, doar cel de pe front. 
	Dacă vrem să vedem restul elementelor trebuie să tot ștergem din coadă.*/
	
}
