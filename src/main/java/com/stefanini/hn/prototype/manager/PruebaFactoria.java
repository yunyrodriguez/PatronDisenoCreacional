package com.stefanini.hn.prototype.manager;

/**
 * PruebaFactoria.
 *
 * @author Yuny Rene Rodriguez Perez <mailto: yrperez@stefanini.com />
 * @version 
 * @see 
 * @since 02-12-2019 10:48:25 AM 2019
 */
public class PruebaFactoria {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	static public void main(String[] args) {
		FactoriaPrototipo factoria = new FactoriaPrototipo();
		Producto producto = (Producto) factoria.create("producto 1");
		System.out.println("Este es el objeto creado: " + producto);
	}
}
