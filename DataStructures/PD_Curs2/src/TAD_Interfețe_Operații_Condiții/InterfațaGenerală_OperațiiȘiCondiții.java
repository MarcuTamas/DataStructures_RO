package TAD_Interfețe_Operații_Condiții;


public class InterfațaGenerală_OperațiiȘiCondiții {

	public class Condiții{

		/*Condițiile sunt de două feluri:
		 * 1. precondiții = trebuie să fie adevărate înainte de a apela o funcție;
		 * 2. postcondiții = trebuie să fie adevărate după ce funcția se termină.*/
	}

	public interface OperațiiGenerale<T>{
		//Creeăm continerul (TAD).
		public void creează();
			//Descriere: creează un continer vid, prin apelarea constructorul clasei numeContiner;

			/*Condiții:
			 * precondiții: adevărat;
			 * postcondiții: continerul a fost creat, este un Continer vid.
			 */

		//Adăugăm elemente. | numeContiner.adaugă(element);
		public void adaugă();
			//Descriere: adaugă un element în continer. | numeContiner.adaugă(element);

			/*Condiții:
			 * pre: numeContiner este un continer, e este un TElement;
			 * post: elementul a fost adăugăt în numeContiner; 
			 */

		//Ștergem elemente.| numeContiner.șterge(element);
		public void șterge();
			//Descriere: șterge un element din numeContiner.

			/*Condiții:
			 * pre: numeContiner este un continer, e este un TElement;
			 * post: dacă cel puțin o apariție a elementului (în cazul TAD cu ce permit
			 * duplicarea elementelor) a fost ștearsă din continer, operația retrunrează true, 
			 * iar dacă NU a fost șter (NU A EXISTAT ÎN CONTINER) returnează false.
			 */

		//Returnează numărul de elemente din continer.
		public int dimensiune(); 
			//Descriere: returnează numărul de elemente din continer;

			/*Condiții: 
			 * pre: numeContiner este un continer;
			 * post: returnează numărulDeElemente din continer.
			 */


//			int numărulDeElemente = 0;			//Este dimensiunea continerului.
//			return numărulDeElemente;


		//Caută un anumit element. | numeContiner.caută(element);
		public boolean caută();
			//Descriere: verifică dacă un anumit element apare într-un continer;

			/*Condiții:
			 * pre: numeContiner este un continer, e este un TElement;
			 * post: returnează adevărat, dacă elementul apare în continer,
			 * iar în caz contrar fals.
			 */
	}

	public interface AlteOperații<T>{

		//Șterge toate elementele din continer. | numeContiner.goleșteCotiner();
		public void goleșteContiner();

		//Returnează numărul de apariții al unui element. 
		public void aparițiiElement();

		//Verifică dacă continerul este vid.
		public void esteVid();
		
		//Iterator. | numeContiner.iterator();
		public T iterator();
		//Descriere: creează și returnează un iterator pentu continer.
		
		/*Condiții:
		 *	pre: continer este un continer;
		 *	post: 
		 *			a. returnează un iterator (e.g. it);
		 *			b. elementulCurent din it este 
		 *				- „primulElement" din continer;
		 *				- sau dacă continerul este vid, atunci it este invalid.
		 *
		 */

	}
}
