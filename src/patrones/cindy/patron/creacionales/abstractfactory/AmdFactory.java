package patron.creacionales.abstractfactory;

public class AmdFactory extends AbstractFactory {
	public Disco comprarDisco() {
		return new DiscoAmd();
	}

	public Memoria comprarMemoria(){
	return new MemoriaAmd(); 
	}
}
