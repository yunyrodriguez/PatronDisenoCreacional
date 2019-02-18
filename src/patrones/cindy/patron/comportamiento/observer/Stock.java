package patron.comportamiento.observer;

public class Stock implements ILibroMalEstado{
	public void update() {
		System.out.println("Stock: ");
		System.out.println("Le doy de baja...");
	}

}
