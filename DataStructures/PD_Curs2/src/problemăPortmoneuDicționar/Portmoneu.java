package problemăPortmoneuDicționar;

import java.util.*;

public class Portmoneu {
	public static void conținutPortmoneu() {
		Map<Integer, Integer> portmoneu = new HashMap<Integer, Integer>();
		
		OperațiiPortmoneu.citeșteBancnote(portmoneu);
		
		int suma;
		suma = OperațiiPortmoneu.sumaTotală(portmoneu);
		
		System.out.println("Suma totală în portmoneu este: " + suma);
	
	}	
}
