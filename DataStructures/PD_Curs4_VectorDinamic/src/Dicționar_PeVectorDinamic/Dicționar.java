package Dicționar_PeVectorDinamic;

import java.util.Collection;
import java.util.Set;

import Interfețe.InterfațăDicționar;

public class Dicționar<T> implements InterfațăDicționar<T>{
	//Reoprezentare. | x3 atribute
	int numărulElementelor;
	int capacitate;
	Pereche[] elemente;


	//Constructor.
	public Dicționar() {
		creează();
	}

	@Override
	public void creează() {
		this.numărulElementelor = 0;
		this.capacitate = 10;
		this.elemente = new Pereche[capacitate];
	}

	@Override
	public void adaugă(T cheieDeAdăugat, T valoareDeAdăugat) {
		//Prima dată verificăm dacă mai există cheia.
		int index = 0;
		boolean existăElement = false;

		//Parcurgem elementele vectorului.
		while(index<this.numărulElementelor && existăElement == false) {
			if(this.elemente[index].cheie == cheieDeAdăugat) {
				existăElement = true;

				//Înlocuim prin suprascriere valoarea.
				this.elemente[index].valoare = valoareDeAdăugat;
			}
			//else
			index++;
		}

		//Adăugăm chiea NU a fost găsită, trebuie să o adăugăm împreună cu valoarea sa.
		if(existăElement == false) {
			//Verificăm să nu fi ajuns la capacitatea maximă, iar dacă am ajuns o dublăm.
			if(this.numărulElementelor == this.capacitate) {
				this.capacitate = capacitate*2;
				Pereche[] vectorNou = new Pereche[capacitate];						//Capacitatea este dublată.

				for(int i = 0; i<this.numărulElementelor; i++) {
					vectorNou[i] = this.elemente[i];						//Mutăm elementele în vectorulNou creat.
				}
				this.elemente = vectorNou;
			}
			
			//Adăugăm propriu-zis perechea și incrementăm numărul elementelor.
			Pereche perecheDeAdăugat = new Pereche<>();
			perecheDeAdăugat.cheie = cheieDeAdăugat;
			perecheDeAdăugat.valoare = valoareDeAdăugat;
			
			this.elemente[this.numărulElementelor] = perecheDeAdăugat;
			this.numărulElementelor =this.numărulElementelor+1;
		}


	}

	@Override
	public T șterge(T cheie) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean caută(T cheie) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int dimensiune() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public T iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set chei() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection valori() {
		// TODO Auto-generated method stub
		return null;
	}

}
