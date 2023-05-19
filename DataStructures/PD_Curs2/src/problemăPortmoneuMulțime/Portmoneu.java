package problemăPortmoneuMulțime;

import java.util.*;

public class Portmoneu {
	public static void conținutPortmoneu() {
		Set<Bancnotă> portmoneu = new HashSet<Bancnotă>();
		
		OperațiiPortmoneu.citeșteBancnote(portmoneu);
		
		int suma;
		suma = OperațiiPortmoneu.sumaTotală(portmoneu);
		
		System.out.println("Suma totală este: " + suma);
		
		
	
	}
}
