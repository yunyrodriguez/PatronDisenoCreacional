package patron.creacionales.abstractfactory;

public class IntelFactory extends AbstractFactory {

	public Disco comprarDisco() {
		// TODO Auto-generated method stub
		return new DiscoIntel();
	}

	public Memoria comprarMemoria() {
		// TODO Auto-generated method stub
		return new MemoriaIntel();
	}

}