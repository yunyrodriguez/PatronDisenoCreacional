package patron.comportamiento.observer;

public class Administracion implements ILibroMalEstado {
	public void update() {
		System.out.println("   ");
		System.out.println("Administracion: ");
		System.out.println("Envio una queja formal... ");
	}
}
