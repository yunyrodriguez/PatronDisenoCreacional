package com.stefanini.hn.factorymethod.manager;


/**
 * ConcreteCreator.
 *
 * @author Yuny Rene Rodriguez Perez <mailto: yrperez@stefanini.com />
 * @version 
 * @see 
 * @since 02-12-2019 10:48:05 AM 2019
 */
public class ConcreteCreator extends Creator {
	
	/* (non-Javadoc)
	 * @see com.stefanini.hn.factorymethod.abstracts.Creator#factoryMethod()
	 */
	protected Product factoryMethod() {
		return new ConcreteProduct();
	}
}