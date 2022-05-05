package com.training.services;

import java.util.List;
import java.util.function.Predicate;
import java.util.*;

import com.training.ifaces.CrudRepository;
import com.training.model.Book;

public class BookService implements CrudRepository {
	
	private ArrayList<Book> bookList;
	
	
	public BookService() {
		super();
		this.bookList=new ArrayList<>();
	}
	

	@Override
	public boolean add(Book book) {
		//boolean result = bookList.add(book);
		//return result;
		return bookList.add(book);
	}

	@Override
	public Book findByBookId(int id) {
		Book found = null;
		for(Book eachBook:this.bookList){
			if(eachBook.getBookNumber()==id) {
				found=eachBook;
			}
		}
		return found;
	}

	@Override
	public boolean remove(Book book) {
		
		return this.bookList.remove(book);
	}

	@Override
	public List<Book> findAll() {
		return this.bookList;
	}


	@Override
	public Book update(Book book) {
		if(this.bookList.contains(book)){
			System.out.println("Inside IF Block######");
		}
		else {
			System.out.println("Outside ELSE Block######");
			add(book);
		}
		return null;
	}


	@Override
	public Book update(Book oldbook, Book recentbook) {
		if(this.bookList.contains(oldbook)) {
			int idxPos = 5;
					this.bookList.set(idxPos, recentbook);
		}else {
			add(recentbook);
		}
		return recentbook;
	}
	
	public List<Book> getBookGrtThan(double price){
		
	List<Book> grtThanList = new ArrayList<>();
		
	Predicate<Double> grtThan = (value) -> value>price;
		
	this.bookList.forEach(book->
	{
		double bookPrice = book.getBookPrice();
		if(grtThan.test(bookPrice)) {
			grtThanList.add(book);
		}
		//System.out.println(book.getBookPrice());
	});
	return grtThanList;	
	}
}