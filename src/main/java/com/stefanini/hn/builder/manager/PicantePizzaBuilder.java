package com.stefanini.hn.builder.manager;

import com.stefanini.hn.builder.abstracts.PizzaBuilder;

public class PicantePizzaBuilder extends PizzaBuilder {

	/* (non-Javadoc)
	 * @see com.stefanini.hn.builder.abstracts.PizzaBuilder#buildDough()
	 */
	@Override
	public void buildDough() {
		pizza.setDough("cocida");
	}


	/* (non-Javadoc)
	 * @see com.stefanini.hn.builder.abstracts.PizzaBuilder#buildSauce()
	 */
	@Override
	public void buildSauce() {
		pizza.setSauce("picante");
	}


	/* (non-Javadoc)
	 * @see com.stefanini.hn.builder.abstracts.PizzaBuilder#buildFilling()
	 */
	@Override
	public void buildFilling() {
		pizza.setFilling("pimienta+salchichón");
	}
}