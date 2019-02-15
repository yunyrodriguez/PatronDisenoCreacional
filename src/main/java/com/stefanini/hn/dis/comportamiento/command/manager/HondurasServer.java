package com.stefanini.hn.dis.comportamiento.command.manager;

public class HondurasServer implements IServer {

	public void shutDown() {
		System.out.println("Apagando servidor HN");
	}

	public void on() {
		System.out.println("Prendiendo el servidor HN");
	}

	public void connection() {
		System.out.println("Conectando al servidor HN");
	}

	public void verifyConnection() {
		System.out.println("Verificando la conexion con el servidor HN");
	}

	public void saveLog() {
		System.out.println("Guardar Log de HN");
	}

	public void closeConnetion() {
		System.out.println("Cerrando conexion con el servidor HN");
	}

}
