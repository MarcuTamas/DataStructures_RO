package TAD_Interfețe_Operații_Condiții;

import java.util.Iterator;

/*Lista (List) reprezintă o secvență de elemente:
 * 			a. aflate într-o anumită ORDINE;								//Elementele noi se adaugă:
 * 																						1. la final sau
 * 																						2. pe o poziție dată.
 * 					
 * 			b. AVĂND O POZIȚIE BINE DETERMINATĂ în cadrul listei.			//Spre deosebire de Colecție și Mulțime
 * 																			care NU au poziții.
 * 			!Lista este SINGURUL continer cu poziții.
 */					


public interface InterfațăListă<T> {

	public void creează();

	public void adaugăLaSfârșit(T elementDeAdăugat);
	/*Descriere: aduagă un element nou, la sfârșitul listei.

		Condiții:
	  	pre: lista este o liștă, T element este un element;
	  	post: 
	  			a. elementul a fost adăugat în lisța;
	  			b. acesta este ultimulElement din listă;
	 */

	//!Atenție: x2 parametrii element + poziție.
	public void adaugăPePoziție(int pozițieUndeAdăugăm, T elementDeAdăugat);
	/*Descriere: aduagă un element pe poziția dată din listă;

	  Condiții:
	  	pre: 
	  		a. lista este o liștă, T element este un element, poziție este un întreg;
	  		b. 0 <= poziție <= listă.lungime; | Reprezintă o poziție validă de a adăuga un element.
	  	
	  	post: 
	  			a. elementul a fost adăugat în lisța la poziția specificată;
	  			b. elementele din listă începând cu cel de la poziția indicată
	  			vor fi mutate cu o poziție mai în spate (shiftare) = mai sus (->).
	  			
	  	aruncă: excepție dacă poziția nu este validă.
	 */
	
	public boolean ștergeDupăElement(T elementDeȘters);
	/*Descriere: ștege PRIMA APARIȚIE a unui element din listă (deoarece lista permite elemente duplicate);

	  Condiții:
	  	pre: lista este o listă, T element este un element;
	    post: 
	  			a. prima apariție a elementului a fost ștersă din mulțime;
	  			b. retrunează true dacă a fost șters, iar dacă nu a 
	  			existat (nu a fost șters) false. 
	  			c. elementele de după cel șters sunt mutate în față cu o poziție (<-);
	  			
	  	aruncă: excepție dacă poziție nu este o poziție vidă.		
	 */
	
	public boolean ștergeDupăPoziție(int pozițieDeȘters);
	/*Descriere: ștege un element DE PE O POZIȚIE DATĂ din listă (deoarece lista permite elemente duplicate);

	  Condiții:
	  	pre:
	  		a. lista este o liștă, T element este un element, poziție este un întreg;
	  		b. 0 <= poziție <= listă.lungime; | Reprezintă o poziție validă de a adăuga un element. 
	    
	    post: 
	  			a. prima apariție a elementului a fost ștersă din mulțime;
	  			b. retrunează true dacă a fost șters, iar dacă nu a 
	  			existat (nu a fost șters) false. 
	  			c. elementele de după cel șters sunt mutate în față cu o poziție (<-);
	  			
	  	aruncă: excepție dacă poziție nu este o poziție vidă.	
	 */

	//list.get(i);
	public T elementDePePoziție(int pozițiaElementului);			//T = tipul de date ce urmează a fi retrunat.
	/*Descriere: returnează elementul de pe o poziție dată.
	 
	  Condiții:
	  	pre:
	  		a. lista este o liștă, T element este un element, poziție este un întreg;
	  		b. 0 <= poziție <= listă.lungime; | Reprezintă o poziție validă de a adăuga un element.
	  	
	    post: element returnează elemntul de pe poziția dată.
	  			
	  	aruncă: excepție dacă poziție nu este o poziție vidă.	
	 */
	
	public T modificăElementDePePoziție(int pozițiaElementului, T elementDeModificat);
	/*Descriere: modifică valoarea unui element de pe o poziție dată.
	 
	  Condiții:
	  	pre:
	  		a. lista este o liștă, T element este un element, poziție este un întreg;
	  		b. 0 <= poziție <= listă.lungime; | Reprezintă o poziție validă de a adăuga un element.
	  	
	    post: 
			a. valoarea elementului devine valoarea T element, dat ca parametru;
			b. modifică + RETURNEAZĂ valoarea veche a elementului de pe poziția dată.
	  			
	  	aruncă: excepție dacă poziție nu este o poziție vidă.	
	 */
	
	//list.indexOf(T element);
	public int pozițieLaCareSeGăseșteElementul(T elementul); 
	/*Descriere: returnează PRIMA POZIȚIE pe care se găsește T elemen, dat ca parametru.		//Lista permite elemente duplicate.
	 
	  Condiții:
	  	pre: lista este o liștă, T element este un element, poziție este un întreg;
	  	
	    post:
	    	a. poziție returnează prima poziție unde se găsește T element;
	    	b sau -1 dacă nu se găsește în listă.
	 */
	
	public boolean cautăElement(T elementDeGăsit);
	/*Descriere: verifică dacă un element se găsește în listă.
	 
	  Condiții:
	  	pre: lista este o liștă, T element este un element;
	  	
	    post:
	    	a. caută returnează ADEVĂRAT, dacă găsește T element;
	    	b sau FALS dacă nu se găsește în listă.
	 */
	
	public boolean esteVidă();
	/*Descriere: verifică dacă lista este vidă.
	 
	  Condiții:
	  	pre: lista este o liștă;
	  	
	    post:
	    	a. esteVidă returnează ADEVĂRAT, dacă lista NU conține niciun element;
	    	b sau FALS dacă acesta conține cel puțin un element.
	 */
	
	public int dimensiune();
	//Returnează numărul de elemente din listă.

	Iterator<T> iterator();



}
