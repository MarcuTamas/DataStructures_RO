package problemăPortmoneuStivă;

import java.util.Scanner;
import java.util.Stack;

public class OperațiiPortmoneu {

	public static void citeșteBancnote(Stack<Integer> portmoneu) {
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
	
	public static int sumăTotală(Stack<Integer> portmoneu) {
		int suma, valoareBancnotă;
		suma = 0;
		Stack<Integer> stivăAuxiliară = new Stack<Integer>();
		
		//Cât timp stiva nu este goală.
		while(!portmoneu.empty()) {
			valoareBancnotă = portmoneu.pop();
			suma += valoareBancnotă;
			stivăAuxiliară.add(valoareBancnotă);			//Salvăm vârful scos în stivă temporară.
		}
		
		//Mutăm elementele scoare înapoi în stiva.
		while(!stivăAuxiliară.empty()) {
			valoareBancnotă = stivăAuxiliară.pop();
			portmoneu.add(valoareBancnotă);
		}
		
		return suma;
	}
	
}
