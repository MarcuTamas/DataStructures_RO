package problemăPortmoneuListă;

import java.util.Scanner;

import Listă_PeVectorDinamic.*;

public class Portmoneu {
	public static void conținutPortmoneu() {
		Listă portmoneu = new Listă();

		OperațiiPortmoneu.citeșteBancnote(portmoneu);

		IteratorListă iteratorElemente = new IteratorListă(portmoneu);

		System.out.print("Elementele din portmoneu sunt: ");
		while(iteratorElemente.valid()) {
			System.out.print(iteratorElemente.elementCurent() + " ");
			iteratorElemente.următor();
		}

//		System.out.println();
//
//		System.out.print("Ștergeți un element: ");
//		Scanner in = new Scanner(System.in);
//		int elementDeȘters = in.nextInt();
//
//		portmoneu.ștergeDupăElement(elementDeȘters);
//
//
//		//Trebuie să folosim un iterator nou, nu îl putem folosi iar pe cel vechi.
//		IteratorListă iteratorElementeNou = new IteratorListă(portmoneu);
//
//		System.out.print("Elementele din portmoneu sunt: ");
//		while(iteratorElementeNou.valid()) {
//			System.out.print(iteratorElementeNou.elementCurent() + " ");
//			iteratorElementeNou.următor();
//		}
		
		System.out.println();

		System.out.print("Ștergeți un element după poziție: ");
		Scanner in = new Scanner(System.in);
		int poziție = in.nextInt();

		portmoneu.ștergeDupăPoziție(poziție);


		//Trebuie să folosim un iterator nou, nu îl putem folosi iar pe cel vechi.
		IteratorListă iteratorElementeNou = new IteratorListă(portmoneu);

		System.out.print("Elementele din portmoneu sunt: ");
		while(iteratorElementeNou.valid()) {
			System.out.print(iteratorElementeNou.elementCurent() + " ");
			iteratorElementeNou.următor();
		}

		int suma;
		suma = OperațiiPortmoneu.sumăTotală(portmoneu);

		System.out.println();

		System.out.println("Suma totală în portmoneu este: " + suma);
	}
}
