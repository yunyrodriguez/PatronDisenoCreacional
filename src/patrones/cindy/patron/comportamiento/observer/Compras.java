package patron.comportamiento.observer;

public class Compras implements ILibroMalEstado{
	public void update() {
		System.out.println(" **** Test Observer ****   ");
		System.out.println("Compras: ");
		System.out.println("Solicito nueva cotizacion...");
	}

}
