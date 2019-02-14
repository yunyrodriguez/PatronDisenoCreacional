package patron.estructurales.decorator;

public class CdPlayer extends AutoDecorator {
	public CdPlayer(Vendible vendible) {
		super(vendible);
	}
	public String getDescripcion() {
		return getVendible().getDescripcion() + " + CD Player";
	}
	public int getPrecio() {
		return getVendible().getPrecio() + 100;
	}
}
