package patron.estructurales.bridge;

public class Circulo extends Forma {
	private double coordenadaX, coordenadaY, coordenadaR;
	
	public Circulo(Dibujo d, double x, double y, double r) {
		super(d);
		coordenadaX = x;
		coordenadaY = y;
		coordenadaR = r;
	}
	
	public void dibuja() {
		dibujaCirculo(coordenadaX, coordenadaY, coordenadaR);
	}
}
