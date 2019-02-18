package patron.comportamiento.state;

public class Bancos {
	private String nombre;
	private String direccion;
	private Ventanilla ventanilla;
	
	public Bancos(){
		ventanilla = new Ventanilla();
	}
	
	public void atende(Personal personal){
		System.out.println("     ");
		System.out.println(personal.getNombre() + " ingresa a la fila.");
		ventanilla.atende(personal);
	}
	public void suspendeVentanilla(){
		ventanilla.suspendete();
	}
	public void cerraVentanilla(){
		ventanilla.cerrate();
	}
	public void abriVentanilla(){
		ventanilla.abrite();
	}
	public String getNombre(){
		return nombre;
	}
}
