package com.stefanini.hn.dis.comportamiento.command.manager;

public class OnServer implements Command{

	private IServer server;
	public void execute() {
		server.connection();
		server.verifyConnection();
		server.saveLog();
		server.shutDown();
		server.closeConnetion();
		
	}
	
	public  OnServer(IServer server) {
		this.server = server;
	}

}
