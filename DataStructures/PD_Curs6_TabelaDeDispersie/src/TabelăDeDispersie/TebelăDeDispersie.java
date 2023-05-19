package TabelăDeDispersie;
/* Prealabil:
 * 	FUNCȚIA DE DISPERSIE este: d(c) = (c%m).
 * 		Aceasta va returna o valoare în intervalul 0,m-1.
 * 		Elementele funcției sunt c = elementulDeAđăugat și m = capacitateaTabelei (vectoruluiDinamic).
 *	
 *	Tabela de dispersi o folosim la continere unde NU avem poziții (toate în afară de Listă).
 * 
 * 	Coliziunea reprezintă situația în care 2 elemente diferite ar trebui puse pe aceeași poziție.
 * 		Rezolvarea coliziunilor (x2 metode):
 * 			a. Prin liste independente;
 * 			b. Prin adresare deschisă.
 * 
 * 	
 * 	Factorul de încărcare (Load factor) 𝞪 = n/m.
 * 		Mai exact: numărulDeElemente / Capacitate (sau numărul de poziții).
 * 	Indiferent de modul în care tratăm coliziunea, avem nevoie să știm cât de plin e vectorul dinamic
 * al tabelei de dispersie.
 * 	
 * 		În cazul rezolvării cu adresare deschisă 𝞪 (i.e. factorul de încărcare),
 * poate fi maxim 1, mai exact atunci când numarulDeElemente (n) este egal cu
 * numărul de poziții (m sau capacitatea vectoruluiDinamic).
 * 		Acest maxim reise din modul în care așezăm elementele tabelei de dispersie,
 * care în cazul adresării deschise vor fi puse chiar în vectorul dinamic, iar NU
 * în afara sa (NU într-o listă independentă).
 */


public class TebelăDeDispersie {

	
	
	
	
}
