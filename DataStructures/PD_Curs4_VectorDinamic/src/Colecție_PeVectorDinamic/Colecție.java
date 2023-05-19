package Colecție_PeVectorDinamic;

import Interfețe.InterfațăColecție;


//De acestă dată lucrăm numai cu int, deoarce vectorul nu suportă o inițializare generică.
public class Colecție implements InterfațăColecție<Integer> {			

	//Reprezentare | x3 atribute.
	int[] elemente;
	int numărulElementelor;
	int capacitate;



	//Constructor
	public Colecție() {
		creează();
	}


	@Override
	public void creează() {											//Complexitate θ(1).
		this.numărulElementelor = 0;
		this.capacitate = 10;
		this.elemente = new int[capacitate];
	}

	@Override
	public void adaugă(Integer element) {							//Complexitate θ(1)amortizat.
		if (this.numărulElementelor == this.capacitate) {			//Verificăm dacă vectorul este plin.
			this.capacitate = this.capacitate*2;					//Dublăm capacitatea.
			int[] vectorNou = new int[capacitate];					//Inițializăm un vectorNou cu o capacitate dublă.

			for(int i=0; i<this.numărulElementelor; i++) {			//Copiem numărulElementelor în noulVector.
				vectorNou[i] = this.elemente[i];
			}
			this.elemente = vectorNou;								//Reținem adresa vectoruluiNou în elemente (vectorul vechi).
		}

		/*	Acum sigur avem loc pentru elementulDeAdăugat.
		 * Fie intră în if și facem loc, fie NU e nevoie și
		 * se execută direct următoarele linii de cod.
		 */

		this.elemente[this.numărulElementelor] = element;			
		this.numărulElementelor = this.numărulElementelor + 1;

	}

	@Override
	public boolean șterge(Integer elementDeȘters) {							//Complexitate: O(n), pentru că trebuie să parcurgem vectorul.
		
		if(esteVidă() == true) {
			System.out.println("Colecția este vidă.");
		}
		
		boolean existăElementDeȘters = false;
		int index = 0;
		
		while (existăElementDeȘters == false && index < this.numărulElementelor) {
			if(this.elemente[index] == elementDeȘters) {			//element[index] va avea chiar valoarea care trebuie ștearsă.
				existăElementDeȘters = true;
			}else {
				index++;
			}
		}
		
		//De aici operează ștergerea propriu-zisă.
		//Este pus la final pentru a fi suprascris.
		if(existăElementDeȘters == true) {
			this.elemente[index] = this.elemente[this.numărulElementelor-1];
			this.numărulElementelor = this.numărulElementelor-1;
		}
		
		return existăElementDeȘters;
	}

	@Override
	public int dimensiune() {					//Complexitate θ(1).
		return this.numărulElementelor;
	}

	@Override
	public boolean caută(Integer elementDeCăutat) {			//Complexitate: O(n), deoarece trebuie parcurs vectorul.
		boolean existăElement = false;
		int index = 0;
		
		while(existăElement == false && index < this.numărulElementelor) {
			if(this.elemente[index] == elementDeCăutat) {
				existăElement = true;
			}else {
				index++;
			}
		}
		
		return existăElement;
	}


	@Override
	public Integer iterator() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean goleșteColecția() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public int aparițiiElement(Integer element) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public boolean esteVidă() {
		if(this.numărulElementelor == 0) {
			return true;
		}
		return false;
	}

	
}
