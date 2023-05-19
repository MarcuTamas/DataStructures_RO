package TAD_Interfețe_Iterator;

public interface  InterfațăIteratorReadWrite {
	//Descriere: poate să modifice elementele continerului.

	//Operații generale iterator x4.
	public void creeazăIterator(/*numeContiner*/);
	
	public void element();
	
	public void următor();
	
	public void valid();
	
	
	/*Operații specife*/
	public void înlocuieșteElement();
	//Descirere: înlocuiește elementulCurent cu un alt element.
	
	public void insereazăElement();
	//Descrire: inserează (adaugă) un elementNou înainte sau după de elementulCurent.
	
	public void șterege();
	//Descriere: șterge elementulCurent.
	
	
}
