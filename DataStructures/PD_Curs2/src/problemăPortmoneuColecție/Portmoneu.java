package problemăPortmoneuColecție;

public class Portmoneu {

	public static void conținutPortmoneu() {
		ColecțiePortmoneu<Integer> portmoneu = new ColecțiePortmoneu<>();
		
		OperațiiPortmoneu.citeșteBacnote(portmoneu);
		
		int suma;
		suma = OperațiiPortmoneu.sumăTotală(portmoneu);
		
		System.out.println("Suma totală în portmoneu este: " + suma);
		
		
	}
	
}
