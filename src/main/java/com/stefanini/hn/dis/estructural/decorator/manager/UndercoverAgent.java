package com.stefanini.hn.dis.estructural.decorator.manager;

public class UndercoverAgent {

	private PersonDecorator person;

	public UndercoverAgent(PersonDecorator person) {

		this.person = person;
	}
	
	public String getName() {
		return "Francis";
	}
	
	public String getDNI() {
		return "78874715100";
	}
	
	public String getLastName() {
		return "Hernandez";
	}
	
	public String getAddress() {
		return "Av Independencia 5545";
	}
	
	public int getAge() {
		return person.getAge();
	}
}
