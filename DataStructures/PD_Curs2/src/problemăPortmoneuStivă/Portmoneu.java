package problemăPortmoneuStivă;

import java.util.Stack;

public class Portmoneu {
	public static void conținutPortmoneu() {
		Stack<Integer> portmoneu = new Stack<Integer>();
		
		OperațiiPortmoneu.citeșteBancnote(portmoneu);
		
		int suma;
		suma = OperațiiPortmoneu.sumăTotală(portmoneu);
		
		System.out.println("Suma totală în portmoneu este: " + suma);
		
	}
}
