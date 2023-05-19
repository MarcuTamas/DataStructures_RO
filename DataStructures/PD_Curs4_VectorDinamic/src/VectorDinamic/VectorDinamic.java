package VectorDinamic;

public class VectorDinamic implements InterfațăVectorDinamic<Integer>{
	//Reprezentare | x3 atribute.
	int capacitate;							
	int numărulElementelor;						
	int[] elemente;

	//Constructor VectorDinamic.
	public VectorDinamic() {
		creează();
	}
	
	
	//Operații vectorDinamic.
	@Override
	public void creează() {
		this.numărulElementelor=0;
		this.capacitate = 10;					//Putem inițializa cu orice valoare pozitivă.
		this.elemente = new int[capacitate];	//Inițializăm vectorul.
	}

	@Override
	public void adaugă(Integer elementDeAdăugat) {
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
		
		this.elemente[this.numărulElementelor] = elementDeAdăugat;			
		this.numărulElementelor = this.numărulElementelor + 1;
		
		/*	Adăugăm elementul la final.
		 * 	
		 * 	De aceea indexul this.elemente este [this.numărulElemetelor],
		 * deoarece numărulElementelor = n, ultima poziție și prima liberă.
		 * 	Prin urmare ultima poziție ocupată este n-1 sau numărElemente-1
		 * 	Totodată, ulterior va trebui să incrementăm numărul elementelor, 
		 * pentru a evita o suprascriere.
		 * 
		 * !numărElemente = câte elemente am am efectiv, dar atenție indexul lor
		 * pornește de la 0, iar numărElemente va fi întotdeauna mai mare cu 1,
		 * deci va reprezenta primul loc liber din vector.
		 */
	}

	@Override
	public void adaugăPoziție(Integer elementDeAdăugat, int poziție) {
		//Prima dată trebuie să verificăm poziția.
		if(poziție < 0 || poziție > this.numărulElementelor) {			//Nu trebuie să fie mai mare ca prima poziție liberă (numărElemente).
			System.out.println("Eroare, poziția nu este validă");
		}
		
		//Apoi verificăm ca vectorul să nu fie plin.
		if(this.numărulElementelor == this.capacitate) {
			this.capacitate = this.capacitate*2;			//dublăm capacitatea.
			int[] vectorNou = new int[capacitate];
			
			//Copiem elementele existente în vectorul nou.
			for (int i=0; i<this.numărulElementelor; i++) {
				vectorNou[i] = this.elemente[i];
			}
			
			//Trebuie să reținem în elemente adresa vectoruluiNou.
			this.elemente = vectorNou;
		}
		
		//Mutăm elementele la dreapta, pentru a face loc elementuluiDeAdăugat.
		for(int i=this.numărulElementelor; i > poziție; i--) {
			this.elemente[i] = this.elemente[i-1];
		}
		
		this.elemente[poziție] = elementDeAdăugat;					//Punem elementul pe poziția eliberată.
		this.numărulElementelor = this.numărulElementelor +1;		//Creștem numărul elementelor, pentru a avea o poziție liberă.
	}

	@Override
	public Integer ștergePoziție(int poziție) {
		//Prima dată trebuie să verificăm poziția să fie validă.
		if(poziție < 0 || poziție >= this.numărulElementelor) {
			System.out.println("Eroare, poziția nu este validă");
		}
		
		//Reținem elementul de șters pentru a-l putea returna.
		int elementDeȘters = this.elemente[poziție];
		
		//Mutăm elementele la stângă.
		for(int i = poziție; i < this.numărulElementelor-1; i++) {
			this.elemente[i] = this.elemente[i+1];
		}
		
		//Decrementăm numărulElementelor.
		this.numărulElementelor = this.numărulElementelor - 1;
		
		return elementDeȘters;
	}
	/*	Prima dată trebuie să verificam poziția să fie validă.
	 * 
	 *	!Atenție când ștergem un element condiția if verifică ca poziția să nu fie mai mare 
	 *	sau egal ca numărElemente pentru că teoretic numărElemente este prima poziție liberă, 
	 *	spre deosebire de adăugare pe poziție(unde verificăm să nu fie strict mai mare).
	 */	
	
}
