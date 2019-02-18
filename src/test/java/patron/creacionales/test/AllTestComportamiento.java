package patron.creacionales.test;


import java.util.ArrayList;
import java.util.Iterator;

import org.junit.Test;

import patron.comportamiento.Chain.Banco;
import patron.comportamiento.command.ArgentinaServer;
import patron.comportamiento.command.Command;
import patron.comportamiento.command.Invoker;
import patron.comportamiento.command.PrendeServer;
import patron.comportamiento.interpreter.Context;
import patron.comportamiento.interpreter.Expression;
import patron.comportamiento.interpreter.HundredExpression;
import patron.comportamiento.interpreter.OneExpression;
import patron.comportamiento.interpreter.TenExpression;
import patron.comportamiento.interpreter.ThousandExpression;
import patron.comportamiento.iterador.Division;
import patron.comportamiento.iterador.Empleado;
import patron.comportamiento.mediator.SalonDeChat;
import patron.comportamiento.mediator.Usuario;
import patron.comportamiento.memento.Caretaker;
import patron.comportamiento.memento.Memento;
import patron.comportamiento.memento.Persona;
import patron.comportamiento.observer.Administracion;
import patron.comportamiento.observer.AlarmaLibro;
import patron.comportamiento.observer.Biblioteca;
import patron.comportamiento.observer.Compras;
import patron.comportamiento.observer.Libro;
import patron.comportamiento.observer.Stock;
import patron.comportamiento.state.Personal;
import patron.comportamiento.templatemethod.Cliente;
import patron.comportamiento.templatemethod.EmpleadoTemplate;
import patron.comportamiento.templatemethod.PersonaTemplate;
import patron.comportamiento.templatemethod.Socio;
import patron.comportamiento.visitor.IVA;
import patron.comportamiento.visitor.ProductoDescuento;
import patron.comportamiento.visitor.ProductoNormal;
import patron.comportamiento.state.Bancos;

public class AllTestComportamiento {
	
	@Test
	public void chainResponsibility() {
		System.out.println("**** Test Chain Of Responsability ****");
		Banco banco = new Banco();
		banco.solicitudPrestamo(56000);
		System.out.println("   ");
	}
	
	@Test
	public void command() {
		System.out.println("**** Test Command ****");
		Command command = new PrendeServer(new ArgentinaServer());
		Invoker serverAdmin = new Invoker(command);
		serverAdmin.run();
		System.out.println("   ");
	}
	
	
	@Test
	public void interpreter() {
		String romano ="IX";
		Context context = new Context(romano);
		ArrayList<Expression> tree = new ArrayList<Expression>();
		tree.add(new ThousandExpression());
		tree.add(new HundredExpression());
		tree.add(new TenExpression());
		tree.add(new OneExpression());
		
			Iterator<Expression> it = tree.iterator();
			while(it.hasNext()){
				Expression exp = it.next();
				exp.interpret(context);
			}
			System.out.println("**** Interpreter ****");
		System.out.println(context.output);
		System.out.println("   ");
	}
	@Test
	public void iterator() {
		Division d = new Division("Mi Sucursal");
		d.add("Empleado 1");
		d.add("Empleado 2");
		
		Iterator<Empleado> iter = d.iterator();
		while (iter.hasNext()) {
			Empleado e = (Empleado) iter.next();
			e.print();
		}
	}
	
	@Test
	public void mediator() {
		SalonDeChat s = new SalonDeChat();
		
		Usuario u = new Usuario(s);
		u.setNombre("Sarahí");
		s.registra(u);
		
		Usuario u1 = new Usuario(s);
		u1.setNombre("Joel");
		s.registra(u1);
		
		Usuario u2 = new Usuario(s);
		u2.setNombre("Pedro");
		s.registra(u2);
		
		u.envia("Joel", "hola que tal estas?");
		u1.envia("Sarahí", "Todo bien, gracias y vos?");
		u2.envia("Yuny", "Yuny como estas?");
	}
	
	@Test
	public void memento() {
		Caretaker caretaker = new Caretaker();
		Persona p = new Persona();
		p.setNombre("Juan");
		p.setNombre("Pedro");
		
		caretaker.addMemento(p.saveToMemento());
		
		p.setNombre("Paco");
		
		caretaker.addMemento(p.saveToMemento());
		
		p.setNombre("Mateo");
		
		Memento m1 = caretaker.getMemento(0);
		Memento m2 = caretaker.getMemento(1);
		
		
		
		System.out.println(m1.getSavedState());
		System.out.println(m2.getSavedState());
	}
	@Test
	public void observer() {
		AlarmaLibro a = new AlarmaLibro();
		a.attach(new Compras());
		a.attach(new Administracion());
		a.attach(new Stock());
		
		Libro libro = new Libro();
		libro.setEstado("MALO");
		
		Biblioteca b = new Biblioteca();
		b.devuelveLibro(libro);
		
	}
	@Test
	public void state() {
		System.out.println(" **** Test State ****   ");
		Personal personal1 = new Personal("Juan", "Perez", 21);
		Personal personal2 = new Personal("Sabrina", "Campas", 71);
		Personal personal3 = new Personal("Liz", "Juarez", 82);
		Personal personal4 = new Personal("Julian", "River a la promo", 42);
		
		Bancos bancos = new Bancos();
		bancos.atende(personal1);
		
		bancos.suspendeVentanilla();
		
		bancos.atende(personal2);
		bancos.atende(personal3);
		
		bancos.cerraVentanilla();
		bancos.atende(personal4);
	}
	
	/*@Test
	public void strategy() {
		Socio socio = new Socio();
		Libro libro = new LibroFinder().findLibro(socio,"migranitodejava");
		System.out.println(libro.getEstado());
	}*/
	
	@Test
	public void templateMethod() {
		PersonaTemplate p = new Cliente(121212);
		System.out.println("**** Test Template Method **** ");
		System.out.println("El cliente dice: ");
		System.out.println(p.identificate());
		
		System.out.println("El empleado dice: ");
		p = new EmpleadoTemplate("AD 41252");
		System.out.println(p.identificate());
		
		System.out.println("El socio dice: ");
		p = new Socio(46232);
		System.out.println(p.identificate());
		System.out.println("    ");
	}
	@Test
	public void visitor() {
		ProductoDescuento producto1 = new ProductoDescuento();
		producto1.setPrecio(100);
		ProductoNormal producto2 = new ProductoNormal();
		producto2.setPrecio(100);
		
		IVA iva = new IVA();
		double resultado1 = producto1.accept(iva);
		double resultado2 = producto2.accept(iva);
		System.out.println(" ****Test visitor*** ");
		System.out.println(resultado1);
		System.out.println(resultado2);
		System.out.println("    ");
	}
	
}
