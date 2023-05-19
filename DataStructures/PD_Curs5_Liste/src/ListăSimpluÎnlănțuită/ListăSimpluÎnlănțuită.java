package ListăSimpluÎnlănțuită;

public class ListăSimpluÎnlănțuită {
	Nod primulNod = new Nod();
	int lungime;			//Echivalentă a număruluiDeElemente de la vectorulDinaic. !N.B: poate lipsi.

	//Constructor.
	public ListăSimpluÎnlănțuită() {
		creează();
	}

	public void creează() {
		this.primulNod = null;
		this.lungime = 0;
	}

	public void parcuregereListă() {
		Nod nodCurent;
		nodCurent = this.primulNod;

		while(nodCurent != null) {
			int element = nodCurent.element;
			//Putem face ceva cu elementul.
			nodCurent = nodCurent.următorulNod;			//Schimbăm nodul curent cu următorul nod.
		}
	}

	public void adaugăLaÎnceput(int elementDeAdăugat) {							//Complexitate θ(1).
		Nod nodNou = new Nod();						//Creeăm un nod nou.
		nodNou.element = elementDeAdăugat;			//Setăm atributele (câmpurile) sale.
		nodNou.următorulNod = null;

		//Verificăm dacă lista este vidă, iar dacă este nodNou va fi chiar primul nod.
		if(this.primulNod == null) {
			this.primulNod = nodNou;
			lungime = 1;								//Adăugăm la o listă vidă, deci vom avea un singur element, respectiv cel adăugat.
		}else {											//Dacă nu este vidă, atunci refacem legăturile.
			nodNou.următorulNod = this.primulNod;
			this.primulNod = nodNou;
			this.lungime++;
		}
	}


	//Trebuie parcursă întreaga listă.
	public void adaugăLaSfârșit(int elementDeAdăugat) {		//Complexitate: θ(n), pentru că trebuie să parcurgem lista.
		Nod nodNou = new Nod();

		nodNou.element = elementDeAdăugat;
		nodNou.următorulNod = null;					//Rămâne null, pentru că va fi ultimul nod.

		//Verificăm dacă lista este vidă.
		if(this.primulNod == null) {
			this.primulNod = nodNou;
			this.lungime = 1; 
		}else {
			Nod nodCurent = this.primulNod;			//Variabilă pe care o folosim să parcurgem lista.

			//Parcurgem lista.
			while(nodCurent.următorulNod != null) {
				nodCurent= nodCurent.următorulNod;
			}

			//Am ajuns la final și stabilim legătura.
			nodCurent.următorulNod = nodNou;
			this.lungime++;
		}
	}


	//Premisă 1: nu avem câmupul Lungime (echivalentul numărElemente de la vector dinamic).
	public void adaugăPePozițieFărăLungime(int pozițieLaCareAdăugăm, int elementDeAdăugat) {			//Complexitate O(n).

		//Verificăm să avem o poziție valiđă.
		if(pozițieLaCareAdăugăm < 0) {
			System.out.println("Încercați să adăugați pe o poziție nevalidă.");
		}

		//else
		Nod nodNou = new Nod();
		nodNou.element = elementDeAdăugat;
		nodNou.următorulNod = null;

		//Verificăm dacă încercăm să adăugăm pe prima poziție.
		if(pozițieLaCareAdăugăm == 0) {
			//Dacă da, atunci refacem legăturile fără să mai trebuiască să parcurgem elementele listei.
			nodNou.următorulNod = this.primulNod;
			this.primulNod = nodNou;
		}else {
			Nod nodCurent = new Nod();
			int pozițieCurentă = 0;
			nodCurent = this.primulNod;

			//Parcurgem elementele listei pentru a găsi poziția unde trebuie să refacem legăturile.
			//Verificăm să nu depășim poziția anterioară celei care dorim să adăugăm.
			while(pozițieCurentă < pozițieLaCareAdăugăm-1 && nodCurent != null) {
				nodCurent = nodCurent.următorulNod;
				pozițieCurentă = pozițieCurentă + 1;
			}

			//Verificăm dacă poziția este validă.
			if(pozițieCurentă == pozițieCurentă-1 && nodCurent != null) {

				/*	Refacem legăturile.
				 * 		1. nodCurent = nodul anterior poziției unde dorim să inserăm.
				 * 		2. Trebuie ca prima dată să setăm legăturile nouluiNod.
				 */

				nodNou.următorulNod = nodCurent.următorulNod;
				nodCurent.următorulNod = nodNou;

				/*	Mai exact presupunem că: 
				 * 			a. i este poziția unde dorim să adăugăm elementul;
				 * 			b. nodCurent va fi cel de la poziția i-1;
				 * 			c. nodCuren.următor va fi cel de la poziția i+1.
				 * 	
				 * 	Din acest motiv, ca să nu pierdem legătura cu i+1,
				 * trebuie ca prima dată să referim nodNou.următorulNod la acesta,
				 * iar după aceea să stabilim legătura lui i-1 cu nodulNou (unde 
				 * i-1 este nodCurent).
				 * 
				 */
			}
		}
	}

