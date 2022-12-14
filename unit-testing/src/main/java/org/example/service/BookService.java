package org.example.service;

import java.util.*;

import org.example.model.Book;

public class BookService {
	 
	private Set<Book> bookList;
	
	public BookService() {
		super();
		this.bookList=new HashSet<Book>();
	}

	public Set<Book> getBookList(){
		return this.bookList;
	}
	
	public int addBook(Book book){
		return this.bookList.add(book)?1:0;
	}
	
	public boolean removeBook(Book book) {
		boolean result = false;
		if(this.bookList.contains(book)) {
			this.bookList.remove(book);
			result=true;
		}else {
			throw new RuntimeException("Element Not Found");
		}
		return result;
	}
	
	public List<String> getBestBooks(){
		List<String> list = Arrays.asList("FaceBook","PassBook","CookBook");
		return list;
	}
}
