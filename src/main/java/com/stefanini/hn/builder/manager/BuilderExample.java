package com.stefanini.hn.builder.manager;

import com.stefanini.hn.builder.abstracts.PizzaBuilder;

/**
 * BuilderExample.
 *
 * @author Yuny Rene Rodriguez Perez <mailto: yrperez@stefanini.com />
 * @version 
 * @see 
 * @since 02-12-2019 10:47:06 AM 2019
 */
public class BuilderExample {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		Cocina cocina = new Cocina();
		PizzaBuilder hawai_pizzabuilder = new HawaiPizzaBuilder();
		PizzaBuilder picante_pizzabuilder = new PicantePizzaBuilder();

		cocina.setPizzaBuilder(picante_pizzabuilder);
		cocina.construirPizza();

		Pizza pizza = cocina.getPizza();
		System.out.println(pizza.toString());
	}
}
