package ListăDubluInlănțuită;

//	Operații similare cu LSI: element, caută lungime și toate operațiile iteratorului.


public class ListăDubluÎnlănțuită {

	Nod primulNod;
	Nod ultimulNod;

	//Constructorul.
	public ListăDubluÎnlănțuită() {
		creează();
	}

	//Initializăm atributele listei.
	public void creează() {						//Complexitate θ(1).
		this.primulNod = null;
		this.ultimulNod = null;
	}


	public void adaugăLaÎnceput(int elementDeAdăugat) {			//Complexitate θ(1).
		Nod nodNou = new Nod();
		nodNou.următorulNod = null;
		nodNou.anteriorNod = null;
		nodNou.element = elementDeAdăugat;

		//Verificăm dacă lista este goală.
		if(this.primulNod == null) {
			this.primulNod = nodNou;
			this.ultimulNod = nodNou;
		}else {
			//Dacă lista nu este goală, atunci modificăm legăturile.
			nodNou.următorulNod = this.primulNod;
			this.primulNod.anteriorNod = nodNou;
			this.primulNod = nodNou;
		}
	}


	public void adaugăLaSfârșit(int elementDeAdăugat) {
		Nod nodNou = new Nod();
		nodNou.următorulNod = null;
		nodNou.anteriorNod = null;
		nodNou.element = elementDeAdăugat;

		//Verificăm dacă lista este goală.
		if(this.primulNod == null) {
			this.primulNod = nodNou;
			this.ultimulNod = nodNou;
		}else {
			//Dacă nu este goală, atunci modificăm legăturile.
			nodNou.anteriorNod = this.ultimulNod;
			this.ultimulNod.următorulNod = nodNou;
			this.ultimulNod = nodNou;
		}
	}

	public void adaugăPePoziție(int pozițiaPeCareAdăugăm, int elementDeAdăugat) {			//Complexitate O(n).
		//Verificăm dacă poziția este validă.
		if(pozițiaPeCareAdăugăm < 0) {
			System.out.println("Poziția nu este validă.");
		}

		Nod nodNou = new Nod();
		nodNou.următorulNod = null;
		nodNou.anteriorNod = null;
		nodNou.element = elementDeAdăugat;

		//Verificăm dacă vrem să adăugăm chiar pe prima poziție.
		if(pozițiaPeCareAdăugăm == 0) {
			//Verificăm dacă lista este golă;
			if(this.primulNod == null) {
				this.primulNod = nodNou;
				this.ultimulNod = nodNou;
			}else {
				//Lista nu este vidă, dar adăugăm pe prima poziție.
				nodNou.următorulNod = this.primulNod;
				this.primulNod.anteriorNod = nodNou;
				this.primulNod = nodNou;
			}
		}

		//Dacă nu adăugăm pe prima poziție, atunci trebuie să parcurgem elementele și să găsim poziția la care adăugăm.
		Nod nodCurent = this.primulNod;
		int pozițiaCurentă = 0;

		//Parcurgem elementele.
		while(pozițiaCurentă < pozițiaPeCareAdăugăm -1 && nodCurent != null) {
			pozițiaCurentă++;
			nodCurent = nodCurent.următorulNod;
		}

		//Poziția a fost găsită.
		if(pozițiaCurentă == pozițiaPeCareAdăugăm -1 && nodCurent != null) {		//Verificăm să nu fi ieșit din listă.
			if(nodCurent == this.ultimulNod) {										//Dacă poziția este după ultimul nod.
				nodNou.anteriorNod = nodCurent;
				nodCurent.următorulNod = nodNou;
				this.ultimulNod = nodNou;
			}else{																	//Dacă adăugăm pe o altă poziție.
				nodNou.anteriorNod = nodCurent;
				nodNou.următorulNod = nodCurent.următorulNod;
				nodCurent.următorulNod.anteriorNod = nodNou;						//Referința anterioară a nodului următor va fi nodNou.
				nodCurent.următorulNod = nodNou;
			}
		}
	}
	
	public void ștergeSfârșit() {								//Complexitate θ(1).
		//Trebuie să verfică ca lista sa nu five vidă.
		if(this.primulNod != null) {
			//Trebuie să verficăm dacă lista are un singur element, caz în care va deveni goală.
			if(this.primulNod == this.ultimulNod) {
				this.primulNod = null;
				this.ultimulNod = null;
			}else {													
				//Dacă lista are și alte elemente.
				this.ultimulNod = this.ultimulNod.anteriorNod;
				this.ultimulNod.următorulNod = null;
			}
		}
	}

}
