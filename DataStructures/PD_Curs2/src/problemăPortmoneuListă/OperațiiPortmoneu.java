package problemăPortmoneuListă;

import java.util.List;
import java.util.Scanner;

public class OperațiiPortmoneu {

	public static void citeșteBancnote(List<Integer> portmoneu) {
		int valoareBancnotă;
		valoareBancnotă = 1;
		
		while(valoareBancnotă != 0) {
			System.out.print("Valoarea bancnotei: ");
			Scanner in = new Scanner(System.in);
			valoareBancnotă = in.nextInt();
			
			if(valoareBancnotă != 0) {			//Evităm să adăugăm ultimul 0 în portmoneu.
				portmoneu.add(valoareBancnotă);
			}
		}
	}
	
	public static int sumaTotală(List<Integer> portmoneu) {
		//Portmoneu este o listă în care avem bancnote, reținute ca numere întregi.
		
		int suma, valoareBancnotă, i;
		
		suma = 0;
		
		/*În general, când iteratorul poate fi folosit, preferăm să-l folosim , dar acum
		vom face o parcurgere cu poziții (parcurgerea cu iterator este exact la fel ca la
		Colectție sau Mulțime).*/
		
		
		for(i=0; i<portmoneu.size(); i++) {
			valoareBancnotă = portmoneu.get(i);			//listă.element(int poziție);
			System.out.println("Valoare curentă: " + valoareBancnotă);
			
			suma += valoareBancnotă;
		}
		
		return suma;
	}
	
}
