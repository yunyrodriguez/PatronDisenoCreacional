package patron.comportamiento.observer;

public class Biblioteca {
	public void devuelveLibro(Libro libro) {
		if(libro.getEstado().equals("MALO")) {
			AlarmaLibro a = new AlarmaLibro();
			a.notifyObservers();
		}
	}
}
