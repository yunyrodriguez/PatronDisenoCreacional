package com.stefanini.hn.dis.estructural.bridger.manager;

import com.stefanini.hn.dis.estructural.bridge.abstracts.Drawing;
import com.stefanini.hn.dis.estructural.bridge.abstracts.Form;

public class Rectangle extends Form {

	public Rectangle(Drawing drawing, double x1, double y1, double x2, double y2) {
		super(drawing);
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;// TODO Auto-generated constructor stub
	}

	private double x1, x2, y1, y2;

	@Override
	public void draw() {
		drawRectangle(x1, y1, x2, y2);

	}

}
