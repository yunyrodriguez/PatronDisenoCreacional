package com.stefanini.hn.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;

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
import com.stefanini.hn.dis.comportamiento.command.manager.Command;
import com.stefanini.hn.dis.comportamiento.command.manager.HondurasServer;
import com.stefanini.hn.dis.comportamiento.command.manager.Invoker;
import com.stefanini.hn.dis.comportamiento.command.manager.OnServer;
import com.stefanini.hn.dis.comportamiento.interpreter.abstracts.Expression;
import com.stefanini.hn.dis.comportamiento.interpreter.manager.Context;
import com.stefanini.hn.dis.comportamiento.interpreter.manager.HundredExpression;
import com.stefanini.hn.dis.comportamiento.interpreter.manager.OneExpression;
import com.stefanini.hn.dis.comportamiento.interpreter.manager.TenExpression;
import com.stefanini.hn.dis.comportamiento.interpreter.manager.ThousandExpression;
import com.stefanini.hn.dis.comportamiento.iterator.manager.Division;
import com.stefanini.hn.dis.comportamiento.iterator.manager.Employee;
import com.stefanini.hn.dis.comportamiento.mediator.manager.ChatRoom;
import com.stefanini.hn.dis.comportamiento.mediator.manager.User;
import com.stefanini.hn.dis.comportamiento.memento.manager.Caretaker;
import com.stefanini.hn.dis.comportamiento.memento.manager.Memento;
import com.stefanini.hn.dis.comportamiento.memento.manager.Person;
import com.stefanini.hn.dis.comportamiento.observer.manager.Book;
import com.stefanini.hn.dis.comportamiento.observer.manager.BookAlarm;
import com.stefanini.hn.dis.comportamiento.observer.manager.Library;
import com.stefanini.hn.dis.comportamiento.observer.manager.Manager;
import com.stefanini.hn.dis.comportamiento.observer.manager.Purchases;
import com.stefanini.hn.dis.comportamiento.observer.manager.Stock;
import com.stefanini.hn.dis.comportamiento.state.manager.BankState;
import com.stefanini.hn.dis.comportamiento.state.manager.PersonState;
import com.stefanini.hn.dis.comportamiento.strategy.manager.BookFinder;
import com.stefanini.hn.dis.comportamiento.strategy.manager.Partner;
import com.stefanini.hn.dis.comportamiento.templatemethod.manager.Client;
import com.stefanini.hn.dis.comportamiento.templatemethod.manager.EmployeeTemplate;
import com.stefanini.hn.dis.comportamiento.templatemethod.manager.PartnerTemplate;
import com.stefanini.hn.dis.comportamiento.templatemethod.manager.PersonTemplate;
import com.stefanini.hn.dis.comportamiento.visitor.manager.DiscountProduct;
import com.stefanini.hn.dis.comportamiento.visitor.manager.IVA;
import com.stefanini.hn.dis.comportamiento.visitor.manager.ProductNormal;
import com.stefanini.hn.dis.estructural.adapter.manager.OldPerson;
import com.stefanini.hn.dis.estructural.adapter.manager.OldToNewPerson;
import com.stefanini.hn.dis.estructural.bridger.manager.Circle;
import com.stefanini.hn.dis.estructural.bridger.manager.DottedDrawing;
import com.stefanini.hn.dis.estructural.bridger.manager.NormalDrawing;
import com.stefanini.hn.dis.estructural.bridger.manager.Rectangle;
import com.stefanini.hn.dis.estructural.composite.manager.Compound;
import com.stefanini.hn.dis.estructural.composite.manager.Sheet;
import com.stefanini.hn.dis.estructural.decorator.manager.PersonDecorator;
import com.stefanini.hn.dis.estructural.decorator.manager.UndercoverAgent;
import com.stefanini.hn.dis.estructural.facade.manager.AccountsPayable;
import com.stefanini.hn.dis.estructural.facade.manager.ClientFacade;
import com.stefanini.hn.dis.estructural.facade.manager.Interested;
import com.stefanini.hn.dis.estructural.facade.manager.RealEstate;
import com.stefanini.hn.dis.estructural.facade.manager.RealEstateSale;
import com.stefanini.hn.dis.estructural.facade.manager.RentalAdministration;
import com.stefanini.hn.dis.estructural.facade.manager.ShowProperty;
import com.stefanini.hn.dis.estructural.flyweight.manager.StudentFlyweight;
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
		GregorianCalendar calendar = new GregorianCalendar();
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

	@Test
	public void command() {
		System.out.println("**Command**");
		Command command = new OnServer(new HondurasServer());
		Invoker serverAdmin = new Invoker(command);
		serverAdmin.running();
		System.out.println("");
	}

	@Test
	public void interpreter() {
		System.out.println("**Interpreter**");
		String roman = "XVIII";
		Context context = new Context(roman);
		ArrayList<Expression> tree = new ArrayList<Expression>();
		tree.add(new ThousandExpression());
		tree.add(new HundredExpression());
		tree.add(new TenExpression());
		tree.add(new OneExpression());

		Iterator<Expression> it = tree.iterator();
		while (it.hasNext()) {
			Expression exp = it.next();
			exp.interpreter(context);
		}
		System.out.println(context.output);
		System.out.println("");
	}
	@Test
	public void iterator() {
		System.out.println("**Iterator**");
		Division division = new Division("Mi Sucursal");
		division.add("Empleado 1");
		division.add("Empleado 2");
		
		Iterator<Employee> iterator = division.iterator();
		while (iterator.hasNext()) {
			Employee employee = (Employee) iterator.next();
			employee.print();
			employee.toString();
		}
		System.out.println("");
	}
	
	@Test
	public void mediator () {
		System.out.println("**Mediator**");
		ChatRoom room = new ChatRoom();
		User user = new User(room);
		user.setName("Carlos");
		room.register(user);
		
		User user2 = new User(room);
		user2.setName("Logan");
		room.register(user2);
		
		User user3 = new User(room);
		user3.setName("Santiago");
		room.register(user3);
		
		user.send("Logan", "Hola que tal");
		user2.send("Carlos", "Todo tranquilo y vos?");
		user3.send("Oscar", "Oscar estas?");
		System.out.println("");
	}
	@Test
	public void memento() {
		System.out.println("**Memento**");
		Caretaker caretaker = new Caretaker();
		
		Person  person = new Person();
		person.setName("Julio");
		person.setName("Ramon");
		
		caretaker.addMemento(person.saveToMemento());
		person.setName("Carmen");
		
		caretaker.addMemento(person.saveToMemento());
		person.setName("Mariana");
		Memento memento1 = caretaker.getMemento(0);
		Memento memento2 = caretaker.getMemento(1);
		
		System.out.println(memento1.getSavedState());
		System.out.println(memento2.getSavedState());
		System.out.println("");
	}
	
	@Test
	public void observer() {
		System.out.println("**Observer**");
		BookAlarm alarm = new BookAlarm();
		alarm.attach(new Purchases());
		alarm.attach(new Manager());
		alarm.attach(new Stock());
		Book book = new Book();
		book.setState("Malo");

		Library library = new Library();
		library.returnBook(book);
		System.out.println("");
	}
	
	@Test
	public void state() {
		System.out.println("**State**");
		PersonState person1 = new PersonState("Sofia", "Gomez", 25);
		PersonState person2 = new PersonState("Asthon", "Kuthcher", 65);
		PersonState person3 = new PersonState("Ronaldo", "Ramirez", 40);
		PersonState person4 = new PersonState("Oscar", "Guiti", 100);
		
		BankState bank = new BankState();
		bank.attend(person1);
		bank.windowSuspend();
		
		bank.attend(person2);
		bank.attend(person3);
		
		bank.closeWindow();
		bank.attend(person4);
		System.out.println("");
	}
	
	@Test
	public void strategy() {
		System.out.println("**Strategy**");
		Partner partner = new Partner();
		Book book = new BookFinder().findBook(partner,"Libro de java");
		System.out.println(book.getState());
		System.out.println("");
	}
	@Test
	public void templateMethod() {
		System.out.println("**Template Method**");
		PersonTemplate person = new Client(12121);
		System.out.println("El cliente dice: ");
		System.out.println(person.identify());
		
		System.out.println("El empleado dice: ");
		person = new EmployeeTemplate("AD 42157");
		System.out.println(person.identify());
		
		System.out.println("El socio dice: ");
		person = new PartnerTemplate(45474);
		System.out.println(person.identify());
		System.out.println("");
	}
	@Test
	public void visitor() {
		
		System.out.println("**Visitor**");
		DiscountProduct product1 = new DiscountProduct();
		product1.setPrice(100);
		ProductNormal product2 = new ProductNormal();
		product2.setPrice(100);
		
		IVA iva = new IVA();
		double result1 = product1.accept(iva);
		double result2 = product2.accept(iva);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println("");
	}
	
	@Test
	public void composite() {
		
		System.out.println("**Composite**");
		Compound root = new Compound("root");
		root.add(new Sheet("hoja A"));
		root.add(new Sheet("hoja b"));
		Compound comp = new Compound("compuesto X");
		comp.add(new Sheet("hoja XA"));
		comp.add(new Sheet("hoja XB"));
		root.add(comp);
		root.add(new Sheet("hoja C"));
		Sheet l = new Sheet("hoja D");
		root.add(l);
		root.delete(l);
		root.show(1);
		System.out.println("");
	}
	
	@Test
	public void decorator() {
		
		System.out.println("**Decorator**");
		PersonDecorator person = new PersonDecorator();
	    person.setName("Sofia");
	    person.setLastName("Ulloa");
	    person.setDni("788748754875");
	    person.setAge(60);
	    person.setAddress("col. trapiche");
	    
	    System.out.println("Datos de persona");
	    System.out.println(person.getLastName() + ", "+ person.getName());
	    System.out.println(person.getDni());
	    System.out.println(person.getAddress());
	    System.out.println(person.getAge());
	    
	    System.out.println("Datos del agente");
	    UndercoverAgent agent = new UndercoverAgent(person);
	    System.out.println(agent.getLastName()+", "+agent.getName());
	    System.out.println(agent.getDNI());
	    System.out.println(agent.getAddress());
	    System.out.println(agent.getAge());
	    System.out.println("");
	}
	@Test
	public void facade() {
		
		System.out.println("**Facade**");
		ClientFacade c = new ClientFacade();
		Interested i = new Interested();
		
		RealEstate real = new RealEstate();
		real.customerCare(c);
		real.interestedAttention(i);
		ShowProperty showProperty = new ShowProperty();
		showProperty.showProperty(123);
		RealEstateSale sale = new RealEstateSale();
		sale.managementSale();
		RentalAdministration rental = new RentalAdministration();
		rental.payment(1200);
		AccountsPayable accountsPayable = new AccountsPayable();
		accountsPayable.ownerPayment(1100);
		
		RealEstate real2 = new RealEstate();
		real2.attention(i);
		real2.attention(c);
		System.out.println("");
	}
	
	@Test
	public void flyweight() {
		
		System.out.println("**Flyweight**");
		double averageStudent = 6;
		String names[] = {"Carlos","Maria","Pedro"};
		String lastNames[] = {"Ventura","Fiallos","Rodriguez"};
	    double average[] = {6,7,9};
	    
	    StudentFlyweight student = new StudentFlyweight(averageStudent);
	    for(int i = 0; i < names.length; i++) {
	    	student.setName(names[i]);
	    	student.setLastName(lastNames[i]);
	    	student.setAverage(average[i]);
	    	System.out.println(names[i]+":"+student.compare());
	    }
	    System.out.println("");
	}
}
