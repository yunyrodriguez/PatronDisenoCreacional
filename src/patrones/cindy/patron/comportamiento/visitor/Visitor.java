package patron.comportamiento.visitor;

public interface Visitor {
	public double visit(ProductoNormal normal);
	public double visit(ProductoDescuento reducido);
}
