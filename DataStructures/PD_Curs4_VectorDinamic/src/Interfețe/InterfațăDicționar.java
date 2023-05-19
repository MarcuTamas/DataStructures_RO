package Interfețe;

import java.util.Collection;
import java.util.Set;

/*	Dicționarul (Map) este un continer în care reținem PERECH sub forma de CHEIE + VALOARE.
 * 		a. Cheile sunt UNICE;
 * 			i.e. NU pot exita perechi cu aceeași cheie,
 * 			chiar dacă ar avea valori diferite
 * 
 * 			!Dacă încercăm să adăugăm o percehe cu o cheie care deja există avem x3 posibilități:
 * 				1. NU se întâmplă nimic (NU modificăm dicționarul);
 * 				2. Aruncăm o excepție (NU modificăm dicționarul);
 * 				3. Suprascriem VALOAREA existentă cu cea transimisă ca și argumetn.
 * 
 * 
 * 		b. NU EXISTĂ POZIȚII, însă vom putea accesa elementele pe baza cheilor.
 * 
 * 		!Reminder: LISTA este singurl TAD care are poziții.
 * 
 * 		!Atenție: dacă vrem să returnăm perechea CHEIE + VALOARE,
 * 		trebuie obt. să folosim ITERATORUL, deoarece funcția caută,
 * 		chiar dacă caută după cheie, RETRUNREAZĂ DOAR VALOAREA.
 */

/*	Iteratorul în cazul dicționarului:
 * 	
 * !Dicționarul în Java NU ARE ITERATOR, însă are dierite operații care returnează o
 * MULȚIME de perechi (cheie + valoare). Acestă Mulțime se numește Map.Entry. 
 * 
 * 	Prin urmare, chiar dacă dicționarul în sine nu are iterator, vom putea totuși itera, dar peste
 * această Mulțime (e un alt TAD) de perechi (cheie + valoare).
 * 
 * 	Map.Entry = este o clasă (TAD MULȚIME) din Java, care reprezintă o pereche cheie + valoare.
 * 		Operații pentru Map.Entry:
 * 							a. getKey() și getValue() = returnează chia, respectiv valoarea;
 * 							b. ITERATOR = iterează peste perechi.
 * 		
 * 
 * 		Sintaxă iterator Map.Entry:
 * 
 * 			//Crearea iteratorului.
 * 			Iterator<Map.Entry<TElement cheie, TElement valoare>> numeIterator = numeDicționar.entrySet().iterator();
 * 
 * 		!v. exemplu din problemăPortmoneuDicționar.
 */

public interface InterfațăDicționar<T> {
	
	public void creează();
	
	public void adaugă(T cheie, T valoare);
	/*	Descriere: adaugă o pereche CHEIE + VALOARE, de tipul TElement.
	 * 
	 *	Codiții:
	 *		pre: dicționarul este un dicționar, cheia și valoarea sunt de tipul TElement,
	 *			însă nimic NU ne împiedică să fie tipuri de date diferie.
	 *						e.g. int cheie, String valoare.
	 *		
	 *		post: perechea cheie + valoare este adăugată în dicționar.
	 *
	 *		!Reminder: cheile sunt unice.
	 *		Dacă încercăm să adăugăm o percehe cu o cheie care deja există avem x3 posibilități:
	 * 				1. NU se întâmplă nimic (NU modificăm dicționarul);
	 * 				2. Aruncăm o excepție (NU modificăm dicționarul);
	 * 				3. Suprascriem VALOAREA existentă cu cea transimisă ca și argumetn.
	 */
	
	public T șterge(T cheie);
	/*	Descriere: șterge PERECHEA și RETURNEAZĂ valoare, deși se transmite ca parametru doar CHEIA.
	 * 
	 *	Codiții:
	 *		pre: dicționar este un dicționar, T cheie este de tip TElement;
	 *		
	 *		post: ȘTREGE PERECHEA și RETURNEAZĂ VALOAREA;
	 */
	
	public boolean caută(T cheie);
	/*	Descriere: CAUTĂ dacă există o PERECHE pentru cheia dată ca parametru + RETURNEAZĂ valoarea, dacă există.
	 *	
	 *	Codiții:
	 *		pre: dicționar este un dicționar, T cheie este de tip TElement;
	 *		
	 *		post: 
	 *			a. DACĂ PERECHE EXISTĂ = CAUTĂ perechea (după cheie) și RETURNEAZĂ valoarea;
	 *			b. DACĂ NU = RETURNEAZĂ NIL (sau NULL).
	 */

	
	public int dimensiune();
	//Returnează numărul de perechi din dicționar.
	
	public T iterator();
	/*	Descriere: creează și returnează un iterator pentu dicționar.
	 * 	Condiții:
	 * 		pre: continer este un continer;
	 * 		
	 * 		post: 
	 * 			a. returnează un iterator (e.g. it);
	 * 			b. elementulCurent din it este 
	 * 				- „primulElement" din continer;			
	 * 				- sau dacă continerul este vid, atunci it este invalid.
	 * 
	 * !REGULĂ:
	 * 	Iteratorul pentru un dicționar funcționează la fel ca iteratorul pentru alte
	 * containere.
	 * 
	 * !EXCEPȚIE:
	 * 	Operația element a ITERATORULUI (v. interfața acestuia) returnează o pereche 
	 * cheie + valoare, iar NU doar valoarea.
	 * 
	 */
	
	
	/*Operații specifice pentru dictionar*/
	
	
	public Set chei();
	/*	Descriere: returnează MULȚIMEA CHEILOR.
	 * 
	 *	Condiții:
	 *			pre: dicționar este un dicționar.
	 *			post: retrunrează o MULȚIME, care conține toate cheile din dicționar.
	 */
	
	//Colecție (Bag), dar care NU există în Java.
	public Collection valori();			
	/*	Descriere: returnează COLECȚIA cheilor.
	 * 
	 *	Condiții:
	 *			pre: dicționar este un dicționar.
	 *			post: retrunrează o COLECȚIE, care conține toate valorile din dicționar.
	 */
}
