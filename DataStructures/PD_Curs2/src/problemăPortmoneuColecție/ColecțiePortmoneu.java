package problemăPortmoneuColecție;

import java.util.*;

public class ColecțiePortmoneu<T> implements Colecție<T> {
	private List<T> elemente;

	public ColecțiePortmoneu() {
		this.elemente = new ArrayList<T>();
	}

	public void adauga(T element) {
		this.elemente.add(element);

	}

	public void sterge(T element) {
		this.elemente.remove(element);

	}

	public int numarulElementelor() {
		return this.elemente.size();
	}

	public boolean cauta(T element) {
		return this.elemente.contains(element);
	}

	public Iterator<T> iterator() {
		return new BagIterator<T>(this);
	}

	public class BagIterator<T> implements Iterator<T> {

		private ColecțiePortmoneu<T> colectie;
		private int pozitieCurenta;

		public BagIterator(ColecțiePortmoneu<T> colectieDeIterat) {
			this.colectie = colectieDeIterat;
			this.pozitieCurenta = 0;
		}

		public boolean hasNext() {
			if (this.pozitieCurenta < this.colectie.elemente.size()) {
				return true;
			} else {
				return false;
			}
		}

		public T next() {
			T current = this.colectie.elemente.get(this.pozitieCurenta);
			this.pozitieCurenta++;
			return current;
		}

	}
}
