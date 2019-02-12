package com.stefanini.hn.singleton.manager;

public class Singleton {

	private String url;
	private String baseDatos;
	private static Singleton instance = null;

	public static Singleton getInstance(String url, String baseDatos) {

		if (instance == null) {

			instance = new Singleton(url, baseDatos);
		}
		return instance;
	}

	private Singleton(String url, String baseDatos) {

		this.url = url;
		this.baseDatos = baseDatos;

	}

	private Singleton() {
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getBaseDatos() {
		return baseDatos;
	}

	public void setBaseDatos(String baseDatos) {
		this.baseDatos = baseDatos;
	}
}