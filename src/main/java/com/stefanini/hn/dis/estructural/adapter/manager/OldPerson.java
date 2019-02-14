package com.stefanini.hn.dis.estructural.adapter.manager;

import java.util.Date;

public class OldPerson implements IOldPerson{

	public String firstName;
	public String lastName;
	public Date birthdate;
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	
}
