package com.stefanini.hn.prototype.manager;

import java.util.HashMap;

/**
 * FactoriaPrototipo.
 *
 * @author Yuny Rene Rodriguez Perez <mailto: yrperez@stefanini.com />
 * @version 
 * @see 
 * @since 02-12-2019 10:48:16 AM 2019
 */
public class FactoriaPrototipo {
	
	/** Attribute that determine mapaObjetos. */
	private HashMap mapaObjetos;
	
	/** Attribute that determine nombrePorDefecto. */
	private String nombrePorDefecto;

	/**
	 * Instantiates a new factoria prototipo.
	 */
	public FactoriaPrototipo() {
		mapaObjetos = new HashMap();
		
		mapaObjetos.put("producto 1", new UnProducto(1));
	}

	/**
	 * Creates the.
	 *
	 * @return the object
	 */
	public Object create() {
		return create(nombrePorDefecto);
	}

	/**
	 * Creates the.
	 *
	 * @param nombre the nombre
	 * @return the object
	 */
	public Object create(String nombre) {
		nombrePorDefecto = nombre;
		UnProducto objeto = (UnProducto) mapaObjetos.get(nombre);
		return objeto != null ? objeto.clone() : null;
	}
}
