package patron.comportamiento.templatemethod;

public class Cliente extends PersonaTemplate {

	private int numeroDeCliente;
	
	public Cliente(int numeroDeCliente) {
		setNumeroDeCliente(numeroDeCliente);
	}
	protected String getIdentificacion() {
		return String.valueOf(numeroDeCliente);
	}
	protected String getTipoId() {
		return "numero de cliente";
	}
	public int getNumeroDeCliente() {
		return numeroDeCliente;
	}
    public void setNumeroDeCliente(int numeroDeCliente) {
		
	}
}
