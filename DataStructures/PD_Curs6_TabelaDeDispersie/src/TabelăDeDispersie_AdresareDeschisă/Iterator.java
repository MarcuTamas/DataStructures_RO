package TabelăDeDispersie_AdresareDeschisă;

public class Iterator {
	//Reprezentare. | x2 atribute.
	TebelăDeDispersie tabelăDispersie;
	int indexElementCurent;
	
	public void creează(TebelăDeDispersie tabelăDispersie) {			//Complexitate O(n).
		this.tabelăDispersie = tabelăDispersie;
		this.indexElementCurent = 0;									//Fiindu un vector dinamic, pozițiile pornesc de la 0.
		
		//Trebuie să căutăm o poziție cu element.
			//Contrar, nu am avea ce să returnăm cu iteratorul.
			//Reminder tabela de dispersie cu adresare deschisă permite goluri, pe care trebuie să le evităm când iterăm.
		
		//Verificăm să nu depășim capacitatea și indexul să nu fie gol.
		while(this.indexElementCurent<tabelăDispersie.capacitate && this.tabelăDispersie.elemente[this.indexElementCurent] == 0) {
			this.indexElementCurent = this.indexElementCurent+1;
		}
		
		/*	După ce ieșim din while ar trebui fie să găsim o poziție ocupată pe care să o returnăm.
		 * fie să constatăm că tabela de dispersie este goală. Din acest motiv trebuie neapărat ca verificarea
		 * să meargă până la strict mai mic înainte de capacitate. Dacă această verificare ar lipsi,
		 * iar tabela ar fi goală am avea o buclă infinită.
		 */
	}
	
	public int element() {													//Complexitate θ(1).
		return this.tabelăDispersie.elemente[this.indexElementCurent];
	}
	
	public void următor() {													///Complexitate O(n).
		this.indexElementCurent = this.indexElementCurent + 1;
		
		//Trebuie să evităm golurile.
		while(this.indexElementCurent < this.tabelăDispersie.capacitate 
				&& this.tabelăDispersie.elemente[indexElementCurent] == 0) {
			this.indexElementCurent = this.indexElementCurent + 1;
		}
	}
	
	public boolean valid() {												///Complexitate θ(1).
		if(this.indexElementCurent == this.tabelăDispersie.capacitate) {
			return false;
		}else {
			return true;
		}
	}
	/*Descriere: verifică dacă mai sunt elemente în iterator.
	
	  Condiții:
	   pre: iterator este un iterator valid (are elemente);
	   post:
	   			a. returnează adevărat, dacă elementul curent există;
	  			b. returnează fals, dacă nu există (iteratorul este invalid).
	 */
	
	
	
}
