package com.stefanini.hn.factorymethod.manager;

import com.stefanini.hn.factorymethod.abstracts.Creator;
import com.stefanini.hn.factorymethod.abstracts.Product;

/**
 * ConcreteProduct.
 *
 * @author Yuny Rene Rodriguez Perez <mailto: yrperez@stefanini.com />
 * @version 
 * @see 
 * @since 02-12-2019 11:10:06 AM 2019
 */
public class ConcreteProduct implements Product{

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String args[]) {
		Creator aCreator;
		aCreator = new ConcreteCreator();
		System.out.println(aCreator.anOperation().perform());
	}

	/* (non-Javadoc)
	 * @see com.stefanini.hn.factorymethod.abstracts.Product#perform()
	 */
	public String perform() {	
		return "Creacion de Producto";
	}

	
}
