package Interfețe;

/* 	Stivă (Stack) este un continer unde accesul la elemente este restricționat
 * la un singur capăt al acestuia.
 * 	Astfel, vom avea acces doar la VÂRFUL stivei.
 * 		i.e. adăugarea/ștergerea/accesarea unui element se produce DOAR la vârful stivei.
 * 
 *	PRINCIPIU APLICABIL = LIFO (Last In First Out).				//Spre deosebire de coadă (FIFO).
 *	
 *	Spre deosebire de Colecție, Mulțime și Listă, în cazul Stivei
 * NU AVEM metode de a itera elementele acesteia = NU avem iterator.
 * 
 * 	De altfel, se ASEMĂNĂ cu coada și coadaCuPriorități, deoarece nici ele
 * NU au iterator, iar numele operațiilor sunt aceleși.
 * 
 * 	Totuși se diferențiază de coadă și coada cu priorități, deoarece în cazul
 * stivei avem acces doar la un singur capăt al continerului, respectiv VÂRFUL
 * acesteia, unde se găsește ultimul element adăugat, iar la celălte continere
 * amintite avem acces la AMBELE CAPETE, respectiv FRONT și END.
 * 	i.e. end = adăugăm element;
 * 		 FRONT = ștergem și accesăm element.										
 *
 */

public interface InterfațăStivă<T> {

	public void creează();
	
	//stack.push();
	public void adaugă(T element);
	/*	Descriere: adaugă un element la VÂRFUL stivei.
	 * 
	 *	Codiții:
	 *		pre: stiva este o stivă, T element este un element;
	 *		post: T element este adăugat la VÂRFUL stivei;
	 *			i.e. doar la acesta vom avea acces.
	 */
	
	//stack.pop();
	public T șterge();
	/*	Descriere: șterge și RETURNEAZĂ VÂRFUL stivei.
	 * 
	 *	Codiții:
	 *		pre: stiva este o stivă, T element este element recent adăugat în stivă;
	 *		post: șterge VÂRFUL stivei;
	 *			i.e. doar la acesta vom avea acces.
	 *
	 *		aruncă: excepție, dacă stiva este vidă.
	 */
	
	//stack.peek sau stack.top;
	public T element();
	/*	Descriere: RETURNEAZĂ vârful stivei (FĂRĂ să îl șteargă).
	 * 
	 *	Codiții:
	 *		pre: stiva NU este viđă;
	 *		post: retrunrează VÂRFUL stivei, care este cel mai recent element;
	 *			i.e. doar la acesta vom avea acces.
	 *
	 *		aruncă: excepție, dacă stiva este vidă.
	 */
	
	public boolean vidă();
	/*	Descriere: verifică dacă stiva este vidă.
	 * 
	 *	Codiții:
	 *		pre: stiva este o stivă;
	 *		post: 
	 *			a. retrunrează TRUE, dacă stiva nu conține niciun element;
	 *			b. FALSE, dacă are cel puțin un element.
	 */
}