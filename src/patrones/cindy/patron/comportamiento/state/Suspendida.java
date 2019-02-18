package patron.comportamiento.state;

public class Suspendida implements EstadoVentanilla {

	public void atende(Personal personal) {
		if (personal.getEdad() >65) {
			System.out.println("Atendiendo a: " +personal.getNombre());
		}else {
			System.out.println("Espere 5 minutos por favor...");
		}

	}

}
