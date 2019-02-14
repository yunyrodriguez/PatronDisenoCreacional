package patron.estructurales.bridge;

public class DibujandoPunteado extends Dibujo{
	public void dibujandoRectangulo(double x1, double y1, double x2, double y2) {
		System.out.println("Dibujando un rectangulo punteado...");
	}
	public void dibujaCirculo(double x, double y, double r) {
		System.out.println("Dibujando un circulo punteado...");
	}
	@Override
	public void dibujaRectangulo(double x1, double y1, double x2, double y2) {
		// TODO Auto-generated method stub
		
	}

}
