package patron.estructurales.proxy;

import java.util.ArrayList;

public class GuardarDatos implements IGuardar{
	public void save(ArrayList datosAGuardar) {
		if (ConnectionManager.hayConexion())
			new ObjetoRemoto().save(datosAGuardar);
		else 
			new GuardarDiscoDuro().save(datosAGuardar);
	}
}
