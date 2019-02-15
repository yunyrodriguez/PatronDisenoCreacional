package com.stefanini.hn.dis.comportamiento.command.manager;

public interface IServer {

	public void shutDown();
	public void on();
	public void connection();
	public void verifyConnection();
	public void saveLog();
	public void closeConnetion();
}
