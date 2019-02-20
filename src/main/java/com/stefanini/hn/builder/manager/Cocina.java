package com.stefanini.hn.builder.manager;


/**
 * Cocina.
 *
 * @author Yuny Rene Rodriguez Perez <mailto: yrperez@stefanini.com />
 * @version 
 * @see 
 * @since 02-12-2019 10:47:11 AM 2019
 */
public class Cocina {
	
	/** Attribute that determine pizzaBuilder. */
	private PizzaBuilder pizzaBuilder;

	/**
	 * Sets the pizza builder.
	 *
	 * @param pb the new pizza builder
	 */
	public void setPizzaBuilder(PizzaBuilder pb) {
		pizzaBuilder = pb;
	}

	/**
	 * Gets the pizza.
	 *
	 * @return the pizza
	 */
	public Pizza getPizza() {
		return pizzaBuilder.getPizza();
	}

	/**
	 * Construir pizza.
	 */
	public void construirPizza() {
		pizzaBuilder.createNewPizza();
	
	}
}
