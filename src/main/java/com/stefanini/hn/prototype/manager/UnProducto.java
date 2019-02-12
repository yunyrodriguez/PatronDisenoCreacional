package com.stefanini.hn.prototype.manager;

public class UnProducto implements Producto {
	private int atributo;

	UnProducto(int atributo) {
		this.atributo = atributo;
	}

	public Object clone() {
		return new UnProducto(this.atributo);
	}

	public String toString() {
		return ((Integer) atributo).toString();
	}
}
