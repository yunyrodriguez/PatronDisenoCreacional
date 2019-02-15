package patron.comportamiento.command;

public class ResetServer implements Command {
	private IServer servidor;
	
	public ResetServer(IServer servidor) {
		this.servidor = servidor;
	}
	public void execute() {
		servidor.conectate();
		servidor.verificaConexion();
		servidor.guardaLog();
		servidor.apagate();
		servidor.prendete();
		servidor.guardaLog();
		servidor.cerraConexion();
	}
}
