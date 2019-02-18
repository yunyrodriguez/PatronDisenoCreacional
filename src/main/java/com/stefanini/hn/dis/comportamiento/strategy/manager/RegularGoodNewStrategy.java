package com.stefanini.hn.dis.comportamiento.strategy.manager;

import java.util.ArrayList;

import com.stefanini.hn.dis.comportamiento.observer.manager.Book;

public class RegularGoodNewStrategy implements BookStrategy{

	public Book findBook(String title) {
		ArrayList<Book> books = LibraryStrategy.obtainBooks();
		Book book = new Book();
		book.setState("Regular");
		return book;
	}

}
