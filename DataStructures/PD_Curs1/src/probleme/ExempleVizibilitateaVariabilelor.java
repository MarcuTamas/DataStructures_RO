package probleme;

public class ExempleVizibilitateaVariabilelor {

	public static void exemplu1() {
		int început, sfârșit, i;
		început = 6;
		sfârșit = 13;
		
		for(i=început; început<sfârșit; i++) {
			int contor = 0;
			
			if(i%2==0) {
				contor += 1;
				System.out.println("Numere pare găsite până acum: " + contor);
			}
		}
		
//		System.out.println("Total numere pare: " + contor);
		
	}
	
	public static void exemplu2() {
		int număr, numărPași;
		număr = 129;
		numărPași = 0;
		
		while(număr>50) {
			System.out.println("Numărul: " + număr);
			int rest;
			rest = număr%2;
			număr=(număr+rest)/2;
			numărPași += 1;
		}
		
		System.out.println("A fost nevoid de " + numărPași + " pași");
		
	}
	
}
