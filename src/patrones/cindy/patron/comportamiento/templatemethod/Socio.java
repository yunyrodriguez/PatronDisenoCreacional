package patron.comportamiento.templatemethod;

public class Socio extends PersonaTemplate {
	private int numeroDeSocio;
	
	public Socio(int numeroDeSocio) {
		setNumeroDeSocio(numeroDeSocio);
	}
	protected String getIdentificacion() {
		return String.valueOf(numeroDeSocio);
	}
	protected String getTipoId() {
		return "numero de socio";
	}
	public int getNumeroDeSocio() {
		return numeroDeSocio;
	}
	public void setNumeroDeSocio(int numeroDeSocio) {
		
	}
}
