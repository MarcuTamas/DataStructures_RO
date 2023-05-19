package problemăPortmoneuColecție;

import java.util.*;

public class OperațiiPortmoneu {

	public static void citeșteBacnote(ColecțiePortmoneu<Integer> portmoneu) {
		int valoareaBacnotei;
		Scanner deCitit = new Scanner(System.in);
		valoareaBacnotei = 1;
		
		
		while(valoareaBacnotei != 0) {
			System.out.print("Valoarea bacnotei: ");
			valoareaBacnotei = deCitit.nextInt();
			portmoneu.adauga(valoareaBacnotei);
		}
		
		int numărElemente = portmoneu.numarulElementelor();
	}
	
	public static int sumăTotală(ColecțiePortmoneu<Integer> portmoneu) {
		//Portmoneu este o Colecție, în care avem valorile bacnotelor citite.
		
		int suma, bancnotă;
		
		suma = 0;
		
		Iterator iterator = portmoneu.iterator();			//Creeăm un iterator peste portmoneu.
		
		//Parcurgem elementele cu ajutorul iteratorului.
		while(iterator.hasNext()) {							//În română noi am creeat funcția valid();
			bancnotă = (int) iterator.next();				//Returnăm elementul curent + Trecem la următorul element.
			suma += bancnotă;
//			iterator.next();								//NU mai trebuie, deoarece mai sus deja am trecut la elementul următor.								
		}
		return suma;
	}
	
}
