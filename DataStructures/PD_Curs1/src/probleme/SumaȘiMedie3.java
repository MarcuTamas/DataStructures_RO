package probleme;

import java.util.Scanner;

public class SumaȘiMedie3 {
	public static void citireÎnainteDeWhile() {
		int suma, contor, număr, câte;
		double medie;
		Scanner cit = new Scanner(System.in);
		
		suma = 0;
		medie = 0.0;
		câte = 0;
		
		System.out.print("Dați un număr: ");
		număr = cit.nextInt();
		
		while(număr != 0) {
			suma += număr;
			câte += 1;			//Incrementăm numărul de numere citite.
			System.out.print("Dați un număr: ");
			număr = cit.nextInt();
		}
		
		if(câte != 0) {
			medie = suma/(câte * 1.0);
		}
		
		System.out.println("Suma este: " + suma);
		System.out.println("Media este: " + medie);
	}
	
	public static void citireÎnWhileSoluția1() {
		int suma, contor, număr, câte;
		double medie;
		Scanner cit = new Scanner(System.in);
		
		suma = 0;
		medie = 0.0;
		număr = 1;
		câte = -1;			//trebuie să număar câte numere sunt citite, pentru a calcula media. 
							//Initțializăm cu -1, pentru a avea la final valoarea bună.
		
		
		while(număr != 0) {
			System.out.print("Dați un număr: ");
			număr = cit.nextInt();
			suma += număr;
			câte += 1;			//Incrementăm numărul de numere citite.
		}
		
		if(câte != 0) {
			medie = suma/(câte * 1.0);
		}
		
		System.out.println("Suma este: " + suma);
		System.out.println("Media este: " + medie);
	}
	
	public static void citireÎnWhileSoluția2() {
		int suma, contor, număr, câte;
		double medie;
		Scanner cit = new Scanner(System.in);
		
		suma = 0;
		medie = 0.0;
		număr = 1;
		câte = 0;			//trebuie să număar câte numere sunt citite, pentru a calcula media. 
							//Initțializăm cu -1, pentru a avea la final valoarea bună.
		
		
		while(număr != 0) {
			System.out.print("Dați un număr: ");
			număr = cit.nextInt();
			suma += număr;
			câte += 1;			//Incrementăm numărul de numere citite.
		}
		
		if(câte != 0) {
			medie = suma/(câte * 1.0 - 1);
		}
		
		System.out.println("Suma este: " + suma);
		System.out.println("Media este: " + medie);
	}
	
}
