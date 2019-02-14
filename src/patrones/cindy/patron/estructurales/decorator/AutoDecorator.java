package patron.estructurales.decorator;

public abstract class AutoDecorator implements Vendible{
	private Vendible vendible;
	
	public AutoDecorator(Vendible vendible2) {
		// TODO Auto-generated constructor stub
	}

	public void AutorDecorator(Vendible vendible) {
		setVendible(vendible);
	}
	
	public Vendible getVendible() {
		return vendible;
	}

	public void setVendible(Vendible vendible) {
		this.vendible = vendible;
	}
}
