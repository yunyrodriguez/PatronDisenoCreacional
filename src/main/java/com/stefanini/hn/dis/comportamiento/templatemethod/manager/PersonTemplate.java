package com.stefanini.hn.dis.comportamiento.templatemethod.manager;

public abstract class PersonTemplate {

	private String name;
	private String DNI;
	
	public String identify() {
	String phrase = "Me identifico con: ";
	phrase = phrase + getTypeId();
	phrase = phrase + ". El numero es: ";
	phrase = phrase + getId();
	return phrase;
	}
	
	protected abstract String getId();
	protected abstract String getTypeId();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}
	
	
}
