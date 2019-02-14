package com.stefanini.hn.dis.estructural.bridge.abstracts;

public abstract class Form {

	private Drawing drawing;

	public Form(Drawing drawing) {

		this.drawing = drawing;
	}

	public abstract void draw();

	public void drawRectangle(double x1, double y1, double x2, double y2) {
		drawing.drawRectangle(x1, y1, x2, y2);
	}

	public void drawCircle(double x, double y, double r) {
		drawing.drawCircle(x, y, r);
	}

}
