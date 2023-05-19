package probleme;

import java.util.Scanner;

public class SumeEgale {

	public static int sumaÎntrePoziții(int[] tablou, int start, int end) {
		int suma, i;
		suma = 0;
		
		for(i=start; i<=end; i++) {
			suma += tablou[i];
		}
		
		return suma;
	}
	
	public static void sumeEgale() {
		int numărulDeNumere, i, pozițiaGăsită, sumăStânga, sumăDreapta;
		Scanner cit= new Scanner(System.in);
		
		System.out.print("Dați numărul de numere: ");
		
		numărulDeNumere = cit.nextInt();
		
		int[] elemente = new int[numărulDeNumere];
		
		for(i=0; i<numărulDeNumere; i++) {
			System.out.println("Elementul de pe poziția " + i);
			elemente[i] = cit.nextInt();
			
		}
		
		pozițiaGăsită = -1;			//Aceasta înseamnă că nu am găsit o poziție.
		
		for(i=0; i<numărulDeNumere; i++) {
			sumăStânga = sumaÎntrePoziții(elemente, 0, i-1);
			sumăDreapta = sumaÎntrePoziții(elemente, i+1, numărulDeNumere-1);
			
			if(sumăStânga == sumăDreapta) {
				pozițiaGăsită = i;			//Suprascriem poziția dacă găsim una corectă.
			}
		}
		
		if(pozițiaGăsită == -1) {
			System.out.println("Nu există poziție.");
		}else {
			System.out.println("Poziția: " + pozițiaGăsită);
		}
	}
	
}
