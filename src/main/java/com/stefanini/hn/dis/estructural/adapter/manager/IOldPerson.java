package com.stefanini.hn.dis.estructural.adapter.manager;

import java.util.Date;

public interface IOldPerson {

	public String getFirstName();
	public void setFirstName(String firstName);
	public String getLastName();
	public void setLastName(String LastName);
	public Date getBirthdate();
	public void setBirthdate(Date birthdate);
}
