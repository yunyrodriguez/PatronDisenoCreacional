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
		String romano ="LXI";
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
			
		System.out.println(context.output);
		
	}
	
	
}