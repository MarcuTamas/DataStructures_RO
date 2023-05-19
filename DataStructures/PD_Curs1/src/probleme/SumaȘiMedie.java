package probleme;

import java.util.Scanner;

public class SumaȘiMedie {
	public static void sumaȘiMedie() {
		int suma, contor, număr;
		double medie;
		suma = 0;
		medie = 0.0;
		
		for(contor=1; contor <= 10; contor++) {
			Scanner numărCitit = new Scanner(System.in);
			System.out.print("Dați un unumăr: ");
			număr = numărCitit.nextInt();
			suma += număr;
		}
		
		medie = suma/10.0;
		
		System.out.println("Suma este: " + suma);
		System.out.println("Media este: " + medie);
		
		
	}
}