	//Premisă 2: în reprezentarea liste am variabila lungime, echivalentă a numărElement de la vectorulDinamic.
	public void adaugPePozițieCândAmLungime(int pozițieLaCareAdăugăm, int elementDeAdăugat) {
		//Verificăm să fie o poziție validă.
		if(pozițieLaCareAdăugăm < 0 || pozițieLaCareAdăugăm > this.lungime) {
			System.out.println("Încercați să adăugăți pe o poziție invalidă.");
		}

		Nod nodNou = new Nod();
		nodNou.element = elementDeAdăugat;
		nodNou.următorulNod = null;

		if(pozițieLaCareAdăugăm == 0) {
			//Dacă adăugăm pe prima poziție doar schimbăm referințele și incrementăm lungimea.
			nodNou.următorulNod = this.primulNod;
			this.primulNod = nodNou;
			this.lungime++;
		}else {
			//Dacă dorim să adăugăm la o altă poziție va trebui să parcurgem lista.
			Nod nodCurent = this.primulNod;
			for(int i=0; i<pozițieLaCareAdăugăm-1; i++) {			//v. mai sus de ce condiția trebuie să meargă până la pozițieLaCareAdăugăm-1;
				nodCurent = nodCurent.următorulNod;
			}

			//După ce se termină de iterat forul, ajungem la poziția corectă, reținută de nodCurent.
			//Prin urmare, putem reface legăturile.
			nodNou.următorulNod = nodCurent.următorulNod;
			nodCurent.următorulNod = nodNou;
			this.lungime++;							//Trebuie incrementată lungimea.
		}
	}

	//Premisă: nu avem variabila lungime, dar deoarece codul este mixt, totuși o vom decrementa.
	public void ștergeÎnceput() {

		//Dacă primul nod nu este null (i.e. dacă lista nu este vidă).
		if(this.primulNod != null) {										//Complexitate: θ(1).
			this.primulNod = this.primulNod.următorulNod;
			this.lungime--;
		}else {
			System.out.println("Încercați să ștergeți îceputul unei liste vide.");
		}
	}
	/* 	De altfel, am fi putut folosi și variabila elemente ca și condiție de testare,
	 * e.g. if(this.elemente != 0). Pentru că dacă am avea 0 elemente însemnă că lista
	 * ar fi vidă (goală).
	 */

	//Premisă: nu avem variabila lungime, dar deoarece codul este mixt, totuși o vom decrementa.
	public void ștergeSfârșit() {									//Complexitate: θ(n).

		//Prima dată verificăm ca lista să NU fie vidă.
		if(this.primulNod != null) {
			//Verifocăm ca lista să NU aibă un singur element.
			if(this.primulNod.următorulNod == null) {			//Dacă următorul nod al primului nod este null, atunci avem un singur element.
				this.primulNod = null;
				this.lungime--;
			}else {
				//Contrar trebuie să parcurgem lista până ajungem la penultimul element, a cărui referința (penultimNod.următorulNod) trebuie să o schimbăm la null.
				Nod nodCurent = this.primulNod;

				//Parcurgem elementele.
				while(nodCurent.următorulNod.următorulNod != null) {
					nodCurent = nodCurent.următorulNod;
				}

				//Deoarece am ajuns la penultimul element, putem schimba referința acestuia.
				nodCurent.următorulNod = null;
				this.lungime--;
			}
		}
	}


