package probleme;

import java.util.Scanner;

public class SumaȘiMedie2 {
	public static void sumaȘiMedie2() {
		int suma, contor, număr, câte;
		double medie;
		Scanner cit = new Scanner(System.in);
		
		
		suma = 0;
		medie = 0.0;
		
		System.out.println("Numărul de numere care vor fi citite: ");
		câte = cit.nextInt();
		
		for(contor=1; contor<=câte; contor++) {
			System.out.print("Dați un număr: ");
			număr = cit.nextInt();
			suma += număr;
		}
		
		//Evităm împărțirea la 0.
		if(câte != 0) {
			medie = suma/(câte*1.0);			//Forțăm împărțire cu un număr real.
		}
		
		System.out.println("Suma este: " + suma);
		System.out.println("Media este: " + medie);
		
	}
}
