package com.stefanini.hn.builder.abstracts;

import com.stefanini.hn.builder.manager.Pizza;

public abstract class OtroPizzaBuilder {
	protected Pizza pizza;

	public Pizza getPizza() {
		return pizza;
	}

	public void crearNuevaPizza() {
		pizza = new Pizza();
		buildMasa();
		buildSalsa();
		buildRelleno();
	}
	
	public abstract void buildMasa();
	public abstract void buildSalsa();
	public abstract void buildRelleno();
}