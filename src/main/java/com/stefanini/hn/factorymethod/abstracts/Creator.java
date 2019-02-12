package com.stefanini.hn.factorymethod.abstracts;

/**
 * Creator.
 *
 * @author Yuny Rene Rodriguez Perez <mailto: yrperez@stefanini.com />
 * @version 
 * @see 
 * @since 02-12-2019 10:47:56 AM 2019
 */
public abstract class Creator {

	/**
	 * An operation.
	 *
	 * @return the product
	 */
	public Product anOperation() {
		Product aProduct = factoryMethod();
		return aProduct;
	}

	/**
	 * Factory method.
	 *
	 * @return the product
	 */
	protected abstract Product factoryMethod();
}