package patron.comportamiento.command;
import patron.comportamiento.command.IServer;

public class USAServer implements IServer{
	public void apagate() {
		System.out.println("Apagando el servidor de USA");
	}
	public void cerraConexion() {
		System.out.println("Cerrando conexion con el servidor de USA");
	}
	public void conectate() {
		System.out.println("Conectando al servidor de USA");
	}
	public void guardaLog() {
		System.out.println("Guarda Log de USA");
	}
	public void prendete() {
		System.out.println("Pendiente el servidor de USA");
	}
	public void verificaConexion() {
		// TODO Auto-generated method stub
		
	}
}
