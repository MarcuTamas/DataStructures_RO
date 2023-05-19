package problemăPortmoneuMulțime;

import java.util.Scanner;

import Mulțime_PeVectorDinamic.*;

public class Portmoneu {
	public static void conținutPortmoneu() {
		Mulțime portmoneu = new Mulțime();
		
		OperațiiPortmoneu.citeșteBancnote(portmoneu);
		
		IteratorMulțime iteratorElemente = new IteratorMulțime(portmoneu);
		
		System.out.print("Elementele din portmoneu sunt: ");
		while(iteratorElemente.valid()) {
			System.out.print(iteratorElemente.elementCurent() + " ");
			iteratorElemente.următor();
		}
		
		System.out.println();
		
		System.out.print("Ștergeți un element: ");
		Scanner in = new Scanner(System.in);
		int elementDeȘters = in.nextInt();
		
		portmoneu.șterge(elementDeȘters);
		
		
		//Trebuie să folosim un iterator nou, nu îl putem folosi iar pe cel vechi.
		IteratorMulțime iteratorElementeNou = new IteratorMulțime(portmoneu);
		
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
