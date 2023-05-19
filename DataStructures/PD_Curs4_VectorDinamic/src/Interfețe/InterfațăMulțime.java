package Interfețe;

import java.util.Iterator;

/*Mulțimea (Set) este un container în care 
 * elementele sunt UNICE = NU se pot repeta și					//Spre deosebire de Colecție(Bag), 
 * elementele NU au o anumită poziție.							în care elementele se pot repeta.
 * 
 * 																//Spre deosebire de Listă care are poziții,
 * 																iar elementele au o ordine determinată.
 * 
 */

public interface InterfațăMulțime<T> {

	public void creează();
	
	public void adaugă(T elementDeAdăugat);	//mulțime.adaugă(T element);
	/*Descriere: aduagă un element în mulțime, DACĂ NU EXISTĂ;
	
	  Condiții:
	  	pre: mulțimea este o Mulțime, T element este un element;
	  	post: 
	  			a. elementul a fost adăugat în Mulțime, numai dacă acesa NU a existat;
	  			b. dacă elementul a fost adăugat operația returnează true,
	  			iar dacă nu false.
	 */
	
	public boolean șterge(T elementDeȘters);
	/*Descriere: ștege un element din mulțime;
	
	  Condiții:
	  	pre: mulțimea este o Mulțime, T element este un element;
	    post: 
	  			a. elementul a fost șters din mulțime, dacă a existat;
	  			b. retrunează true dacă a fost șters, iar dacă nu a 
	  			existat (nu a fost șters) false. 
	 */
	
	public int dimensiune();
	
	public boolean caută(T elementDeCăutat);

	Iterator<T> iterator();
	
}
