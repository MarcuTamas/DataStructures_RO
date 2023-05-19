package Listă_PeVectorDinamic;

import java.util.Iterator;

import Interfețe.InterfațăListă;

public class Listă implements InterfațăListă<Integer>{
	//Reprezentare | x3 atribute.
	int numărulElementelor;
	int capacitate;
	int[] elemente;

	//Constructor.
	public Listă() {
		creează();
	}

	@Override
	public void creează() {
		this.numărulElementelor = 0;
		this.capacitate = 10;
		this.elemente = new int[capacitate];
	}

	@Override
	public void adaugăLaSfârșit(Integer element) {
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
	public void adaugăPePoziție(int poziție, Integer elementDeAdăugat) {				//Complexitate totală: O(n);
		//Verificăm dacă poziția este validă.											//Caz favorabil: θ(1), adăugăm la sfârșit.
		if(poziție < 0 || poziție > this.numărulElementelor) {							//Caz defavorbil: θ(n), adăugăm la început și trebuie să mutăm totul.
			System.out.println("Poziție invalidă.");									//Caz mediu: θ(n), tot trebuie să mutăm ceva.
		}

		int index;

		//Verificăm dacă am ajuns la capacitatea vectorului.
		if(this.numărulElementelor == this.capacitate) {
			this.capacitate = this.capacitate*2;					//Dublăm capacitatea.
			int[] vectorNou = new int[capacitate];					//Inițializăm un vectorNou cu o capacitate dublă.

			for(int i=0; i<this.numărulElementelor; i++) {			//Copiem numărulElementelor în noulVector.
				vectorNou[i] = this.elemente[i];
			}
			this.elemente = vectorNou;								//Reținem adresa vectoruluiNou în elemente (vectorul vechi).
		}

		//Mutăm elementele la dreapta petnru a face loc elementului de adăugat.
		for(index = this.numărulElementelor-1; index >= poziție; index++) {
			this.elemente[index+1] = this.elemente[index];
		}

		//Punem elementul pe poziție. Adăugăm propriu-zis, prin suprascrierea poziției.
		this.elemente[poziție] = elementDeAdăugat;
		this.numărulElementelor = this.numărulElementelor+1;			//Incrementăm numărul elementelor.
	}

	@Override
	public boolean ștergeDupăElement(Integer elementDeȘters) {

		if(esteVidă() == true) {
			System.out.println("Lista este vidă.");
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
	public boolean ștergeDupăPoziție(int pozițieDeȘters) {
		//Verificăm să nu ștergem dintr-o listă vidă.
		if(esteVidă() == true) {
			System.out.println("Lista este vidă.");
			return false;
		}
		
		//Verificăm dacă poziția este validă.
		if(pozițieDeȘters < 0 || pozițieDeȘters > this.numărulElementelor) {
			System.out.println("Poziție invalidă.");
			return false;
		}
		
		//else
		int index;
		
		//Ștregm elementele propriu-zis, prin suprascriere.
		//Mutăm elementele la stânga.
		for(index = pozițieDeȘters; index < this.numărulElementelor; index++) {
			this.elemente[index] = this.elemente[index+1];
		}
		
		this.numărulElementelor = this.numărulElementelor-1;
		return true;
	}

	@Override
	public Integer elementDePePoziție(int pozițiaElementului) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer modificăElementDePePoziție(int pozițiaElementului, Integer elementDeModificat) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int pozițieLaCareSeGăseșteElementul(Integer elementul) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean cautăElement(Integer elementDeGăsit) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean esteVidă() {
		if(this.numărulElementelor == 0) {
			return true;
		}
		return false;
	}

	@Override
	public int dimensiune() {
		return this.numărulElementelor;
	}

	@Override
	public Iterator<Integer> iterator() {
		// TODO Auto-generated method stub
		return null;
	}



}
