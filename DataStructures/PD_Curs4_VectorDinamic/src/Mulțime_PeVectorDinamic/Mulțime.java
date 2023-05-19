package Mulțime_PeVectorDinamic;

import java.util.Iterator;

import Interfețe.InterfațăMulțime;

public class Mulțime implements InterfațăMulțime<Integer> {

	//Reprezentare | x3 atribute.

	int numărulElementelor;
	int capacitate;
	int[]	elemente;


	//Constructor.
	public Mulțime() {
		creează();
	}


	@Override
	public void creează() {								//Complexitate θ(1).
		this.numărulElementelor = 0;
		this.capacitate = 10;
		this.elemente = new int[capacitate];
	}

	@Override
	public void adaugă(Integer elementDeAdăugat) {
		//Prima dată verificăm ca elementul să nu fie în Mulțime.
		int index = 0;
		boolean existăElement = false;

		//Parcurgem elementele vectorului.
		while(index<this.numărulElementelor && existăElement == false) {
			if(this.elemente[index] == elementDeAdăugat) {
				existăElement = true;
			}
			//else
			index++;
		}
		
		//Adăugăm elementul, dacă nu a fost găsit.
		if(existăElement == false) {
			//Verificăm să nu fi ajuns la capacitatea maximă, iar dacă am ajuns o dublăm.
			if(this.numărulElementelor == this.capacitate) {
				this.capacitate = capacitate*2;
				int[] vectorNou = new int[capacitate];						//Capacitatea este dublată.

				for(int i = 0; i<this.numărulElementelor; i++) {
					vectorNou[i] = this.elemente[i];						//Mutăm elementele în vectorulNou creat.
				}
				this.elemente = vectorNou;
			}
			//Adăugăm propriu-zis elementul și incrementăm numărul elementelor.
			this.elemente[this.numărulElementelor] = elementDeAdăugat;
			this.numărulElementelor =this.numărulElementelor+1;
		}
	}
	/*	Fiind Mulțime, elementele trebuie să fie unice.
	 * 		Prima dată verificăm dacă mai există elementul, ca să nu îl adăugăm din nou.
	 * 
	 * 
	 * 	Complexitate:
	 * 			a. Totală: O(n);
	 * 			b. Caz favorabil: θ1;			//Elementul există deja și este pe prima poziție.
	 * 			c. Caz defavorabil: θ(n);		//Elementul nu există și trebuie adăugat.
	 * 			d. Caz mediu: θ(n);				//Deoarece trebuie să caut tot timpul dacă elementul 
	 * 											există nu mai am complexitate amortizată.
	 */
	
	

	@Override
	public boolean șterge(Integer elementDeȘters) {							//Complexitate: O(n), pentru că trebuie să parcurgem vectorul.
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
			this.elemente[index] = this.elemente[this.numărulElementelor-1]; 		//Îl punem la capăt.
			this.numărulElementelor = this.numărulElementelor-1;					//Decrementăm numărul elementelor.
		}
		
		return existăElementDeȘters;
	}

	@Override
	public int dimensiune() {
		return this.numărulElementelor;
	}

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
	public Iterator<Integer> iterator() {
		// TODO Auto-generated method stub
		return null;
	}


}
