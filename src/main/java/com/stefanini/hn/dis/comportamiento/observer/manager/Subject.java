package com.stefanini.hn.dis.comportamiento.observer.manager;

public interface Subject {

	public void attach(IBadBook observer);
	public void dettach(IBadBook observer);
	public void notifyObserver();
}
