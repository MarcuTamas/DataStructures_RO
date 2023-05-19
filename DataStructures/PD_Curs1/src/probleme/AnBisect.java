package probleme;

import java.util.Scanner;

public class AnBisect {
	public static void anBisect() {
		int an, rezultat;
		Scanner citeșteAn = new Scanner(System.in);
		
		
		System.out.println("Introduceți anul: ");
		an = citeșteAn.nextInt();
		rezultat = 365;
		
//		Un an este bisect dacă este divizibil cu 4 și nu este divizibil cu 100, sau dacă este fivizibil cu 400.
		if (an%400==0 || (an%4==0 && an%100 != 0)) {
			rezultat = 366;
		}
		
		System.out.println("Numărul de zile este " + rezultat);
		
	}
}
