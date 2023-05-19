package TAD_Interfețe_Iterator;

/*Iteratorul este un tip abstract de date - TAD, implementat separat de container,
 *folosit pentru a parcurge (itera) elementele unui container.
 *Iteratorul este o structură care 
 *	este creat pentru un container (nu există iterator fără un container);
 *	cunoaște reprezentarea containerului și 
 *	conttine un element curent din container.
 */

/* Nu au iterator: 							//În rest toate TAD au iterator.
 * 			a. Coada;
 * 			b. Stiva;
 * 			c. Coada cu priorități.
 */

/*Cunoaște: elementul curent;
 * Operații:
 * 			a. returnează elementul curent;
 * 			b. trece la următorul element curent.
 */

public interface InterfațăIterator<T> {

	/*Operații generale pentru iteratorul UNIDIRECȚIONAL x4.
	 
	   Acesta: 
	  			a. se deplasează doar într-o singură direcție, spre înainte și
	  			b. NU modifică continerul, ci doar RETURNEAZĂ elementele din el (read-only).
	 */
	
	public void creeazăIterator(/*numeContiner*/);
	/*Descriere: 
	   creează un iterator nou, prin apelarea constructorul clasei Iterator;
	   TREBUIE să furnizăm containerul pentru care se creează iteratorul.
	 

	  Condiții:
	  	precondiții: numeContiner reprezintă un continer peste care vom itera;
	  	postcondiții: creează un iterator pentru containerul numeContiner. 
	   
	    Elementul curent din iterator este primul" element din numeContiner, 
	   sau, dacă numeContiner este vid, iteratorul este invalid.
	 */

	
	/*ATENȚIE:
	 * 	Funcția NEXT din Java include atât element(); cât și următor().
	 * 			a. returnează elementul curent ȘI
	 * 			b. trece la următorul element.
	 * 
	 * 	Prin urmare în instrucțiunea while, este suficient să folosim next o singură dată,
	 * deoarece aceasta va returna elementul curent și va trece în mod implicit la următorul element.
	 * 
	 * 	În caz contrar riscăm să primim eroarea out of bounds, deoarece nu mai sunt elemente 
	 * peste care să iterăm.
	 */
	
	public void element(); //Inclusă de funcția next; 
	/*Descriere: returnează elementul curent din iterator.

	  Condiții:
	   	precondiții: iterator este un iterator valid (are elemente);
	  	postcondiții: returnează elemntul curent din iterator.  
	 */

	public void următor(); //Inclusă de funcția next;
	/*Descriere: 
	   trece la următorul element din numeContiner;
	   elementul curent din numeContiner: 
	   			a. devine URMĂTORUL ELEMENT din acesta;
	  			b. sau dacă NU mai sunt elemente, iteratorul devine invalid.
	 

	  Condiții:
	   pre: iteratorul este un iterator valid;
	   post: 
	   			a. elementul curent din iterator devine URMĂTORUL ELEMENT din numeContiner;
	   			b. dacă NU mai există un alt element, atunci iteratorul devine invalid.
	 */
	
	public boolean valid(); //Funcția hasNext;											
	/*Descriere: verifică dacă mai sunt elemente în iterator.
	
	  Condiții:
	   pre: iterator este un iterator valid (are elemente);
	   post:
	   			a. returnează adevărat, dacă elementul curent există;
	  			b. returnează fals, dacă nu există (iteratorul este invalid).
	 */
	
}
