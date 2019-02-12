package com.stefanini.hn.singleton.manager;

/**
 * Singleton.
 *
 * @author Yuny Rene Rodriguez Perez <mailto: yrperez@stefanini.com />
 * @version 
 * @see 
 * @since 02-12-2019 10:48:42 AM 2019
 */
public class Singleton {

	/** Attribute that determine url. */
	private String url;
	
	/** Attribute that determine baseDatos. */
	private String baseDatos;
	
	/** Attribute that determine instance. */
	private static Singleton instance = null;

	/**
	 * Gets the single instance of Singleton.
	 *
	 * @param url the url
	 * @param baseDatos the base datos
	 * @return single instance of Singleton
	 */
	public static Singleton getInstance(String url, String baseDatos) {

		if (instance == null) {
			instance = new Singleton(url, baseDatos);
		}
		return instance;
	}

	/**
	 * Instantiates a new singleton.
	 *
	 * @param url the url
	 * @param baseDatos the base datos
	 */
	private Singleton(String url, String baseDatos) {

		this.url = url;
		this.baseDatos = baseDatos;

	}

	/**
	 * Instantiates a new singleton.
	 */
	private Singleton() {
	}

	/**
	 * Gets the url.
	 *
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * Sets the url.
	 *
	 * @param url the new url
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * Gets the base datos.
	 *
	 * @return the base datos
	 */
	public String getBaseDatos() {
		return baseDatos;
	}

	/**
	 * Sets the base datos.
	 *
	 * @param baseDatos the new base datos
	 */
	public void setBaseDatos(String baseDatos) {
		this.baseDatos = baseDatos;
	}
}