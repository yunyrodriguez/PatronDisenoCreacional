package patron.comportamiento.Chain;

public class Director implements IAprobador{
	private IAprobador next;
	
	public IAprobador getNext() {
		return next;
	}
	
	public void solicitudPrestamo(int monto) {
		if(monto>=100000) {
			System.out.println("lo manejo yo, el director");
		}
	}

	public void setNext(IAprobador aprobador) {
		// TODO Auto-generated method stub
		
	}
}
