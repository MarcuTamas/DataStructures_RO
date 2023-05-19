package TabelăDeDispersie_ColiziuneLI;

import TabelăDeDispersie_ColiziuneLI.*;

public class Iterator {
	//Reprezentare. | x3 atribute.
	int pozițieCurentă;
	Nod nodCurent;
	TebelăDeDispersie tabelăDeDispersie;
	
	public void creează(TebelăDeDispersie tabelăDeDispersie) {							//Complexitate O(n).
		this.tabelăDeDispersie = tabelăDeDispersie;
		this.pozițieCurentă = 0;												//VectorulDinamic de liste pornește de la indexul 0.
		this.nodCurent = tabelăDeDispersie.elemente[this.pozițieCurentă];		//Echivalent a nod curent = primul nod.
		
		//Verificăm să nu depășim atât vectorul, cât nici lista de elemente.
		while(this.pozițieCurentă < tabelăDeDispersie.capacitate && this.nodCurent == null) {
			//Parcurgem vectorul de liste și listele propriu-zis.
			this.pozițieCurentă = this.pozițieCurentă + 1;								//Echivalent cu v[i] = v[i+1], pentru a parcurge vectorul.
			this.nodCurent = this.tabelăDeDispersie.elemente[this.pozițieCurentă];		//Pentru a parcurge lista.
		}
	}
	
	public int element() {						//Complexitate θ(1).
		return this.nodCurent.element;			//Returnăm valoarea curentă.
	}
	
	public void următor() {									//Complexitate O(n);
		this.nodCurent = this.nodCurent.nodUrmător;			//Preluăm referința nodului următor în nodul curent.
		
		//Dacă nu mai avem elemente în listă trecem la următoarea poziție.
		if(this.nodCurent == null) {
			this.pozițieCurentă = this.pozițieCurentă + 1;
			//Verificăm să nu depăsim vectorul de liste (capacitatea).
			if(this.pozițieCurentă < this.tabelăDeDispersie.capacitate) {
				this.nodCurent = this.tabelăDeDispersie.elemente[this.pozițieCurentă];
			}
			
			//Parcurgem efectiv pozițiile și listele.
			while(this.pozițieCurentă < this.tabelăDeDispersie.capacitate && this.nodCurent == null) {
				this.pozițieCurentă = this.pozițieCurentă + 1;
				this.nodCurent = this.tabelăDeDispersie.elemente[this.pozițieCurentă];
			}
		}
	}

	public boolean valid() {					//Complexitate θ(1).
		//Verificăm dacă lista este goală.
		if(this.nodCurent == null) {
			return false;
		}else {
			return true;
		}
	}
	
}
