package patron.comportamiento.Chain;

public class EjecutivoDeCuenta implements IAprobador{
	private IAprobador next;
	public IAprobador getNext() {
		return next;
	}
	
	public void solicitudPrestamo(int monto) {
		if(monto<=10000) {
			System.out.println("lo manjeo yo, el ejecutivo de cuentas");
		} else {
				next.solicitudPrestamo(monto);
			}
		}
	public void setNext(IAprobador aprobador) {
		next = aprobador;
	}
}
