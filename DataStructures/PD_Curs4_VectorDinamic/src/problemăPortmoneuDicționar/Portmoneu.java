package problemăPortmoneuDicționar;

import Dicționar_PeVectorDinamic.Dicționar;
import Dicționar_PeVectorDinamic.IteratorDicționar;
import Dicționar_PeVectorDinamic.Pereche;

public class Portmoneu {
	public static void conținutPortmoneu() {
		Dicționar portmoneu = new Dicționar();
		
		OperațiiPortmoneu.citeșteBancnote(portmoneu);
		
		
		System.out.println("Perechi din dicționar: ");
		IteratorDicționar<Pereche> iteratorD = new IteratorDicționar<>(portmoneu);
		
		while(iteratorD.valid()) {
			System.out.println(iteratorD.elementCurent().getValoare());
			iteratorD.următor();
		}
		
		
		
//		int suma;
//		suma = OperațiiPortmoneu.sumaTotală(portmoneu);
		
//		System.out.println("Suma totală în portmoneu este: " + suma);
	
	}	
}
