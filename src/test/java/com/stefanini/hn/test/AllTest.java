package com.stefanini.hn.test;

import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.Test;

import com.stefanini.hn.abstractfactory.abstracts.AbstractFactory;
import com.stefanini.hn.abstractfactory.manager.AmdFactory;
import com.stefanini.hn.abstractfactory.manager.IntelFactory;
import com.stefanini.hn.builder.abstracts.PizzaBuilder;
import com.stefanini.hn.builder.manager.Cocina;
import com.stefanini.hn.builder.manager.HawaiPizzaBuilder;
import com.stefanini.hn.builder.manager.PicantePizzaBuilder;
import com.stefanini.hn.builder.manager.Pizza;
import com.stefanini.hn.dis.comportamiento.chainresponsability.manager.Bank;
import com.stefanini.hn.dis.estructural.adapter.manager.OldPerson;
import com.stefanini.hn.dis.estructural.adapter.manager.OldToNewPerson;
import com.stefanini.hn.dis.estructural.bridger.manager.Circle;
import com.stefanini.hn.dis.estructural.bridger.manager.DottedDrawing;
import com.stefanini.hn.dis.estructural.bridger.manager.NormalDrawing;
import com.stefanini.hn.dis.estructural.bridger.manager.Rectangle;
import com.stefanini.hn.factorymethod.abstracts.Creator;
import com.stefanini.hn.factorymethod.manager.ConcreteCreator;
import com.stefanini.hn.prototype.manager.FactoriaPrototipo;
import com.stefanini.hn.prototype.manager.Producto;
import com.stefanini.hn.singleton.manager.Singleton;

public class AllTest {

	@Test
	public void abstractFactory() {

		AmdFactory instanciaAmd = new AmdFactory();
		IntelFactory instanciaInterl = new IntelFactory();
		obtainProduct(instanciaAmd, instanciaInterl);
	}

	private static void obtainProduct(AbstractFactory instancia1, AbstractFactory instancia2) {
		System.out.println("**Abstract Factory**");
		System.out.println(instancia1.buyDisc().getDisc());
		System.out.println(instancia2.buyMemory().getMemory());
		System.out.println("");
	}

	@Test
	public void builder() {
		Cocina cocina = new Cocina();
		PizzaBuilder hawai_pizzabuilder = new HawaiPizzaBuilder();
		PizzaBuilder picante_pizzabuilder = new PicantePizzaBuilder();

		cocina.setPizzaBuilder(picante_pizzabuilder);
		cocina.construirPizza();

		Pizza pizza = cocina.getPizza();
		System.out.println("**Builder**");
		System.out.println(pizza.toString());
		System.out.println("");
	}

	@Test
	public void prototype() {
		FactoriaPrototipo factoria = new FactoriaPrototipo();
		Producto producto = (Producto) factoria.create("producto 1");
		System.out.println("**Prototype**");
		System.out.println("Este es el objeto creado: " + producto);
		System.out.println("");
	}

	@Test
	public void singleton() {

		Singleton c = Singleton.getInstance("miurl", "mibaseDatos");
		System.out.println("**Singleton**");
		System.out.println(c.getUrl());
		System.out.println(c.getBaseDatos());
		System.out.println("");

	}

	@Test
	public void factoryMethod() {
		System.out.println("**Factory Method**");
		Creator aCreator;
		aCreator = new ConcreteCreator();
		System.out.println(aCreator.anOperation().perform());
		System.out.println("");
	}
	
	@Test
	public void adapter() {
		
		System.out.println("**Adapter**");
		OldPerson oldPerson = new OldPerson();
		oldPerson.setLastName("Campbell");
		oldPerson.setFirstName("Joel");
		GregorianCalendar calendar= new GregorianCalendar();
		calendar.set(2000, 01, 01);
		Date date = calendar.getTime();
		oldPerson.setBirthdate(date);
		
		
		OldToNewPerson newPerson = new OldToNewPerson(oldPerson);
		outPut(newPerson);

		newPerson.setAge(18);
		newPerson.setName("Oscar Garcia");
		
		outPut(newPerson);
		System.out.println("");
	}

	private void outPut(OldToNewPerson newPerson) {
		System.out.println(newPerson.getAge());
		System.out.println(newPerson.getName());
	}
	
	@Test
	public void bridge() {
		System.out.println("**Bridge**");
		Rectangle rectangle = new Rectangle(new DottedDrawing(), 1, 1, 2, 2);
		rectangle.draw();
		
		Circle circle = new Circle(new NormalDrawing(), 2, 2, 3);
		circle.draw();
		System.out.println("");
	}
	
	@Test
	public void chainResponsability() {
		System.out.println("**Chain of Responsability**");
		Bank bank = new Bank();
		bank.loanRequest(56000);
		System.out.println("");
	}

}
