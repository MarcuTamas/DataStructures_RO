package ArboriBinari;

public class postOrdine {
	//Parcuregerea recursivă efectivă.
	public void preOrdineRecursiv(Nod nod) {
		if(nod != null) {
			preOrdineRecursiv(nod.fiuStâng);
			preOrdineRecursiv(nod.fiuDrept);
			System.out.println(nod.informațieDinNod);
		}
	}

	//Apelul funcției recursive, ce primește ca parametru un arbore și apelează funcția de parcurge cu rădăcina acestuia.
	public void parcurgereArboreBinarPreordine(ArboreBinar arboreDeParcurs) {
		preOrdineRecursiv(arboreDeParcurs.rădăcină);
	}
}
