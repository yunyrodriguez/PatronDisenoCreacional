package com.stefanini.hn.builder.manager;

import com.stefanini.hn.builder.abstracts.PizzaBuilder;

public class PicantePizzaBuilder extends PizzaBuilder {
	public void buildMasa() {
		pizza.setMasa("cocida");
	}

	public void buildSalsa() {
		pizza.setSalsa("picante");
	}

	public void buildRelleno() {
		pizza.setRelleno("pimienta+salchichón");
	}
}