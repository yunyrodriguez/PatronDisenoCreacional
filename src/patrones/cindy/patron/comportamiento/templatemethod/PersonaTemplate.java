package patron.comportamiento.templatemethod;

public abstract class PersonaTemplate {
	public String nombre;
	public String DNI;
	
	public String identificate() {
		String frase = "Me identifico con: ";
		frase = frase + getTipoId();
		frase = frase + ". El numero es: ";
		frase = frase + getIdentificacion();
		return frase;
	}
	protected abstract String getIdentificacion();
	protected abstract String getTipoId();
	
	public String getNombre() {
		return nombre;
	}
	
}
