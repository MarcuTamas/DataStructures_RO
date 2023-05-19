package ListăSimpluÎnlănțuită;

public class IteratorLSI {
	 ListăSimpluÎnlănțuită listă;
	 Nod nodCurent;
	 
	 
	 public void creează(ListăSimpluÎnlănțuită listăPesteCareIterăm) {			//Complexitate θ(1).
		 this.listă = listăPesteCareIterăm;
		 this.nodCurent = listăPesteCareIterăm.primulNod;
	 }
	 
	 public int element() {														//Complexitate θ(1).
		 return this.nodCurent.element;
	 }
	 
	 public void următor() {													//Complexitate θ(1).
		 this.nodCurent = this.nodCurent.următorulNod;
	 }
	 	
	 public boolean valid() {													//Complexitate θ(1).
		 if(this.nodCurent == null) {
			 return false;
		 }else {
			 return true;
		 }
	 }
	 
}
