package com.stefanini.hn.builder.manager;

import com.stefanini.hn.builder.abstracts.PizzaBuilder;

public class BuilderExample {
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
