package patron.comportamiento.visitor;

public class ProductoNormal implements Visitable{
	private double precio;
	public double accept(Visitor visitor) {
		return visitor.visit(this);
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double preio) {
		this.precio = precio;
	}

}
