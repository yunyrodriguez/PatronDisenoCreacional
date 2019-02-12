package patron.creacionales.prototype;

import java.util.HashMap;

public class TvProtoType {
	private HashMap<String,TV> prototipos = new HashMap<String,TV>();
	
	public TvProtoType() {
		Plasma plasma = new Plasma ("sony", 21, "Plateado", 399.99, 90, 0.05);
		LCD lcd = new LCD("panasonic", 42, "Plateado", 599.99, 290);
		
		prototipos.put("plasma",plasma);
		prototipos.put("LCD", lcd);
	}
	
	public Object prototipo(String tipo) throws CloneNotSupportedException{
		return prototipos.get(tipo).clone();
	}
	
}
