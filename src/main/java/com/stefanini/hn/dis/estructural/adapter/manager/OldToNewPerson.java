package com.stefanini.hn.dis.estructural.adapter.manager;

import java.util.GregorianCalendar;

public class OldToNewPerson implements INewPerson {

	private IOldPerson old;

	public OldToNewPerson(IOldPerson old) {
		this.old = old;
	}

	public String getName() {
		return old.getFirstName() + " " + old.getLastName();
	}

	public void setName(String nameFull) {
		String[] name = nameFull.split(" ");
		String firstName = name[0];
		String lastName = name[1];
		old.setFirstName(firstName);
		old.setLastName(lastName);
	}

	public int getAge() {
		GregorianCalendar calendar = new GregorianCalendar();
		GregorianCalendar calendar2 = new GregorianCalendar();
		calendar2.setTime(old.getBirthdate());

		return calendar.get(1) - calendar2.get(1);
	}

	public void setAge(int age) {

		GregorianCalendar calendar = new GregorianCalendar();
		calendar.set(1, calendar.get(1) - age);
		old.setBirthdate(calendar.getTime());
	}

}
