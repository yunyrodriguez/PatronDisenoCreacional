package com.stefanini.hn.builder.manager;

import com.stefanini.hn.builder.abstracts.PizzaBuilder;

/**
 * HawaiPizzaBuilder.
 *
 * @author Yuny Rene Rodriguez Perez <mailto: yrperez@stefanini.com />
 * @version 
 * @see 
 * @since 02-12-2019 10:47:18 AM 2019
 */
public class HawaiPizzaBuilder extends PizzaBuilder {
	
	/* (non-Javadoc)
	 * @see com.stefanini.hn.builder.abstracts.PizzaBuilder#buildDough()
	 */
	@Override
	public void buildDough() {
		pizza.setDough("suave");
	}


	/* (non-Javadoc)
	 * @see com.stefanini.hn.builder.abstracts.PizzaBuilder#buildSauce()
	 */
	@Override
	public void buildSauce() {
		pizza.setSauce("dulce");
	}


	/* (non-Javadoc)
	 * @see com.stefanini.hn.builder.abstracts.PizzaBuilder#buildFilling()
	 */
	@Override
	public void buildFilling() {
		pizza.setFilling("chorizo+alcachofas");
	}
}
