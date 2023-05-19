package problemăPortmoneuMulțime;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class OperațiiPortmoneu {

	public static void citeșteBancnote(Set<Bancnotă> portmoenu) {
		int valoare;
		valoare = 1;
		
		Scanner deCitit = new Scanner(System.in);
		
		while(valoare != 0) {
			System.out.print("Valoarea bancnotei: ");
			valoare = deCitit.nextInt();
			
			if(valoare != 0) {
				String serie;
				System.out.print("Seria bancnotei: ");
				serie = deCitit.next();
				
				Bancnotă bancnotă = new Bancnotă();
				bancnotă.serie = serie;					//Merge și fără setters și gheteers, deoarece variabilele nu sunt private.
				bancnotă.valoare = valoare;
				
				portmoenu.add(bancnotă);
			}
		}
	}
	
	public static int sumaTotală(Set<Bancnotă> portmoneu) {
		//Portmoneu este mulțime în care avem bancnote.
		
		int suma;
		Bancnotă bancnotă = new Bancnotă();
		suma = 0;
		
		Iterator iteratorPestePortmoneu = portmoneu.iterator();			//Reminder, portmoneu este o mulțime de bancnote.
		
		while(iteratorPestePortmoneu.hasNext()) {
			bancnotă = (Bancnotă) iteratorPestePortmoneu.next();
			suma += bancnotă.valoare;	
			//Atât, deoarece hasNext, returnează elementul curent și Trece automat la elementul următor.
		}
		
		return suma;
		
	}
	
	
}
