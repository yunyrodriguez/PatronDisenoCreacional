package com.stefanini.hn.dis.comportamiento.state.manager;

public class Open implements WindowState{

	public void attend(PersonState person) {
		System.out.println("Atendiendo a: "+ person.getName());
	}

}
