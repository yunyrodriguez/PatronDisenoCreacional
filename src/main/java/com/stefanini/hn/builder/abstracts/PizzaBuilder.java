package com.stefanini.hn.builder.abstracts;

import com.stefanini.hn.builder.manager.Pizza;

public abstract class PizzaBuilder {
	protected Pizza pizza;

	public Pizza getPizza() {
		return pizza;
	}

	public void crearNuevaPizza() {
		pizza = new Pizza();
	}

	public abstract void buildMasa();

	public abstract void buildSalsa();

	public abstract void buildRelleno();
}
