package com.stefanini.hn.dis.comportamiento.command.manager;

public class OffServer implements Command{

	private IServer server;
	public void execute() {
		server.connection();
		server.verifyConnection();
		server.saveLog();
		server.shutDown();
		server.closeConnetion();
		
	}
	
	public OffServer(IServer server) {
		this.server = server;
	}

}
