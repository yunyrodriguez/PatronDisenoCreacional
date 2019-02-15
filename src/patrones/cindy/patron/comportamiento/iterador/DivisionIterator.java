package patron.comportamiento.iterador;

import java.util.Iterator;

public class DivisionIterator implements Iterator<Empleado>{
	private Empleado[] empleado;
	private int location = 0;
	
	public DivisionIterator(Empleado[] e) {
		empleado = e;
	}
	
	public Empleado next() {
		return empleado[location++];
	}
	

	public boolean hasNext() {
		if (location< empleado.length && empleado[location] != null) {
			return true;
		} else {
			return false;
		}
	}
	public void remove() {
		
	}
}
