package patron.creacionales.prototype;

public class Plasma extends TV {
	public Plasma(String marca, int pulgadas, String color, double precio, double anguloVision, double tiempoRespuesta) {
		super(marca, pulgadas, color, precio);
		setAnguloVision(anguloVision);
		setTiempoRespuesta(tiempoRespuesta);
		// TODO Auto-generated constructor stub
	}
	private double anguloVision;
	private double tiempoRespuesta;
	
	
	public double getAnguloVision() {
		return anguloVision;
	}
	public void setAnguloVision(double anguloVision) {
		this.anguloVision = anguloVision;
	}
	public double getTiempoRespuesta() {
		return tiempoRespuesta;
	}
	public void setTiempoRespuesta(double tiempoRespuesta) {
		this.tiempoRespuesta = tiempoRespuesta;
	}
	
	

}
