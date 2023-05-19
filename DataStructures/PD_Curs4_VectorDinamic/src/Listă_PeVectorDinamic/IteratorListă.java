package Listă_PeVectorDinamic;

import Interfețe.InterfațăIterator;

public class IteratorListă implements InterfațăIterator<Listă> {

	Listă listă = new Listă();			//Apelăm constructorul.
	int indexElementCurent;

	public IteratorListă(Listă listăPesteCareVomItera) {
		creeazăIterator(listăPesteCareVomItera);
	}

	@Override
	public void creeazăIterator(Listă listă) {			//Complexitate θ(1).
		this.listă = listă;
		this.indexElementCurent = 0;
	}
	
	@Override
	public int elementCurent() {													//Complexitate θ(1).
		return this.listă.elemente[indexElementCurent];
	}
	@Override
	public void următor() {
		this.indexElementCurent = this.indexElementCurent+1;		
	}
	@Override
	public boolean valid() {												//Complexitate θ(1).
		if(this.indexElementCurent < this.listă.numărulElementelor) {
			return true;
		}else {
			return false;
		}
	}
}
