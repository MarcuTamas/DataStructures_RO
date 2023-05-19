package probleme;

import java.util.Scanner;

public class SumaLiniiColoane {
	public static void sumaLiniiColoane() {
		int numărLinii, numărColoane, i, j;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Dimensiunile matricii.");
		
		System.out.print("Introduceți numărul de linii: ");
		numărLinii = in.nextInt();
		
		System.out.print("Introduceți numărul de coloane: ");
		numărColoane = in.nextInt();
		
		int[][] matrice = new int[numărLinii][numărColoane];
		
		//Citim elementele matricii.
		for(i=0; i<numărLinii; i++) {			//For pentru linii.
			for(j=0; j<numărColoane; j++) {			//For coloane.
				System.out.println("Elementul de pe poziția " + i + " " + j);
				matrice[i][j] = in.nextInt();
			}
		}
		
		int sumaLinii, sumaColoane;
		sumaLinii = 0;
		sumaColoane = 0;
		
		//Parcurgem matricea pentru a calcula sumele.
		for(i=0; i<numărLinii; i++) {
			for(j=0; j<numărColoane; j++) {
				if(i%2==0) {								//Dacă este line pară.
					sumaLinii += matrice[i][j];
				}
				if(j%2==1) {								//Dacă este coloană impară.
					sumaColoane += matrice[i][j];			
				}
			}
		}
		
		System.out.println("Suma liniilor pare: " + sumaLinii);
		System.out.println("Suma coloanelor impare: " + sumaColoane);
		
	}
	
}
