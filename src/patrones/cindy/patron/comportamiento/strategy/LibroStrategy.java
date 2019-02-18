package patron.comportamiento.strategy;

import patron.comportamiento.observer.Libro;

public interface LibroStrategy {
	public Libro findLibro(String titulo);
}
