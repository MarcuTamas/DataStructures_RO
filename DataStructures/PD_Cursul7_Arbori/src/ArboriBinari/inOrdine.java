package ArboriBinari;

public class inOrdine {
	//Parcuregerea recursivă efectivă.
	public void inOrdineRecursiv(Nod nod) {
		if(nod != null) {
			inOrdineRecursiv(nod.fiuStâng);
			System.out.println(nod.informațieDinNod);
			inOrdineRecursiv(nod.fiuDrept);
		}
	}

	//Apelul funcției recursive, ce primește ca parametru un arbore și apelează funcția de parcurge cu rădăcina acestuia.
	public void parcurgereArboreBinarPreordine(ArboreBinar arboreDeParcurs) {
		inOrdineRecursiv(arboreDeParcurs.rădăcină);
	}
}
