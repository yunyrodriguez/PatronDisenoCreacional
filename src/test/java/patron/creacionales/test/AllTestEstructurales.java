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
import patron.estructurales.facade.AdministracionAlquiler;
import patron.estructurales.facade.Cliente;
import patron.estructurales.facade.CuentasAPagar;
import patron.estructurales.facade.Inmobiliaria;
import patron.estructurales.facade.Interesado;
import patron.estructurales.facade.MuestraPropiedad;
import patron.estructurales.facade.VentaInmueble;
import patron.estructurales.flyweight.Alumno;
import patron.estructurales.wrapper.AgenteEncubierto;
import patron.estructurales.wrapper.PersonaWrapper;

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
	
	@Test
	public void flyweight() {
		double promedioDelAlumnado = 6;
		String nombres[] = {"Juan", "MAxi", "Pedro"};
		String apellidos[] = {"Perez", "Lopez", "Minna"};
		double promedios[] = {6,7,9};
		
		Alumno alumno = new Alumno(promedioDelAlumnado);
		for(int i =0; i<nombres.length; i++) {
			alumno.setNombre(nombres[i]);
			alumno.setApellido(apellidos[i]);
			alumno.setPromedio(promedios[i]);
			System.out.println("**** Test flyweight****");
			System.out.println(nombres[i]+ ": "+ alumno.compara());
		}
	}
	
	@Test
	public void facade() {
		Cliente c = new Cliente();
		Interesado i = new Interesado();
		
		Inmobiliaria inmo = new  Inmobiliaria();
		inmo.atencionCliente(c);
		inmo.atencionInteresado(i);
		MuestraPropiedad muestraPropiedad = new MuestraPropiedad();
		muestraPropiedad.mostraPropiedad(123);
		VentaInmueble venta = new VentaInmueble();
		venta.gestionaVenta();
		AdministracionAlquiler alquiler = new AdministracionAlquiler();
		alquiler.cobro(1200);
		CuentasAPagar cuentasAPagar = new CuentasAPagar();
	}
	
	@Test
	public void wrapper() {
		PersonaWrapper personaWrapper = new PersonaWrapper();
		personaWrapper.setNombre("Juan");
		personaWrapper.setApellido("Gilli");
		personaWrapper.setDni("3243232590");
		personaWrapper.setEdad(43);
		personaWrapper.setDomicilio("Av Rivadivia 423");
		System.out.println("   ");
		System.out.println("***** TEST Wrapper ***** ");
		System.out.println("Datos de la persona: ");
		System.out.println(personaWrapper.getApellido() + ", " +personaWrapper.getNombre());
		System.out.println(personaWrapper.getDni());
		System.out.println(personaWrapper.getDomicilio());
		System.out.println(personaWrapper.getEdad());
		
		System.out.println("Datos del agente: ");
		AgenteEncubierto agente = new AgenteEncubierto(personaWrapper);
		System.out.println(agente.getApellido()+", " +agente.getNombre());
		System.out.println(agente.getDni());
		System.out.println(agente.getDomicilio());
		System.out.println(agente.getEdad());
	}
}
