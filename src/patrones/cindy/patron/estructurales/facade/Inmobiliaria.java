package patron.estructurales.facade;

public class Inmobiliaria {
	private MuestraPropiedad muestraPropiedad;
	private VentaInmueble venta;
	private CuentasAPagar cuentasAPagar;
	private AdministracionAlquiler alquiler;
	
	public Inmobiliaria() {
		muestraPropiedad = new MuestraPropiedad();
		venta = new VentaInmueble();
		cuentasAPagar = new CuentasAPagar();
		alquiler = new AdministracionAlquiler();
	}
	public void atencionCliente(Cliente c) {
		System.out.println("Atendiendo a un cliente");
	}
	public void atencionPropietario(Propietario p) {
		System.out.println("Atendiendo a un propietario");
	}
	public void atencionInteresado(Interesado i) {
		System.out.println("Atencion a un interesado en una propiedad");
	}
	public void atencion(PersonaFacade p) {
		if (p instanceof Cliente) {
			atencionCliente((Cliente) p);
		} else if(p instanceof Propietario) {
			atencionPropietario((Propietario) p);
		} else {
			atencionInteresado((Interesado)p); 
		}
	}
}
