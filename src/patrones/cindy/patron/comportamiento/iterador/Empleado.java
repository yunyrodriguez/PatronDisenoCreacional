package patron.comportamiento.iterador;

public class Empleado {
	private String nombre;
	private String division;
	
	public Empleado(String n, String d) {
		nombre = n;
		division = d;
	}
	public String getName() {
		return nombre;
	}
	public void print() {
		System.out.println("**** Test Iterator ****");
		System.out.println("Nombre: " + nombre + " Division: " + division);
	}
}
