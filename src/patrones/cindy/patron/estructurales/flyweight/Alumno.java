package patron.estructurales.flyweight;

public class Alumno {
	private String nombre;
	private String apellido;
	private double promedio;
	private double promedioGeneral;
	
	public Alumno(double promedioGeneral) {
		setPromedioGeneral(promedioGeneral);
	}
	private void setPromedioGeneral(double promedioGeneral2) {
		// TODO Auto-generated method stub
		
	}
	public double compara() {
		return(((double) promedio) / promedioGeneral - 1)*100.0;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public double getPromedio() {
		return promedio;
	}
	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}
	public double getPromedioGeneral() {
		return promedioGeneral;
	}
	

}
