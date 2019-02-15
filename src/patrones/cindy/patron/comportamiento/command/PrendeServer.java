package patron.comportamiento.command;

public class PrendeServer implements Command {
	private IServer servidor;
	
	public PrendeServer(IServer servidor) {
		this.servidor = servidor;
	}
	
	public void execute() {
		servidor.conectate();
		servidor.verificaConexion();
		servidor.prendete();
		servidor.guardaLog();
		servidor.cerraConexion();
		
	}
}
