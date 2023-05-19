package ArboriBinari;

public class preOrdine {
	//Parcuregerea recursivă efectivă.
	public void preOrdineRecursiv(Nod nod) {
		if(nod != null) {
			System.out.println(nod.informațieDinNod);
			preOrdineRecursiv(nod.fiuStâng);
			preOrdineRecursiv(nod.fiuDrept);
		}
	}

	//Apelul funcției recursive, ce primește ca parametru un arbore și apelează funcția de parcurge cu rădăcina acestuia.
	public void parcurgereArboreBinarPreordine(ArboreBinar arboreDeParcurs) {
		preOrdineRecursiv(arboreDeParcurs.rădăcină);
	}
}
