package patron.comportamiento.visitor;

public class ProductoDescuento implements Visitable  {

	private double precio;
	public double accept(Visitor visitor) {
		return visitor.visit(this);
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
}
