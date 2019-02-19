package patron.estructurales.proxy;

import java.util.ArrayList;

public class GuardarDiscoDuro implements IGuardar{

	public void save(ArrayList datosAGuardar) {
		System.out.println("Guardando datos en el HD...");
	}
}
