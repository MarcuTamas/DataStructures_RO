package problemăPortmoneuListă;

import java.util.ArrayList;
import java.util.List;

public class Portmoneu {
	public static void conținutPortmoneu() {
		List<Integer> portmoneu = new ArrayList<Integer>();
		OperațiiPortmoneu.citeșteBancnote(portmoneu);
		
		int suma;
		suma = OperațiiPortmoneu.sumaTotală(portmoneu);
		
		System.out.println("Suma totală în portmoneu este: " + suma);
	}
	
}
