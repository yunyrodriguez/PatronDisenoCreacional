package patron.creacionales.builder;

public abstract class OtraPizzaBuilder {
	protected Pizza pizza;

	public Pizza getPizza() {
		return pizza;
	}

	public void crearNuevaPizza() {
		pizza = new Pizza();
		buildMasa();
		buildSalsa();
		buildRelleno();
	}

	public abstract void buildMasa();

	public abstract void buildSalsa();

	public abstract void buildRelleno();
}
