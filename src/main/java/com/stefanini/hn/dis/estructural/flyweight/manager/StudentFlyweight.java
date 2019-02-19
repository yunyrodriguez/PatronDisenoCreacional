package com.stefanini.hn.dis.estructural.flyweight.manager;

public class StudentFlyweight {

	private String name;
	private String lastName;
	private double average;
	private double generalAverage;
	
	public StudentFlyweight(double generalAverage) {
		setGeneralAverage(generalAverage);
	}
	
	public double compare() {
		return (((double)average)/generalAverage - 1) * 100.0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getAverage() {
		return average;
	}

	public void setAverage(double average) {
		this.average = average;
	}

	public double getGeneralAverage() {
		return generalAverage;
	}

	public void setGeneralAverage(double generalAverage) {
		this.generalAverage = generalAverage;
	}
	
	
}
