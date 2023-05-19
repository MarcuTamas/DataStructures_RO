package main;

import java.util.Scanner;

public class Main {
	
	
	public static int funcțiaDeDispersie() {
		int elementDeAdăugat, capacitateTabelăDeDispersie;
		int funcțieDeDispersie;
		
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Introduceți elementul pe care doriți să îl adăugați: ");
		elementDeAdăugat = in.nextInt();
		
		System.out.println();
		
		System.out.print("Introduceți capacitatea tabelei de dispersie (vectorului dinamic): ");
		capacitateTabelăDeDispersie = in.nextInt();
		
		System.out.println();
		
		//Funcția de dispersie (calculul poziției).
		
		funcțieDeDispersie = elementDeAdăugat % capacitateTabelăDeDispersie;
		System.out.print("Rezultatul funcției de dispersie este: " + funcțieDeDispersie);
		
		
		return funcțieDeDispersie;
	}
	
	public static void main(String[] args) {
		
		funcțiaDeDispersie();
		
	}
}
