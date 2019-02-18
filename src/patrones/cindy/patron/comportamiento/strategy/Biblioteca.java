package patron.comportamiento.strategy;

import java.util.ArrayList;

import patron.comportamiento.observer.Libro;

public class Biblioteca {
	private static ArrayList<Libro> libros = new ArrayList<Libro>();
	
	public Biblioteca() {
		Libro libro = new Libro();
		libro.setEstado("Bueno");
		libro.setEstado("Un titulo");

		libros.add(libro);
	}
	public static ArrayList<Libro> obtenerLibros(){
		return libros;
	}
}
