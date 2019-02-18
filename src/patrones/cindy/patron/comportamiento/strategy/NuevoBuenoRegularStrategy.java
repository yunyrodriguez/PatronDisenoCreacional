package patron.comportamiento.strategy;

import java.util.ArrayList;

import patron.comportamiento.observer.Libro;

public class NuevoBuenoRegularStrategy implements LibroStrategy{

	public Libro findLibro(String titulo) {
	ArrayList<Libro> libros = Biblioteca.obtenerLibros();
	Libro libro = new Libro();
	libro.setEstado("Nuevo");
	return libro;
	}
}
