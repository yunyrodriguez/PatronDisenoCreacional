package patron.comportamiento.templatemethod;

public class EmpleadoTemplate extends PersonaTemplate{
	private String legajo;
	
	public EmpleadoTemplate(String legajo) {
		setLegajo(legajo);
	}
	protected String getIdentificacion() {
		return legajo;
	}
	protected String getTipoId() {
		return "numero de legajo";
	}
	public String getLegajo() {
		return legajo;
	}
	public void setLegajo(String legajo) {
		
	}

}
