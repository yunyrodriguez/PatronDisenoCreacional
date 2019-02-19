package com.stefanini.hn.dis.estructural.composite.manager;

import java.util.ArrayList;

public class Compound extends Component{

	private ArrayList<Component>son = new ArrayList<Component>();
	public Compound(String name) {
		super(name);
		
	}

	@Override
	public void add(Component component) {
		son.add(component);
	}

	@Override
	public void delete(Component component) {
		son.remove(component);
	}

	@Override
	public void show(int depth) {
		System.out.println(name + " nivel: "+ depth);
		for(int i = 0; i < son.size(); i++) {
			son.get(i).show(depth + 1);
		}
	}

}