	//Premisă: parcurgem elementele reținând șî nodulAnterior, NU numai cel curent.
	public void ștergeSfârșitCândAmAnterior() {
		//Prima dată verificăm ca lista să NU fie vidă.
		if(this.primulNod != null) {
			//Verifocăm ca lista să NU aibă un singur element.
			if(this.primulNod.următorulNod == null) {			//Dacă următorul nod al primului nod este null, atunci avem un singur element.
				this.primulNod = null;
				this.lungime--;
			}else {
				//Contrar trebuie să parcurgem lista.
				Nod nodCurent = this.primulNod;
				Nod nodAnterior = null;

				//Parcurgem elementele.
				while(nodCurent.următorulNod != null) {
					nodAnterior = nodCurent;
					nodCurent = nodCurent.următorulNod;
				}

				//După ce ieșim din while, nodAnterior va fi penultimul nod, iar nodCurent va fi chiar ultimul nod.
				nodAnterior.următorulNod = null;
				lungime--;
			}
		}
	}

	public void ștergedeDePePoziție(int pozițieDeȘters) {			//Complexitate O(n).
		//Verficăm să NU avem o listă goală.
		if(this.primulNod != null) {
			if(pozițieDeȘters == 0) {										//Verificăm dacă șterge chiar prima poziție.
				this.primulNod = this.primulNod.următorulNod;
				lungime--;
			}else {
				Nod nodCurent = this.primulNod;
				int pozițiaCurentă = 0;

				//Căutăm poziția.
				while(pozițiaCurentă < pozițiaCurentă-1 && nodCurent != null) {			//Reminder pozițieCurentă -1, deoarece nu folosim o variabilă nodAnterior.
					nodCurent = nodCurent.următorulNod;
					pozițiaCurentă++;
				}

				if(pozițiaCurentă == pozițiaCurentă-1 && nodCurent != null && nodCurent.următorulNod != null) {
					nodCurent.următorulNod = nodCurent.următorulNod.următorulNod;
					lungime--;
				}
			}
		}
	}

	public void șțergeDePePozițieCândAmAnterior(int pozițieDeȘters) {			//Complexitate O(n).
		//Verificăm să fie o poziție validă.
		if(pozițieDeȘters < 0 || pozițieDeȘters > this.lungime) {
			System.out.println("Încercați să ștergeți o poziție nevalidă.");
		}

		//Verificăm dacă lista este goală.
		if(this.primulNod != null) {
			//Verificăm dacă dorim să ștergem primul nod.
			if(pozițieDeȘters == 0) {
				this.primulNod = this.primulNod.următorulNod;
				lungime--;
			}else {

				//Trebuie să căutăm poziția.
				Nod nodCurent = this.primulNod;
				Nod nodAnterior = null;

				int pozițiaCurentă = 0;

				//Parcuregem elementele pentru a afla poziția.
				while(pozițiaCurentă < pozițieDeȘters && nodCurent != null) {		//Trebuie să avem grijă să nu depășim lista.
					nodAnterior = nodCurent;
					nodCurent = nodCurent.următorulNod;
					pozițiaCurentă++;
				}

				if(pozițiaCurentă == pozițieDeȘters && nodCurent != null) {
					nodAnterior.următorulNod = nodCurent.următorulNod; 				//Puteam să spunem direct nodAnterior.următorulNod = null;
					lungime--;
				}
			}
		}
	}

	public int element(int pozițiaElementuluiDeReturnat) {				//Complexitate O(n).
		//Verificăm ca poziția să fie validă.
		if(pozițiaElementuluiDeReturnat < 0 || pozițiaElementuluiDeReturnat > this.lungime) {
			System.out.println("Poziția introdusă nu este validă.");
		}

		Nod nodCurent = this.primulNod;
		int pozițiaCurentă = 0;

		//Parcurgem elementele pentru a găsi poziția.
		while(pozițiaCurentă < pozițiaElementuluiDeReturnat && nodCurent != null) {
			pozițiaCurentă++;
			nodCurent = nodCurent.următorulNod;
		}

		//După ce se terimnă condiția iterativă ar trebui să fi găsit poziția corectă sau contrar nodCurent să fie null.
		if(nodCurent != null) {			//Verificăm dacă a găsit poziția.
			return nodCurent.element;
		}
		return -1;			//Acest număr este folosit atunci când ceva nu a avut succes.
	}

}




