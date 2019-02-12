package patron.creacionales.factorymethod;

public class Escaleno extends Triangulo {
	public Escaleno(int anguloA, int anguloB, int anguloC) {
		super(anguloA, anguloB, anguloC);
	}
	
	public String getDescription() {
		return "Soy un triangulo Escaleno";
	}

	@Override
	public double getSuperficie() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void dibujate() {
		// TODO Auto-generated method stub
		
	}
}
