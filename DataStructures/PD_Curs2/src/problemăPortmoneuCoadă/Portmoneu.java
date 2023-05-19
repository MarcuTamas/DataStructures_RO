package problemăPortmoneuCoadă;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Portmoneu {
	public static void conținutPortmoneu() {
		Queue<Integer> portmoneu = new LinkedList<Integer>();
		
		OperațiiPortmoneu.citeșteBancnote(portmoneu);
		
		int suma;
		suma = OperațiiPortmoneu.sumaTotală(portmoneu);
		
		System.out.println("Suma totală în portmoneu este: " + suma);
		
	}
}
