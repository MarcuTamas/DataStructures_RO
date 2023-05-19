package VectorDinamic;

import Interfețe.InterfațăIterator;

public class IteratorPeVectorDinamic<T> implements InterfațăIterator<T>{
	T numeContiner;
	int indexElementCurent;
	
	public IteratorPeVectorDinamic(T continerPesteCareIterăm){
		creeazăIterator(continerPesteCareIterăm);
	}
	
	@Override
	public void creeazăIterator(T continerPesteCareIterăm) {			//Complexitate θ(1).
		this.numeContiner = continerPesteCareIterăm;
		this.indexElementCurent = 0;
	}

	@Override
	public int elementCurent() {
		return indexElementCurent;										//Complexitate θ(1).
		/*this.numeContiner.elemente*[this.indexElementCurent];
		 * Unde .elemente[] vectorul dinamic în care salvăm elementele;
		 */
	}

	@Override
	public void următor() {												//Complexitate θ(1).
		this.indexElementCurent = this.indexElementCurent+1;
		
	}

	@Override
	public boolean valid() {
		/*	if(this.indexElementCurent < this.numeContiner.numărElemente) {
		 *		return true;
		 *	}else {
		 *	    	return false;
		 *	}
		 */
		return false;
	}
}
