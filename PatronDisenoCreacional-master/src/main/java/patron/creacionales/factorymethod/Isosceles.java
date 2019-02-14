package patron.creacionales.factorymethod;

public class Isosceles extends Triangulo {

	public Isosceles(int ladoA, int ladoB, int ladoC) {
		super(ladoA, ladoB, ladoC);
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
