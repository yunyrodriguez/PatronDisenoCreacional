package patron.creacionales.test;

import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.Test;

import patron.estructurales.adapter.PersonaVieja;
import patron.estructurales.adapter.ViejaToNuevaAdapter;

public class AllTestEstructurales {
	@Test
	public void adapter() {
		PersonaVieja personaVieja = new PersonaVieja();
		personaVieja.setApellido("Lopez");
		personaVieja.setNombre("Cindy");
		GregorianCalendar g = new GregorianCalendar();
		g.set(1993, 05,10);
		Date d = (Date) g.getTime();
		personaVieja.setFechaDeNacimiento(d);
		
		ViejaToNuevaAdapter personaNueva = new ViejaToNuevaAdapter(personaVieja);
		System.out.println(personaNueva.getEdad());
		System.out.println(personaNueva.getNombre());
		
		personaNueva.setEdad(20);
		personaNueva.setNombre("Sarahi Argueta");
		
		System.out.println(personaNueva.getEdad());
		System.out.println(personaNueva.getNombre());
	}

}
