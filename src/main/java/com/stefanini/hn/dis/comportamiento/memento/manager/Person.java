package com.stefanini.hn.dis.comportamiento.memento.manager;

public class Person {

	private String name;
	
	public Memento saveToMemento() {
		System.out.println("Originador: Guardando Memento...");
		return new Memento(name);
	}
	
	public void restoreFromMemento(Memento memento) {
		name = memento.getSavedState();
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
