package com.stefanini.hn.dis.comportamiento.strategy.manager;

import java.util.ArrayList;

import com.stefanini.hn.dis.comportamiento.observer.manager.Book;

public class LibraryStrategy {

	private static ArrayList<Book> books = new ArrayList<Book>();
	
	public LibraryStrategy() {
		Book book = new Book();
		book.setState("Bueno");
		book.setTitle("Un Titulo");
		
		books.add(book);
	}
	
	public static ArrayList<Book> obtainBooks(){
		return books;
	}
}
