package patron.creacionales;

public class SingletonEjemplo {

    private String nombre;
    //variable estatica y privada
    private static SingletonEjemplo singletonEjemplo;

    //el constructor del singleton tiene que ser privado 
    private SingletonEjemplo(String nombre) {
        this.nombre = nombre;
        System.out.println("Mi nombre es: " + this.nombre);
    }
    
    //metodo estatico y publico se encarga de instanciar el objeto por primera vez y almacenarlo en la variable estatica
	public static SingletonEjemplo getSingletonInstance(String nombre) {
        if (singletonEjemplo == null){
        	singletonEjemplo = new SingletonEjemplo(nombre);
        }
        else{
            System.out.println("No se puede crear el nuevo objeto "+ nombre + " porque ya existe un objeto de la clase singletonEjemplo");
        }
        
        return singletonEjemplo;
    }
    
    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static SingletonEjemplo getSingletonEjemplo() {
		return singletonEjemplo;
	}

	public static void setSingletonEjemplo(SingletonEjemplo singletonEjemplo) {
		SingletonEjemplo.singletonEjemplo = singletonEjemplo;
	}


}
