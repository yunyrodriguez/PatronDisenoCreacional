package com.stefanini.hn.dis.comportamiento.observer.manager;

import java.util.ArrayList;

public class BookAlarm implements Subject {

	private static ArrayList<IBadBook> observers = new ArrayList<IBadBook>();

	public void attach(IBadBook observer) {
		observers.add(observer);
	}

	public void dettach(IBadBook observer) {
		observers.remove(observer);
	}

	public void notifyObserver() {
		for (int i = 0; i < observers.size(); i++) {
			observers.get(i).update();
		}
	}

}
