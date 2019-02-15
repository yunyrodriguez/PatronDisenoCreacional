package com.stefanini.hn.dis.comportamiento.iterator.manager;

public class Employee {

	private String name;
	private String division;
	
	public Employee(String name, String division) {
		
		this.name = name;
		this.division = division;
	}
	
	public String getName() {
		return name;
	}
	
	public void print() {
		System.out.println("Nombre: " + name + "Division: " + division); 
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", division=" + division + "]";
	}
}
