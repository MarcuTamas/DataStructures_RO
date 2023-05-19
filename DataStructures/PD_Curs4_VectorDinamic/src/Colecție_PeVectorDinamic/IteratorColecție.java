package Colecție_PeVectorDinamic;

import Interfețe.InterfațăIterator;

public class IteratorColecție implements InterfațăIterator<Colecție> {
	Colecție colecție = new Colecție();			//Apelăm constructorul.
	int indexElementCurent;
	
	public IteratorColecție(Colecție colecțiePesteCareVomItera) {
		creeazăIterator(colecțiePesteCareVomItera);
	}
	
	@Override
	public void creeazăIterator(Colecție colecție) {			//Complexitate θ(1).
		this.colecție = colecție;
		this.indexElementCurent = 0;
	}
	@Override
	public int elementCurent() {													//Complexitate θ(1).
		return this.colecție.elemente[indexElementCurent];
	}
	@Override
	public void următor() {
		this.indexElementCurent = this.indexElementCurent+1;		
	}
	@Override
	public boolean valid() {												//Complexitate θ(1).
		if(this.indexElementCurent < this.colecție.numărulElementelor) {
			return true;
		}else {
			return false;
		}
	}
	
}
