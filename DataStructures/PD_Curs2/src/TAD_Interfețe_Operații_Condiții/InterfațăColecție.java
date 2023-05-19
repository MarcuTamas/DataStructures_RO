package TAD_Interfețe_Operații_Condiții;

import java.util.Iterator;

/*Colecția (Bag) este un container în care 
 * elementele se pot repeta și					//Spre deosebire de Mulțime(Set), în care
 * elementele NU au o anumită poziție.			elementele sunt unice.
 * 
 * 												//Spre deosebire de Listă care are poziții,
 * 												iar elementele au o ordine determinată.
 * 
 */

public interface InterfațăColecție<T> {			//Bag.


	//Operații generale.

	//Creeăm colecția.
	public void creează(); 
		/*Descriere: creează o colecție vidă (constructorul clasei Colecție);

		  Condiții:
		   precondiții: adevărat;
		   postcondiții: colecția a fost creată, este o colecție vidă.
		 */

	//Adăugăm elemente. | colecție.șterge(element);
	public void adaugă(T elementDeAdăugat);
		/*Descriere: adaugă un element în colecție. | colecție.adaugă(element);

		  Condiții:
		   pre: colecție este o colecție, e este un TElement;
		   post: elementul a fost adăugăt în colecție; 
		 */

	//Ștergem elemente.| colecție.adaugă(element);
	public boolean șterge(T elementDeȘters);
		/*Descriere: șterge un element din colecție.

		  Condiții:
		   pre: colecție este o colecție, e este un TElement;
		   post: dacă cel puțin o apariție a elementului a fost ștearsă din colecție, 
		   operația retrunrează true (în cazul colecției pot exista duplicate), 
		   iar dacă NU a fost șter (NU A EXISTAT ÎN COLECȚIE) returnează false.
		 */

	//Returnează numărul de elemente din colecție.
	public int dimensiune();
		/*Descriere: returnează numărul de elemente din colecție;

		  Condiții: 
		   pre: colecție este o colecție;
		   post: returnează numărulDeElemente din colecție.
		 

		int numărulDeElemente = 0;			//Este dimensiunea colecției.
		return numărulDeElemente;
		 */
	
	
	//Caută un anumit element. | colecție.caută(element);
	public boolean caută(T elementDeGăsit);
		/*Descriere: verifică dacă un anumit element apare într-o colecție;

		  Condiții:
		   pre: colecție este o colecție, e este un TElement;
		   post: returnează adevărat, dacă elementul apare în colecție,
		   iar în caz contrar fals.
		 */

	public T iterator();
		/*Descriere: creează și returnează un iterator pentu colecție.
	
		  Condiții:
		  	pre: continer este un continer;
		  	post: 
		  			a. returnează un iterator (e.g. it);
		  			b. elementulCurent din it este 
		  				- „primulElement" din continer;
		  				- sau dacă continerul este vid, atunci it este invalid.
		 
		 */

	
	
	
	/*Alte operații posibile.*/
	//Șterge toate elementele din colecție.
	public boolean goleșteColecția(); 

	//Returnează numărul de apariții al unui element.
	public int aparițiiElement(T element);

	//Verifică dacă colecția este vidă.
	public boolean esteVidă();
}
