package probleme;

import java.util.Scanner;

public class NumereMaiMIciCaMedie {
	public static void numereMaiMiciCaMedie() {
		int suma, numărulDeNumere, contor;
		Scanner in = new Scanner(System.in);
		
		suma = 0;
		
		System.out.print("Numărul de numere: ");
		numărulDeNumere = in.nextInt();
		
		int[] element = new int[numărulDeNumere];
		
		for (contor=0; contor<numărulDeNumere; contor++) {
			System.out.print("Dați un număr: ");
			element[contor] = in.nextInt();
			suma += element[contor];
		}
		
		double medie;
		medie = 0.0;
		
		if(numărulDeNumere != 0) {
			medie = suma / (numărulDeNumere*1.0);
		}
		
		int rezultat;
		rezultat = 0;
		
		for(contor=0; contor<numărulDeNumere; contor++) {
			if(element[contor] < medie) {
				rezultat += 1;
			}
		}
		
		System.out.println("Sunt " + rezultat + " numere mai mici ca media");
	}
	
}
