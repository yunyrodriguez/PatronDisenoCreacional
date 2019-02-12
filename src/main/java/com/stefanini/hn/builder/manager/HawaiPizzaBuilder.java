package com.stefanini.hn.builder.manager;

import com.stefanini.hn.builder.abstracts.PizzaBuilder;

public class HawaiPizzaBuilder extends PizzaBuilder {
	public void buildMasa() {
		pizza.setMasa("suave");
	}

	public void buildSalsa() {
		pizza.setSalsa("dulce");
	}

	public void buildRelleno() {
		pizza.setRelleno("chorizo+alcachofas");
	}
}
