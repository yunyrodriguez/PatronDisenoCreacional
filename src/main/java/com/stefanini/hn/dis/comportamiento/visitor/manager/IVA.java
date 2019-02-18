package com.stefanini.hn.dis.comportamiento.visitor.manager;

public class IVA implements Visitor{

	private final double taxNormal = 1.21;
	private final double taxReudced = 1.105;
	
	public double visit(ProductNormal normal) {
		return normal.getPrice() * taxNormal;
	}
	public double visit(DiscountProduct reduced) {
		return reduced.getPrice() * taxReudced;
	}
	
}
