package problemăPortmoneuColecție;

import java.util.Scanner;
import Colecție_PeVectorDinamic.*;


public class OperațiiPortmoneu {
	
	public static void citeșteBancnote(Colecție portmoneu) {
		int valoareBancnotă;
		valoareBancnotă = 1;

		while(valoareBancnotă != 0) {
			System.out.print("Valoarea bancnotei: ");
			Scanner in = new Scanner(System.in);

			valoareBancnotă = in.nextInt();

			if(valoareBancnotă != 0) {			//Evităm să adăugăm ultimul 0 ca valoare.
				portmoneu.adaugă(valoareBancnotă);
			}
		}
	}
	
	
	public static int sumăTotală(Colecție portmoneu) {
		//Portmoneu este o Colecție, în care avem valorile bacnotelor citite.
		
		int suma, bancnotă;
		
		suma = 0;
		
		IteratorColecție iterator = new IteratorColecție(portmoneu);			//Creeăm un iterator peste portmoneu.
		
		//Parcurgem elementele cu ajutorul iteratorului.
		while(iterator.valid()) {							//În română noi am creeat funcția valid();
			bancnotă = (int) iterator.elementCurent();			//Returnăm elementul curent + Trecem la următorul element.
			suma += bancnotă;
			iterator.următor();								
		}
		return suma;
	}
	
	

}
