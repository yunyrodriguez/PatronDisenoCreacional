package com.stefanini.hn.dis.comportamiento.command.manager;

public class Invoker {

	private Command command;

	public Invoker(Command command) {
		this.command = command;
	}
	
	public void running() {
		command.execute();
	}
	
}
