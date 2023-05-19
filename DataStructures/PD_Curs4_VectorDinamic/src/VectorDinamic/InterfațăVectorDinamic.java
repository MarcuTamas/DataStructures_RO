package VectorDinamic;

public interface InterfațăVectorDinamic<T> {
	/*	Reprezentare | x3 atribute.
	 * 		int capacitate;					//Numărul maxim de elemente care poate fi stocat;
	 * 		int numărulElementlor;			//Numărul efectiv de elemente;
	 * 		T[] elemente;					//Vectorul efectiv în care reținem elementele.
	 * 
	 * 	!ATENȚIE: T[] elemente = new T[capacitate;
	 * 
	 * 	În Java nu putem avea un vector generic de TElement, deoarece vectorul
	 * conține pe timpul de rulare informații despre tipul de date stocate pentru
	 * a aloca memorie suficientă (în heap).
	 */
	
	//Operații pe vectorDinamic.
	public void creează();				
	
	public void adaugă(T elementDeAdăugat);		
	/*	Complexitate: 
	 * 			a. θ(1)  | caz FAVORABIL, când am spațiu liber în vector: θ(1), pentru că adăugăm întotdeauna la final.
	 *  		b. θ(1)A | caz DEFAVIRABIL, când intră în if și trebuie să relocăm și să copiem 
	 *  		elementele. Astfel, în mod normal ar fi un θ(n), însă acest lucru se întâmplă
	 *  		destul de rare (pentru că trebuie să ajungă la capacitate) și din acet motiv
	 *  		putem spune că are o complexitate de θ(1) AMORTIZAT.
	 *  		
	 */
	
	public void adaugăPoziție(T elementDeAdăugat, int poziție);
	/* Complexitate:
	 * 			a. COMPLEXITATE TOTALĂ = O(n);
	 * 			b. Caz favorabil: θ(1), adăugăm la final.
	 * 			c. Caz defavorabil: θ(n).
	 * 						1. dacă trebuie să redimensionăm (am ajuns la capacitate);
	 * 						   sau
	 * 						2. dacă poziția pe care adăugăm este chiare v[0], respectiv
	 * 						începutul vectorului și atunci trebuie să mutăm la dreapta
	 * 						toate elementele existente.
	 * 			d. Caz mediu: θ(n), deoarece aproape tot timpul trebuie să mutăm anumite elemente.
	 */
	
	public T ștergePoziție(int poziție);
	/*	Când dorim ștergerea unui element de pe o anumită poziție,
	 * trebuie să fim atenți ca poziția să fie validă și astfel,
	 * spre deosebire de adăugarePoziție, unde verificăm ca acasta
	 * să nu fie strict mai mare ca numărulElementelor, în cazul
	 * ștergerii trebuie să verificăm să nu fie mai mare sau egal,
	 * deoarece numărulElementelor, în mod corect NU ar trebui să
	 * rețină nicio valoare, fiind finalul vectorului sau primul loc
	 * liber.
	 * 
	 * !Atenție, nu trebuie să uităm să decrementăm numărul elementelor.
	 * 
	 * Complexitate:
	 * 			O(n), deoarece va trebui să mutăm elementele la stânga.
	 */
	
}
