package patron.estructurales.composite;

public class Empleado implements ISueldo{
	private String nombreCompleto, cargo;
	private double sueldo;
	
	
	public Empleado(String nombreCompleto, String cargo, double sueldo) {
		super();
		this.nombreCompleto = nombreCompleto;
		this.cargo = cargo;
		this.sueldo = sueldo;
	}
	public double getSueldo() {
		return sueldo;
	}
	
}
