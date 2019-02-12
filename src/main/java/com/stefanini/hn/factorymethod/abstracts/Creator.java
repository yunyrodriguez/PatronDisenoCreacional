package com.stefanini.hn.factorymethod.abstracts;

public abstract class Creator {

	public Product anOperation() {
		Product aProduct = factoryMethod();
		return aProduct;
	}

	protected abstract Product factoryMethod();
}