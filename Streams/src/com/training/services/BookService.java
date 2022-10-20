package com.training.services;
import static java.util.stream.Collectors.*;
import java.util.List;
import java.util.function.Predicate;
import java.util.*;

import com.training.ifaces.CrudRepository;
import com.training.model.Book;

public class BookService implements CrudRepository {
	
	private static final double Price = 0;
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
	
	// Sorted method using comparing
	public List<Book> sortedByName(){
		return this.bookList
				.stream()
				.sorted(Comparator.comparing(Book::getBookName)).collect(toList());
	}
	
	// Sorted method using reverse order
	public List<Book> sortedByNumberDesc(){
		return this.bookList
				.stream()
				.sorted(Comparator.reverseOrder()).collect(toList());
	}
	
	// Streams using filter 
		public List<Book> getBookPrice(){
			return this.bookList
					.stream()
					.filter(e->e.getBookPrice()>Price).collect(toList());		
	}
	
	// Streams using map
	public List<String> getBookNames(){
		return this.bookList
				.stream()
				.map(e->e.getBookName()).collect(toList());		
		
	}
	
	// Streams using filter , map
	public List<String> getBookNamesGrtThanPrice(double Price){
		return this.bookList
				.stream()
				.filter(e->e.getBookPrice()>Price)
				.map(e->e.getBookName()).collect(toList());
		
	}
	
	// Not Using Streams
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
	
	// Using Streams
	public List<Book> findBookGrtThan1(double price){
		
		return this.bookList.stream().filter(e -> e.getBookPrice()>price).collect(toList());
	
	}
}
