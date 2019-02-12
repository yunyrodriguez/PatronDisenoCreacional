package com.stefanini.hn.prototype.manager;

import java.util.HashMap;

public class FactoriaPrototipo {
	private HashMap mapaObjetos;
	private String nombrePorDefecto;

	public FactoriaPrototipo() {
		mapaObjetos = new HashMap();
		
		mapaObjetos.put("producto 1", new UnProducto(1));
	}

	public Object create() {
		return create(nombrePorDefecto);
	}

	public Object create(String nombre) {
		nombrePorDefecto = nombre;
		UnProducto objeto = (UnProducto) mapaObjetos.get(nombre);
		return objeto != null ? objeto.clone() : null;
	}
}
