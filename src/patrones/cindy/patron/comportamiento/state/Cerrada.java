package patron.comportamiento.state;

public class Cerrada implements EstadoVentanilla {

	public void atende(Personal personal) {
		System.out.println("   ");
		System.out.println("Ventanilla cerrada!");

	}

}
