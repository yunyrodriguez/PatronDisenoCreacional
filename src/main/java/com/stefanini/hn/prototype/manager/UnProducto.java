package com.stefanini.hn.prototype.manager;

/**
 * UnProducto.
 *
 * @author Yuny Rene Rodriguez Perez <mailto: yrperez@stefanini.com />
 * @version 
 * @see 
 * @since 02-12-2019 10:48:30 AM 2019
 */
public class UnProducto implements Producto {
	
	/** Attribute that determine atributo. */
	private int atributo;

	/**
	 * Instantiates a new un producto.
	 *
	 * @param atributo the atributo
	 */
	UnProducto(int atributo) {
		this.atributo = atributo;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {
		return new UnProducto(this.atributo);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return ((Integer) atributo).toString();
	}
}
