package TAD_Interfețe_Operații_Condiții;

import java.util.Collection;
import java.util.Set;

/* 	În Java NU exisța MultiDicționar implementat.
 * 		Dacă avem nevoie de un MultiDicționar, vom putea folosi un Dicționar simplu,
 * 	   dar care se aibă ca VALOARE asociată cheii o Listă de valori.
 * 	
 * 	MultiDicționarul(MultiMap) este tot un Dicționar,
 * dar care poate să aibă mai multe valori asociate unei 
 * chei, dar care rămâne unică.
 * 
 * Pe de altă parte are operații similare cu Dicționarul, însa parametrii
 * sau valorile returnate pot să difere, datorită posibilității de a avea
 * mai multe valori pentru o singură cheie.
 * 			e.g. iteratorul.element apelat consecutiv va returna cheie + valoare,
 * 			la fiecare apel returânând consecutiv o altă valoare asociată cheii.
 * 
 * 	!Ordinea elementelor (ca la toate TAD. în afară de Listă)
 * nu contează, deoarece NU avem poziții.
 */

public interface InterfațăMultiDicționar<T> {
	
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
	 *		!Reminder: cheile sunt unice, DAR în cazul MultiDicționarului pot avea mai multe valori.
	 *		
	 *		Dacă încercăm să adăugăm o percehe cu o cheie care deja există:
	 *			VALOAREA SE ADAUGĂ ÎN DICȚIONAR LA ACEA CHEIE,chiar dacă aceasta mai avea alte valori.
	 */
	
	public T șterge(T cheie);
	/*	Descriere: șterge PERECHEA și RETURNEAZĂ o valoare de adevăr.
	 * 
	 *	Codiții:
	 *		pre: dicționar este un dicționar, T cheie este de tip TElement;
	 *		
	 *		post: ȘTREGE PERECHEA și RETURNEAZĂ TRUE dacă a fost ștearșă și FALES dacă nu (e.g. nu a existat);
	 */
	
	public boolean caută(T cheie);
	/*	Descriere: CAUTĂ dacă există o PERECHE pentru cheia dată ca parametru 
	 * 				 + 
	 * 			   RETURNEAZĂ LISTA tuturor valorile, asociate acelei chei.
	 *	
	 *	Codiții:
	 *		pre: dicționar este un dicționar, T cheie este de tip TElement;
	 *		
	 *		post: 
	 *			a. DACĂ PERECHE EXISTĂ = CAUTĂ perechea (după cheie) și RETURNEAZĂ LISTA valorilor asociate cheii;
	 *			b. DACĂ NU = RETURNEAZĂ O LISTĂ VIDĂ.
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
	 * 	La MultiDicționar, va returna doar o singură valoare pentru cheie, însă la
	 * apelul conescutiv a acesteia va returna următoarea valoare, desigur, dacă chiea are
	 * asociată mai multe valori.
	 */
	
	
	/*Operații specifice pentru dictionar*/
	
	//Mulțime (Set).
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
