package com.stefanini.hn.dis.comportamiento.visitor.manager;

public interface Visitor {

	public double visit(ProductNormal normal);
	public double visit(DiscountProduct reduced);
}
