package patron.creacionales.builder;

public class OtraCocina {
	private OtraPizzaBuilder pizzaBuilder;

	public void setPizzaBuilder(OtraPizzaBuilder pb) {
		pizzaBuilder = pb;
	}

	public Pizza getPizza() {
		return pizzaBuilder.getPizza();
	}

	public void construirPizza() {
		pizzaBuilder.crearNuevaPizza();
	}
}