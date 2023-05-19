package probleme;

import java.util.Scanner;

public class Divizori {
	public static void divizori() {
		int număr;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Dați un număr: ");
		număr = in.nextInt();
		

		
		int[] divizori = new int[număr];			//Tabolul în care reținem divizorii.
		int numărDivizori = 0;						//Numărul de elemente din tabloul divizori.
		int divizorPosibil;
		
		for(divizorPosibil=1; divizorPosibil<număr+1; divizorPosibil++) {
			int rest = număr%divizorPosibil;
			if(rest==0) {
				divizori[numărDivizori] = divizorPosibil;
				numărDivizori += 1;
			}
		}
		
		System.out.println("Numărul de divizori: " + numărDivizori);
		System.out.print("Divizorii sunt: ");
		int divizor;
		for(divizor=0; divizor<numărDivizori; divizor++) {
			System.out.print(divizori[divizor] + " ");
		}
		
	}
}
