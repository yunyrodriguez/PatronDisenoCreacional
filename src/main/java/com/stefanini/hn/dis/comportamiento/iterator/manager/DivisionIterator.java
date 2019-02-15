package com.stefanini.hn.dis.comportamiento.iterator.manager;

import java.util.Iterator;

public class DivisionIterator implements Iterator<Employee> {

	private Employee[] employee;
	private int location = 0;

	public DivisionIterator(Employee[] employee) {
		this.employee = employee;
	}

	public boolean hasNext() {
		if (location < employee.length && employee[location] != null) {

			return true;
		}
		return false;
	}

	public Employee next() {
		return employee[location++];
	}

}
