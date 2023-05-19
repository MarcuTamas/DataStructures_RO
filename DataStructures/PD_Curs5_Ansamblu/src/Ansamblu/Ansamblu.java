package Ansamblu;

public class Ansamblu implements InterfațăAnsamblu{
	//Reprezentare. | x3 atribute (deoarece e tot un vector dinamic).
	int capacitate;
	int numărulElementelor;
	int[] elemente;

	//Operații ansamblu.
	@Override
	public void adăugare(int elementDeAdăugat) {
		//Elementele se pot repeta, verificăm doar capacitatea.
		if(this.numărulElementelor == this.capacitate) {
			this.capacitate = this.capacitate*2;
			int[] vectorNou = new int[capacitate];

			for(int i=0; i<this.numărulElementelor; i++) {
				vectorNou[i] = this.elemente[i];
			}
			this.elemente = vectorNou;
		}
		this.elemente[this.numărulElementelor] = elementDeAdăugat;				//Adăugăm la final.
		this.numărulElementelor = this.numărulElementelor+1;					//Incrementăm numărul elementelor.


		//Începem procesul de urcare, pentru a respecta maxHeap.
		int indexDescendentAdăugat, indexPărinte, variabilăTemporară;
		indexDescendentAdăugat = this.numărulElementelor-1;								//Unde se află ultimul element adăugat.
		indexPărinte = (indexDescendentAdăugat-1)/2;									//Formula de calcul pentru poziție Părinte.

		//Interschimbare între părinte și descendent.									//Complexitate: O(log2n).
		while(indexDescendentAdăugat>0 && this.elemente[indexPărinte] < this.elemente[indexDescendentAdăugat]) {
			variabilăTemporară = this.elemente[indexPărinte];
			this.elemente[indexPărinte] = this.elemente[indexDescendentAdăugat];
			this.elemente[indexDescendentAdăugat] = variabilăTemporară;
		}
	}
	@Override
	public int șterge() {																//Complexitate: O(log2n).

		//Verificăm dacă ansamblul nu este vid.
		if(this.numărulElementelor == 0) {
			System.out.println("Încercați să ștergeți rađăcina dintr-un ansamblu gol.");
			return -1;
		}
		
		int elementDeȘters, indexElement, indexFiuStâng, indexFiuDrept, indexFiuMax, variabilăTemporară;
		
		//Salvăm rădăcina pentru a putea returna valoarea acesteia.
		elementDeȘters = this.elemente[0];			//Rădăcina este la indexul 0 al vectoruluiDinamic.
		
		//Primul pas: mutăm ultimul element din ansamblu în locul rădăcinii.
		this.elemente[0] = this.elemente[this.numărulElementelor-1];
		this.numărulElementelor = this.numărulElementelor-1;			//Decrementăm numărul elementelor.
		
		indexElement = 0;
		
		//Pasul doi: parcurgem ansamblu și operăm coborârea elementului, dacă va fi nevoie.
		while(indexElement<this.numărulElementelor) {
			
			//Aflăm descendenții.
			indexFiuStâng = indexElement*2+1;
			indexFiuDrept = indexElement*2+2;
			
			//Comparăm descendenții pentru a afla maximul dintre ei.
			indexFiuMax = indexFiuStâng;				//Presupunem că cel mai mare este stângul.
			
			//Verificăm să existe 2 fii.
			if(indexFiuDrept<this.numărulElementelor) {
				//Comparăm propriu-zis cei deoi fi.
				if(this.elemente[indexFiuDrept] > this.elemente[indexFiuStâng]) {		
					indexFiuMax = indexFiuDrept;
				}
			}
			
			//Verificăm să nu fie ajuns la fina și ca descendentul să fie mai mare ca rădăcina.
			if (indexFiuStâng<this.numărulElementelor && this.elemente[indexFiuMax] > this.elemente[indexElement]) {
				//Interschimbăm descendentul cu rădăcina.
				variabilăTemporară = this.elemente[indexFiuMax];
				this.elemente[indexFiuMax] = this.elemente[indexElement];
				this.elemente[indexElement] = variabilăTemporară;
				//Schimbăm indexulPărineteui.
				indexElement = indexFiuMax;
			}else {
				//Când fiulMax este mai mic sau nu are descendenți.
				indexElement = this.numărulElementelor;
			}
		}
		return elementDeȘters;
	}



}
