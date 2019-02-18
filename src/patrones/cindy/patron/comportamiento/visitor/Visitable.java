package patron.comportamiento.visitor;

public interface Visitable {
	public double accept(Visitor visitor);
}
