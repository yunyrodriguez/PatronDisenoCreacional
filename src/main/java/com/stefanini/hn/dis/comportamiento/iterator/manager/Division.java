package com.stefanini.hn.dis.comportamiento.iterator.manager;

public class Division {

	private Employee[] employees = new Employee[100];
	private  int number = 0;
	private String nameDivision;
	
	public Division(String nameDivision) {
		
		this.nameDivision = nameDivision;
	}
	
	public String getName() {
		return nameDivision;
	}
	
	public void add(String name) {
		Employee e = new Employee (name, nameDivision);
	    employees[number++] = e;
	}
	
	public DivisionIterator iterator() {
		return new DivisionIterator(employees);
	}
}
