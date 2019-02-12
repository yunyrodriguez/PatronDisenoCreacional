package com.stefanini.hn.prototype.manager;

public class PruebaFactoria {
	static public void main(String[] args) {
		FactoriaPrototipo factoria = new FactoriaPrototipo();
		Producto producto = (Producto) factoria.create("producto 1");
		System.out.println("Este es el objeto creado: " + producto);
	}
}
