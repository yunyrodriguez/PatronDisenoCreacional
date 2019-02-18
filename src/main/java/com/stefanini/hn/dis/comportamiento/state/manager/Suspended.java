package com.stefanini.hn.dis.comportamiento.state.manager;

public class Suspended implements WindowState{

	public void attend(PersonState person) {
		if (person.getAge() > 65) {
			System.out.println("Atendiendo a: "+person.getName());
		}else {
			System.out.println("Espere 5 minuntos por favor..");
		}
	}

}
