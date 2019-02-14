package com.stefanini.hn.dis.estructural.bridger.manager;

import com.stefanini.hn.dis.estructural.bridge.abstracts.Drawing;

public class NormalDrawing extends Drawing{

	@Override
	public void drawRectangle(double x1, double y1, double x2, double y2) {
		System.out.println("Dibujando un rectangulo normal...");
		
	}

	@Override
	public void drawCircle(double x, double y, double r) {
		System.out.println("Dibujando un circulo...");
		
	}

	
}
