package patron.comportamiento.mediator;

import java.util.HashMap;

public class SalonDeChat implements ISalonDeChat{
	
	private HashMap<String, Usuario> participantes = new HashMap<String, Usuario>();
	
	public void registra(Usuario user) {
		participantes.put(user.getNombre(), user);
	}
	
	public void envia(String de, String a, String msg) {
		if (participantes.containsKey(de) && participantes.containsKey(a)) {
			Usuario u = participantes.get(a);
			u.recibe(de, msg);
		} else {
			System.out.println("Usuario inexistente");
		}
	}

}
