package patron.comportamiento.Chain;

public class Gerente implements IAprobador  {
	private IAprobador next;
	
	public IAprobador getNext() {
		return next;
	}
	public void solicitudPrestamo(int monto) {
		if (monto > 50000 && monto <= 100000) {
			System.out.println("Lo manejo yo, el gerente");
		} else {
			next.solicitudPrestamo(monto);
		}
	}
	public void setNext(IAprobador aprobador) {
		next = aprobador;
	}
	
}
