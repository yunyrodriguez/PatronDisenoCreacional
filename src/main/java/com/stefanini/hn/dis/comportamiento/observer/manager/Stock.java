package com.stefanini.hn.dis.comportamiento.observer.manager;

public class Stock implements IBadBook{

	public void update() {
		System.out.println("Stock: ");
		System.out.println("Le doy de baja...");
	}

	
}
