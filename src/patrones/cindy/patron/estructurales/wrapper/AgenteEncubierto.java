package patron.estructurales.wrapper;

public class AgenteEncubierto {
	private PersonaWrapper personaWrapper;
	
	public AgenteEncubierto(PersonaWrapper personaWrapper) {
		this.personaWrapper = personaWrapper;
	}
	public String getApellido() {
		return "Perez";
	}
	public String getDomicilio() {
		return "Av Independencia 5321";
	}
	public int getEdad() {
		return personaWrapper.getEdad();
	}
	public String getNombre() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getDni() {
		// TODO Auto-generated method stub
		return null;
	}
}
