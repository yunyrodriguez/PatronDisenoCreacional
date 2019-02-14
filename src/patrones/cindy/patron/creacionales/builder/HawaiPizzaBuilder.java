package patron.creacionales.builder;

public class HawaiPizzaBuilder extends PizzaBuilder {

	public void buildMasa() {
		pizza.setMasa("suave");
	}

	public void buildSalsa() {
		pizza.setSalsa("dulce");
	}

	public void buildRelleno() {
		pizza.setRelleno("chorizo+alcachofas");
	}
}
