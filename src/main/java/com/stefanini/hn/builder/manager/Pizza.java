package com.stefanini.hn.builder.manager;

/**
 * Pizza.
 *
 * @author Yuny Rene Rodriguez Perez <mailto: yrperez@stefanini.com />
 * @version 
 * @see 
 * @since 02-12-2019 11:08:45 AM 2019
 */
public class Pizza {
	
	/** Attribute that determine dough. */
	private String dough = "";
	
	/** Attribute that determine sauce. */
	private String sauce = "";
	
	/** Attribute that determine filling. */
	private String filling = "";

	/**
	 * Sets the dough.
	 *
	 * @param dough the new dough
	 */
	public void setDough(String dough) {
		this.dough = dough;
	}

	/**
	 * Sets the sauce.
	 *
	 * @param sauce the new sauce
	 */
	public void setSauce(String sauce) {
		this.sauce = sauce;
	}

	/**
	 * Sets the filling.
	 *
	 * @param filling the new filling
	 */
	public void setFilling(String filling) {
		this.filling = filling;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Pizza masa = " + dough + ", salsa = " + sauce + ", relleno = " + filling;
	}
	
	
}
