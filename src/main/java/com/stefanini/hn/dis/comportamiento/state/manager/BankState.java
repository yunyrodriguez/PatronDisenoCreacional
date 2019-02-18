package com.stefanini.hn.dis.comportamiento.state.manager;

public class BankState {

	private String name;
	private String address;
	private Window window;
	
	public BankState() {
		window = new Window();
	}
	
	public void attend(PersonState person) {
		System.out.println(person.getName() + " Ingresa a la fila.");
	    window.attend(person);
	}
	
	public void windowSuspend() {
		
		window.suspended();
	}
	
	public void closeWindow() {
		
		window.close();
	}
	
	public void openWindow() {
		
		window.opened();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Window getWindow() {
		return window;
	}

	public void setWindow(Window window) {
		this.window = window;
	}
	

}
