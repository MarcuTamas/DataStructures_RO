package probleme;

import java.util.Scanner;

public class ParSauImpar {
	public static void parSauImpar() {
		int număr, rest;
		
		System.out.println("Introduceți numărul: ");
		Scanner citeșteNumăr = new Scanner(System.in);
		număr = citeșteNumăr.nextInt();
		
		rest = număr%2;
		
		if (rest == 0) {
			System.out.println("Numărul este par.");
		}else {
			System.out.println("Numărul este impar.");
		}
	}
}
