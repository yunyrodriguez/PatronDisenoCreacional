package com.stefanini.hn.factorymethod.manager;

import com.stefanini.hn.factorymethod.abstracts.Creator;
import com.stefanini.hn.factorymethod.abstracts.Product;

public class ConcreteProduct implements Product{

	public static void main(String args[]) {
		Creator aCreator;
		aCreator = new ConcreteCreator();
		aCreator.anOperation();
	}

	public String hacer() {
		
		return null;
	}

	
}
