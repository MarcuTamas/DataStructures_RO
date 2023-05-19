package probleme;

import java.util.Scanner;

public class CamelCase {
	public static void camelCase() {
		String cuvânt;
		int numărCuvinte, pozițiaCurentă;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Dați stringul: ");
		cuvânt = in.nextLine();
		
		numărCuvinte = 1;			//Sigur există cel puțin un cuvânt.
		
		for(pozițiaCurentă = 1; pozițiaCurentă<cuvânt.length(); pozițiaCurentă++) {
			if(cuvânt.charAt(pozițiaCurentă) >= 'A' && cuvânt.charAt(pozițiaCurentă) <= 'Z') {
				numărCuvinte += 1;
			}
		}
		
		System.out.println("Numărul de cuvinte: " + numărCuvinte);
		
	}
	
}
