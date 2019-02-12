package com.stefanini.hn.singleton.manager;

/**
 * Principal.
 *
 * @author Yuny Rene Rodriguez Perez <mailto: yrperez@stefanini.com />
 * @version 
 * @see 
 * @since 02-12-2019 10:48:37 AM 2019
 */
public class Principal {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		Singleton c = Singleton.getInstance("miurl", "mibaseDatos");
		System.out.println(c.getUrl());
		System.out.println(c.getBaseDatos());

	}

}
