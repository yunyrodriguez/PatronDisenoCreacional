package patron.estructurales.adapter;

import java.util.GregorianCalendar;

public class ViejaToNuevaAdapter implements IPersonaNueva {
	private IPersonaVieja vieja;
	
	public ViejaToNuevaAdapter(IPersonaVieja vieja) {
		this.vieja = vieja;
	}
	
	public  int getEdad() {
		GregorianCalendar c =new GregorianCalendar();
		GregorianCalendar c2 = new GregorianCalendar();
		c2.setTime(vieja.getFechaDeNacimiento());
		return c.get(1)-c2.get(1);
	}
	public String getNombre() {
		return vieja.getNombre() + " " + vieja.getApellido();
	}
	public void setEdad(int edad) {
		GregorianCalendar c = new GregorianCalendar();
		int anioActual = c.get(1);
		c.set(1, anioActual-edad);
		vieja.setFechaDeNacimiento(c.getTime());
	}
	public void setNombre(String nombreCompleto) {
		String[] name = nombreCompleto.split(" ");
		String firstName = name[0];
		String lastName = name[1];
		vieja.setNombre(firstName);
		vieja.setApellido(lastName);
	}
}
