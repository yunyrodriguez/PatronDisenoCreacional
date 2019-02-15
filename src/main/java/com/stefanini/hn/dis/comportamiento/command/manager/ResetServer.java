package com.stefanini.hn.dis.comportamiento.command.manager;

public class ResetServer  implements Command{

	private IServer server;
	public void execute() {
		server.connection();
		server.verifyConnection();
		server.saveLog();
		server.shutDown();
		server.closeConnetion();
		server.on();
	}
	public ResetServer(IServer server) {
		
		this.server = server;
	}

}
