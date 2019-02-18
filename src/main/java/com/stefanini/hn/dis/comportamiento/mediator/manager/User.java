package com.stefanini.hn.dis.comportamiento.mediator.manager;

public class User implements IUsuarioChat{

	private String name;
	private ChatRoom room;
	
	public User(ChatRoom room) {
		this.room = room;
	}

	public void receives(String of, String message) {
		String sample = "El usuario " + of + " te dice: "+message;
	    System.out.println(name + ":" + sample);
	}

	public void send(String a, String message) {
		this.room.send(name, a, message);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ChatRoom getRoom() {
		return room;
	}

	public void setRoom(ChatRoom room) {
		this.room = room;
	}

}
