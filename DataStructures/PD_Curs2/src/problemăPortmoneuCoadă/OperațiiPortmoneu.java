package problemăPortmoneuCoadă;

import java.util.Queue;
import java.util.Scanner;


public class OperațiiPortmoneu {
	
	public static void citeșteBancnote(Queue<Integer> portmoneu) {
		int valoareBancnotă;
		valoareBancnotă = 1;

		while(valoareBancnotă != 0) {
			System.out.print("Valoarea bancnotei: ");
			Scanner in = new Scanner(System.in);

			valoareBancnotă = in.nextInt();

			if(valoareBancnotă != 0) {			//Evităm să adăugăm ultimul 0 ca valoare.
				portmoneu.add(valoareBancnotă);
			}
		}
	}
	
	
	public static int sumaTotală(Queue<Integer> portmoneu) {
		int suma, valoareBancnotă, valoareSpecială;
		suma = 0;
		
		valoareSpecială = -1;			//Nu există bancnote cu valori negative.
		portmoneu.add(valoareSpecială);
		
		while(portmoneu.peek() != valoareSpecială) {
			valoareBancnotă = portmoneu.poll();
			suma += valoareBancnotă;
			portmoneu.add(valoareBancnotă);
		}
		
		//Portmoneu va începe cu valoareSpecială, nefiind readăugată, este coniderată ca fiind prima adăugată în coadă.
		//Trebuie ștearsă.
		portmoneu.poll();
		
		return suma;
	}
	

}
