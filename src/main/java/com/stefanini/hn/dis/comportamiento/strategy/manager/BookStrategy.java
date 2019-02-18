package com.stefanini.hn.dis.comportamiento.strategy.manager;

import com.stefanini.hn.dis.comportamiento.observer.manager.Book;

public interface BookStrategy {

	public Book findBook(String title);
}
