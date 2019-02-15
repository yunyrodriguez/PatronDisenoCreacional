package patron.comportamiento.Chain;

public class LiderTeamEjecutivo implements IAprobador{
	private IAprobador next;
	public IAprobador getNext() {
		return next;
	}
	public void solicitudPrestamo(int monto) {
		if (monto > 10000 && monto <= 50000) {
			System.out.println("Lo manejo yo, el lider");
		} else {
			next.solicitudPrestamo(monto);
		}
	}
	public void setNext(IAprobador aprobador) {
		next = aprobador;
	}
}
