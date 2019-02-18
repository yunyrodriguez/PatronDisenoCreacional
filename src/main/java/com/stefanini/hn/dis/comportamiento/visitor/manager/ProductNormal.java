package com.stefanini.hn.dis.comportamiento.visitor.manager;

public class ProductNormal implements Visit{

	private double price;
	public double accept(Visitor visitor) {
		return visitor.visit(this);
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
