package com.stefanini.hn.dis.comportamiento.observer.manager;

public class Library {

	public void  returnBook(Book book) {
		if(book.getState().equals("Malo")) {
			BookAlarm alarm = new BookAlarm();
			alarm.notifyObserver();
		}
	}
}
