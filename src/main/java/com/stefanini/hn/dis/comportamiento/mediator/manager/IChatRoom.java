package com.stefanini.hn.dis.comportamiento.mediator.manager;

public interface IChatRoom {

	public abstract void register(User user);
	public abstract void send(String of, String a, String message);
}
