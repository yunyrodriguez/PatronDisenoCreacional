package patron.estructurales.bridge;

public class DibujandoNormal extends Dibujo {
	public void dibujandoRectangulo(double x1, double y1, double x2, double y2) {
		System.out.println("Dibujando un rectangulo normal...");
	}
	public void dibujaCirculo(double x, double y, double r) {
		System.out.println("Dibujando un circulo...");
	}
	@Override
	public void dibujaRectangulo(double x1, double y1, double x2, double y2) {
		// TODO Auto-generated method stub
		
	}
}
