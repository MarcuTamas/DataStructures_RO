package problemăPortmoneuDicționar;

import java.util.Iterator;
import java.util.Scanner;

import Dicționar_PeVectorDinamic.Dicționar;

public class OperațiiPortmoneu {
	public static void citeșteBancnote(Dicționar portmoneu) {
		int valoareBancnotă, numărVechi;
		valoareBancnotă = 1;
		int cheie = 0;
		
		while(valoareBancnotă != 0) {
			System.out.print("Valoarea bancnotei: ");
			Scanner in = new Scanner(System.in);
			valoareBancnotă = in.nextInt();
			portmoneu.adaugă(cheie, valoareBancnotă);
		}
	}
	
//	public static int sumaTotală(Dicționar portmoneu) {
//		int suma, valoareBancnotă, numarulBancnotelor;
//		suma = 0;
//		
//		//Creeăm iteratorul peste Mulțimea de perechi.
//		Iterator<Dictionar.Entry<Integer, Integer>> it = portmoneu.entrySet().iterator();
//		
//		while(it.hasNext()) {
//			Dictionar.Entry<Integer, Integer> pereche = it.next();			//Returnăm o pereche.
//			suma += (pereche.getKey()*pereche.getValue());
//			//Nu mai trebuie iterator.next, deoarece funcția next returnează elementul curent și trece la următorul.
//		}
//		return suma;
//	}
	
}
