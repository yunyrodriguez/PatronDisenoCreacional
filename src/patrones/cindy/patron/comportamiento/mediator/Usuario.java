package patron.comportamiento.mediator;

public class Usuario implements IUsuarioChat {
	
	private String nombre;
	private SalonDeChat salon;
	
	public Usuario(SalonDeChat salonDeChat) {
		salon = salonDeChat; 
	}
	
	public void recibe(String de, String msg) {
		String s = "El usuario " + de + " te dice: " + msg;
		System.out.println("**** Test Mediator **** ");
		System.out.println(nombre + " : " + s);
	}
	public void envia(String a, String msg) {
		salon.envia(nombre, a, msg);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
