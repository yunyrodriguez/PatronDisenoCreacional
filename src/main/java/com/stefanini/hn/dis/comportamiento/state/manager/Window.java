package com.stefanini.hn.dis.comportamiento.state.manager;

public class Window {

	private String cashier;
	private WindowState state;
	
	public Window() {

		state = new Open();
	}
	
	public void suspended(){
		
		state = new Suspended();
	}
	
	public void close() {
		state = new Close();
	}
	
	public void opened() {
		state = new Open();
	}
	
	public void attend(PersonState person) {
		state.attend(person);
	}

	public String getCashier() {
		return cashier;
	}

	public void setCashier(String cashier) {
		this.cashier = cashier;
	}
	
	
}
