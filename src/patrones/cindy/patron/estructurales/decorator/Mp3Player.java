package patron.estructurales.decorator;

public class Mp3Player extends AutoDecorator {
	public Mp3Player(Vendible vendible) {
		super(vendible);
	}
	public String getDescripcion() {
		return getVendible().getDescripcion() + " + MP3 Player";
	}
	public int getPrecio() {
		return getVendible().getPrecio()+ 250;
	}
}
