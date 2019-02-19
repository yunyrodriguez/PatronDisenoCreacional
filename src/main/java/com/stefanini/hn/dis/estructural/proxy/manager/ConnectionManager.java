package com.stefanini.hn.dis.estructural.proxy.manager;

public class ConnectionManager {

	private static boolean isConnection;
	
	public ConnectionManager() {
		isConnection = false;
	}
	
	public static void connect() {
		isConnection = true;
	}
	
	public static void disConnect() {
		isConnection = false;
	}
	
	public static boolean isConnection() {
		return isConnection;
	}
}
