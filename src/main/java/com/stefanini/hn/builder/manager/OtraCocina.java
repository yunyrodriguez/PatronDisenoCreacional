package com.stefanini.hn.builder.manager;

import com.stefanini.hn.builder.abstracts.OtroPizzaBuilder;

public class OtraCocina {
	private OtroPizzaBuilder pizzaBuilder;

	public void setPizzaBuilder(OtroPizzaBuilder pb) {
		pizzaBuilder = pb;
	}

	public Pizza getPizza() {
		return pizzaBuilder.getPizza();
	}

	public void construirPizza() {
		pizzaBuilder.crearNuevaPizza();
		
	}
}
