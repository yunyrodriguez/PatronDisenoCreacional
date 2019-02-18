package patron.comportamiento.mediator;

public interface ISalonDeChat {
	public abstract void registra(Usuario participante);
	public abstract void envia(String de, String a, String msg);
}
