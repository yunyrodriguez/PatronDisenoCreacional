package patron.comportamiento.command;

public class ArgentinaServer implements IServer {
	public void apagate() {
		System.out.println("Apagando el servidor de Argentina");
	}
	public void cerraConexion() {
		System.out.println("Cerrando conexion con el servidor de Argentina");
	}
	public void conectate() {
		System.out.println("Conectando al servidor de Argentina");
	}
	public void guardaLog() {
		System.out.println("Guarda Log de Argentina");
	}
	public void prendete() {
		System.out.println("Pendiente el servidor de Argentina");
	}
	public void verificaConexion() {
		// TODO Auto-generated method stub
		
	}
}
