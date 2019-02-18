package com.stefanini.hn.dis.comportamiento.strategy.manager;

import com.stefanini.hn.dis.comportamiento.observer.manager.Book;

public class BookFinder {

	public Book findBook(PersonStrategy person, String title) {
		BookStrategy strategy = null;
		if (person instanceof Partner) {
			strategy = new NewGoodRegularStrategy();
		} else if (person instanceof Teacher) {
			strategy = new GoodNewRegularStrategy();
		} else {
			strategy = new RegularGoodNewStrategy();
		}
		return strategy.findBook(title);
	}
}
