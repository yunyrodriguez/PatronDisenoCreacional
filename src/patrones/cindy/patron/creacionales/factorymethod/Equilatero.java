package patron.creacionales.factorymethod;

public class Equilatero extends Triangulo{

	public Equilatero(int anguloA, int anguloB, int anguloC) {
		super(anguloA, anguloB, anguloC);
	}
	
	public String getDescription() {
		return "Soy un triangulo Equilatero";
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
