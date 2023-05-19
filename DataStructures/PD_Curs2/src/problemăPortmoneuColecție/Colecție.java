package problemăPortmoneuColecție;

import java.util.*;

public interface Colecție<T>{
	public void adauga(T element);

	public void sterge(T element);

	public int numarulElementelor();

	public boolean cauta(T element);

	Iterator<T> iterator();

}
