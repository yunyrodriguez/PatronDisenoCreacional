package com.stefanini.hn.factorymethod.manager;

import com.stefanini.hn.factorymethod.abstracts.Creator;
import com.stefanini.hn.factorymethod.abstracts.Product;

public class ConcreteCreator extends Creator {
	protected Product factoryMethod() {
		return new ConcreteProduct();
	}
}