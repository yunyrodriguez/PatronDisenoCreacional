package com.stefanini.hn.singleton.manager;

public class Principal {

	public static void main(String[] args) {

		Singleton c = Singleton.getInstance("miurl", "mibaseDatos");

		System.out.println(c.getUrl());
		System.out.println(c.getBaseDatos());

	}

}
