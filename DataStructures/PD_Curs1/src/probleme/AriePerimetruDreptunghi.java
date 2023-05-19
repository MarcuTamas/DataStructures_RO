package probleme;

import java.util.Scanner;

public class AriePerimetruDreptunghi {
	public static void ariePerimetruDreptunghi() {
		double arie, perimetru;
		
		Scanner citește = new Scanner(System.in);
		
		System.out.println("Cât este lungimea dreptunghiului ?");
		double lungimeDreptunghi = citește.nextDouble();
		
		System.out.println("Cât este lățime dreptunghiului ?");
		double lățimeDreptunghi = citește.nextDouble();
		
		arie = lungimeDreptunghi*lățimeDreptunghi;
		perimetru = 2*(lungimeDreptunghi+lățimeDreptunghi);
		
		System.out.println("Aria este: " + arie + ", perimetrul este: " + perimetru);
	}
}
