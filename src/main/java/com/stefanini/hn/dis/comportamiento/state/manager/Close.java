package com.stefanini.hn.dis.comportamiento.state.manager;

public class Close implements WindowState{

	public void attend(PersonState person) {
		System.out.println("Ventanilla Cerrada");
	}

}
