package com.stefanini.hn.builder.manager;

import com.stefanini.hn.builder.manager.Pizza;

/**
 * PizzaBuilder.
 *
 * @author Yuny Rene Rodriguez Perez <mailto: yrperez@stefanini.com />
 * @version 
 * @see 
 * @since 02-12-2019 11:05:48 AM 2019
 */
public abstract class PizzaBuilder {
	
	/** Attribute that determine pizza. */
	protected Pizza pizza;

	/**
	 * Gets the pizza.
	 *
	 * @return the pizza
	 */
	public Pizza getPizza() {
		return pizza;
	}

	/**
	 * Creates the new pizza.
	 */
	public void createNewPizza() {
		pizza = new Pizza();
		buildDough();
		buildSauce();
		buildFilling();
	}

	/**
	 * Builds the dough.
	 */
	public abstract void buildDough();
	
	/**
	 * Builds the sauce.
	 */
	public abstract void buildSauce();
	
	/**
	 * Builds the filling.
	 */
	public abstract void buildFilling();
}
