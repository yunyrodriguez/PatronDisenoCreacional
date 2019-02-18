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
}
