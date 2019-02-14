package patron.creacionales.test;

import org.junit.Test;

import patron.creacionales.builder.Cocina;
import patron.creacionales.builder.HawaiPizzaBuilder;
import patron.creacionales.builder.PicantePizzaBuilder;
import patron.creacionales.builder.Pizza;
import patron.creacionales.builder.PizzaBuilder;
import patron.creacionales.factorymethod.Triangulo;
import patron.creacionales.factorymethod.TrianguloFactory;
import patron.creacionales.factorymethod.TrianguloFactoryMethod;
import patron.creacionales.prototype.TV;
import patron.creacionales.prototype.TvProtoType;
import patron.creacionales.singleton.SingletonEjemplo;

public class AllTestCreacionales {
	
	@Test
	 public void builder() {
		 Cocina cocina = new Cocina();
		 PizzaBuilder hawai_pizzabuilder = new HawaiPizzaBuilder();
		 PizzaBuilder picante_pizzabuilder = new PicantePizzaBuilder();

		 cocina.setPizzaBuilder( hawai_pizzabuilder );
		 cocina.construirPizza();

		 Pizza pizza = cocina.getPizza();
		 System.out.println("**** Test Builder *****");
		 System.out.println(pizza.toString());
			System.out.println("");
		 }
	
	@Test
	public void factoryMethod() {
		TrianguloFactoryMethod factory = new TrianguloFactory();
		Triangulo triangulo = factory.createTriangulo(10, 10, 10);
		System.out.println("**** Test FactoryMethod *****");
		System.out.println(triangulo.getDescription());
		System.out.println("  ");
	}
	
	@Test
	public void prototype() throws Exception{
	TvProtoType tvp = new TvProtoType();
	TV tv = (TV) tvp.prototipo("plasma");
	System.out.println("**** Test Prototype *****");
	System.out.println(tv.getPrecio());
	System.out.println("  ");
	}
	
	
	@Test
	public void singleton() {
		SingletonEjemplo cindy = SingletonEjemplo.getSingletonInstance("Cindy Lopez");
    	SingletonEjemplo joel = SingletonEjemplo.getSingletonInstance("Joel Osorio");
        System.out.println(cindy.getNombre());
        System.out.println(joel.getNombre());  
        System.out.println("  ");
	}

}
