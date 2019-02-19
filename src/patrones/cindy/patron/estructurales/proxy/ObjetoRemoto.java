package patron.estructurales.proxy;

import java.util.ArrayList;

public class ObjetoRemoto implements IGuardar{
	public void save(ArrayList datosAGuardar) {
		System.out.println("Guardando datos en el objeto remoto...");
	}
}
