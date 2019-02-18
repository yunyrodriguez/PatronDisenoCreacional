package com.stefanini.hn.dis.comportamiento.memento.manager;

import java.util.ArrayList;

public class Caretaker {

	private ArrayList<Memento> state = new ArrayList<Memento>();
	
	public void addMemento(Memento memento) {
		state.add(memento);
	}
	
	public Memento getMemento(int index) {
		return state.get(index);
	}
}
