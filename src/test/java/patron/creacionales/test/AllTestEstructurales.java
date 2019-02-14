package patron.creacionales.test;

import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.Test;

import patron.estructurales.adapter.PersonaVieja;
import patron.estructurales.adapter.ViejaToNuevaAdapter;
import patron.estructurales.bridge.Circulo;
import patron.estructurales.bridge.DibujandoNormal;
import patron.estructurales.bridge.DibujandoPunteado;
import patron.estructurales.bridge.Rectangulo;
import patron.estructurales.composite.Banco;
import patron.estructurales.composite.Empleado;
import patron.estructurales.composite.SectorAdministrativo;
import patron.estructurales.composite.SectorCajas;
import patron.estructurales.composite.SectorContaduria;
import patron.estructurales.composite.SectorGerencia;
import patron.estructurales.composite.SectorRRHH;
import patron.estructurales.decorator.AireAcondicionado;
import patron.estructurales.decorator.CdPlayer;
import patron.estructurales.decorator.FiatUno;
import patron.estructurales.decorator.FordFiesta;
import patron.estructurales.decorator.Gasoil;
import patron.estructurales.decorator.Mp3Player;
import patron.estructurales.decorator.Vendible;

public class AllTestEstructurales {
	@Test
	public void adapter() {
		PersonaVieja personaVieja = new PersonaVieja();
		System.out.println("  ");
		personaVieja.setApellido("Lopez");
		personaVieja.setNombre("Cindy");
		GregorianCalendar g = new GregorianCalendar();
		g.set(1993, 05,10);
		Date d = (Date) g.getTime();
		personaVieja.setFechaDeNacimiento(d);
		
		ViejaToNuevaAdapter personaNueva = new ViejaToNuevaAdapter(personaVieja);
		System.out.println(personaNueva.getEdad());
		System.out.println(personaNueva.getNombre());
		System.out.println("  ");
		personaNueva.setEdad(20);
		personaNueva.setNombre("Sarahi Argueta");
		
		System.out.println(personaNueva.getEdad());
		System.out.println(personaNueva.getNombre());
	}

	@Test
	public void bridge() {
		Rectangulo rectangulo = new Rectangulo(new DibujandoPunteado(), 1, 1, 2, 2);
		rectangulo.dibuja();

		Circulo circulo = new Circulo(new DibujandoNormal(), 2, 2, 3);
		circulo.dibuja();
	}
	
	/*@Test
	public void composite() {
		Banco banco = new Banco();
		SectorAdministrativo administracion = new SectorAdministrativo();
		SectorCajas cajas = new SectorCajas();
		SectorContaduria contaduria = new SectorContaduria();
		SectorGerencia gerencia = new SectorGerencia();
		SectorRRHH rrhh = new SectorRRHH();
		
		banco.agrega(gerencia); 
		banco.agrega(contaduria);
		banco.agrega(administracion);
		administracion.agrega(cajas);
		administracion.agrega(rrhh);
		
		Empleado cajero1 = new Empleado("Juan Perez", "Cajero", 2000);
		Empleado cajero2 = new Empleado("Pablo Gutierrez", "Cajero", 2000);
		cajas.agrega(cajero1);
		cajas.agrega(cajero2);
		
		Empleado gerente = new Empleado("Paco Guzman ", "Gerente", 5000);
		gerencia.agrega(gerente);
		
		Empleado selectoral = new Empleado("Maria Jimenez ", "Selectora", 1500);
		rrhh.agrega(selectoral);
		
		Empleado contador = new Empleado("Juan Perez ", "Contador", 3000);
		contaduria.agrega(contador);
		
		System.out.println(banco.getSueldo());
	}*/
	
	@Test
	public void decorator() {
		Vendible auto = new FiatUno();
		auto = new CdPlayer(auto);
		auto = new Gasoil(auto);
		
		System.out.println(auto.getDescripcion());
		System.out.println("Su precio es: " + auto.getPrecio());
		
		Vendible auto2 = new FordFiesta();
		auto2 = new Mp3Player(auto2);
		auto2 = new Gasoil(auto2);
		auto2 = new AireAcondicionado(auto2);
		
		System.out.println(auto2.getDescripcion());
		System.out.println("Su precio es: " + auto2.getPrecio());
	}
}
