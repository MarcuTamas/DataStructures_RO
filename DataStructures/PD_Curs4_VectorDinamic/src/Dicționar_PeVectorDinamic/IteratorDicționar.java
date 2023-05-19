package Dicționar_PeVectorDinamic;

//Nu funcționează.

public class IteratorDicționar<T>{

	Dicționar dicționar = new Dicționar();			//Apelăm constructorul.
	int indexElementCurent;

	public IteratorDicționar(Dicționar dicționarPesteCareVomItera) {
		creeazăIterator(dicționarPesteCareVomItera);
	}

	public void creeazăIterator(Dicționar dicționar) {			//Complexitate θ(1).
		this.dicționar = dicționar;
		this.indexElementCurent = 0;
	}

	public Pereche<T> elementCurent() {													//Complexitate θ(1).
		return this.dicționar.elemente[indexElementCurent];
	}

	public void următor() {
		this.indexElementCurent = this.indexElementCurent+1;		
	}

	public boolean valid() {												//Complexitate θ(1).
		if(this.indexElementCurent < this.dicționar.numărulElementelor) {
			return true;
		}else {
			return false;
		}
	}

}
