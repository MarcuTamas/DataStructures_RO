package TAD_Interfețe_Iterator;

public interface InterfațăIteratorBiDirecțional {

	//Operații generale iterator x4.
	public void creeazăIterator(/*numeContiner*/);

	public void element();

	public void următor();

	public void valid();

	
	
	/*Operație specifică.*/
	public void anterior();
	//Descriere: elementulAnterior celui curent din iterator, devine elementCurent;

	
	
	/*Alte operații posibile.*/
	public void prim();
	//Descriere: elementulCurent din iterator devine primulElement din numeContiner;

	public void ultim();
	//Descruere: elementulCurent din iterator devine ultimulElement din numeContiner.

}
