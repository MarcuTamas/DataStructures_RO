package probleme;

//Proceduri și funcții.

public class TotFelulDeTablouri {
	public static void totFelulDeTablouriProcedură() {
		int[] numerePare = new int[10];
		int numărulNumerelorPare, numărulNumerelorImpare, i;
		numărulNumerelorPare = 10;
		
		//Populăm tabloul de numere pare.
		for(i=0; i<10; i++) {
			numerePare[i] = i*2;
		}
		
		int numereImpare[] = new int[15];
		numărulNumerelorImpare = 15;
		
		//Populăm tabloul de numre impare (de aceea scădem 1).
		for(i=0; i<15; i++) {
			numereImpare[i] = i*2-1;
		}
		
		AfișareTablou.aifșareTablou(numerePare, numărulNumerelorPare);
		AfișareTablou.aifșareTablou(numereImpare, numărulNumerelorImpare);
	}
	
	public static void totFelulDeTablouriFuncție() {
		int[] numerePare = new int[10];
		int numărulNumerelorPare, numărulNumerelorImpare, i;
		numărulNumerelorPare = 10;
		
		//Populăm tabloul de numere pare.
		for(i=0; i<10; i++) {
			numerePare[i] = i*2;
		}
		
		int numereImpare[] = new int[15];
		numărulNumerelorImpare = 15;
		
		//Populăm tabloul de numre impare (de aceea scădem 1).
		for(i=0; i<15; i++) {
			numereImpare[i] = i*2-1;
		}

		int sumaPare = SumaElemente.sumaElemente(numerePare, numărulNumerelorPare);
		System.out.println("Suma elementelor din numere pare: " + sumaPare);
		
		int sumaImpare = SumaElemente.sumaElemente(numereImpare, numărulNumerelorImpare);
		System.out.println("Suma elementelor din numere impare: " + sumaImpare);
	}
	
}
