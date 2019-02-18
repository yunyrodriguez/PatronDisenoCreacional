package patron.comportamiento.state;

public class Abierta implements EstadoVentanilla {

	public void atende(Personal personal) {
		System.out.println("Atendiendo a: " + personal.getNombre());

	}

}
