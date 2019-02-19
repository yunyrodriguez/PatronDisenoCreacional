package com.stefanini.hn.dis.estructural.composite.manager;

public abstract class Component {

	protected String name;

	public Component(String name) {
		
		this.name = name;
	}
	abstract public void add(Component component);
	abstract public void delete(Component component);
	abstract public void show(int depth);
	
}
