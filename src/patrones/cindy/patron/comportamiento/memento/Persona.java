package patron.comportamiento.memento;

public class Persona {
	private String nombre;
	
	public Memento saveToMemento() {
		System.out.println("  ");
		System.out.println("**** Test Memento ****  ");
		System.out.println("Originator: Guardando Momento...");
		System.out.println("  ");
		return new Memento(nombre);
	}
	public void restoreFromMemento(Memento m) {
		nombre = m.getSavedState();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
