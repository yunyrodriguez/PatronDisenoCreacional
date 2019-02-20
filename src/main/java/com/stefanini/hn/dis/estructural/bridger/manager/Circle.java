package com.stefanini.hn.dis.estructural.bridger.manager;


public class Circle extends Form{

	private double coordinateX, coordinateY, coordinateR;
	
	public Circle(Drawing drawing, double x, double y, double r) {
		super(drawing);
		coordinateX = x;
		coordinateX = y;
		coordinateX = r;
	}

	@Override
	public void draw() {
		drawCircle(coordinateX,coordinateY,coordinateR);
		
	}

}
