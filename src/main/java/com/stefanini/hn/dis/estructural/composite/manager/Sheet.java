package com.stefanini.hn.dis.estructural.composite.manager;

public class Sheet extends Component {

	public Sheet(String name) {
		super(name);
	}

	@Override
	public void add(Component component) {
		System.out.println("No se puede agregar la hoja");
	}

	@Override
	public void delete(Component component) {
		System.out.println("No se puede quitar la hoja");	
	}

	@Override
	public void show(int depth) {
		System.out.println('-' + "" + name);
	}

}
