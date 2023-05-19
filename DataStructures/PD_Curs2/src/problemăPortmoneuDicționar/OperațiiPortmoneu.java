package problemăPortmoneuDicționar;

import java.util.*;

public class OperațiiPortmoneu {
	public static void citeșteBancnote(Map<Integer, Integer> portmoneu) {
		int valoareBancnotă, numărVechi;
		valoareBancnotă = 1;
		
		while(valoareBancnotă != 0) {
			System.out.print("Valoarea bancnotei: ");
			Scanner in = new Scanner(System.in);
			valoareBancnotă = in.nextInt();
			
			if(valoareBancnotă != 0) {			//Nu vom adăuga ultimul element 0.
				
				//Verificăm dacă avem deja în portmoneu valoarea.
				if (!portmoneu.containsKey(valoareBancnotă)) {
					portmoneu.put(valoareBancnotă,1);			//Valoarea va fi cheia, iar 1 mereu valoarea.
				}else {
					numărVechi = portmoneu.remove(valoareBancnotă);
					portmoneu.put(valoareBancnotă, numărVechi+1);
				}
			}	
		}
	}
	
	public static int sumaTotală(Map<Integer, Integer> portmoneu) {
		int suma, valoareBancnotă, numarulBancnotelor;
		suma = 0;
		
		//Creeăm iteratorul peste Mulțimea de perechi.
		Iterator<Map.Entry<Integer, Integer>> it = portmoneu.entrySet().iterator();
		
		while(it.hasNext()) {
			Map.Entry<Integer, Integer> pereche = it.next();			//Returnăm o pereche.
			suma += (pereche.getKey()*pereche.getValue());
			//Nu mai trebuie iterator.next, deoarece funcția next returnează elementul curent și trece la următorul.
		}
		return suma;
	}
	
}
