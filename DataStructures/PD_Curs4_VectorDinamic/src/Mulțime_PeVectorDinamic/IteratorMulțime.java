package Mulțime_PeVectorDinamic;

import Mulțime_PeVectorDinamic.Mulțime;
import Interfețe.InterfațăIterator;

public class IteratorMulțime implements InterfațăIterator<Mulțime> {

	Mulțime mulțime = new Mulțime();			//Apelăm constructorul.
	int indexElementCurent;

	public IteratorMulțime(Mulțime mulțimePesteCareVomItera) {
		creeazăIterator(mulțimePesteCareVomItera);
	}

	@Override
	public void creeazăIterator(Mulțime mulțime) {			//Complexitate θ(1).
		this.mulțime = mulțime;
		this.indexElementCurent = 0;
	}
	
	@Override
	public int elementCurent() {													//Complexitate θ(1).
		return this.mulțime.elemente[indexElementCurent];
	}
	@Override
	public void următor() {
		this.indexElementCurent = this.indexElementCurent+1;		
	}
	@Override
	public boolean valid() {												//Complexitate θ(1).
		if(this.indexElementCurent < this.mulțime.numărulElementelor) {
			return true;
		}else {
			return false;
		}
	}
}
