package probleme;

public class SumaElemente {
	public static int sumaElemente(int[] tablou, int lungimeTablou) {
		int suma, i;
		suma = 0;
		
		for(i=0; i<lungimeTablou; i++) {
			suma += tablou[i];
		}
		
		return suma;
	}

/*	Varianta 2: reținem cele 2 sume, sânga si dreapta, 
 * și când avansăm cu o poziție, pur și simplu 
 * adunăm elementul următor la suma ștânga și scădeum un element din suma dreapta.
 */
}
