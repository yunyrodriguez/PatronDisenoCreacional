package com.stefanini.hn.dis.comportamiento.mediator.manager;

import java.util.HashMap;

public class ChatRoom implements IChatRoom{

	private HashMap<String,User> participants = new HashMap<String,User>();
	public void register(User user) {
		participants.put(user.getName(), user);
	}

	public void send(String of, String a, String message) {
		if(participants.containsKey(of) && participants.containsKey(a)) {
			User user = participants.get(a);
			user.receives(of, message);
		} else {
			System.out.println("Usuario inexistente");
		}
	}

}
