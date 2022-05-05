package com.training.model;
import java.util.logging.Logger;

public class Book implements Comparable<Book> {
	
	private int bookNumber;
	private String bookName;
	private String author;
	private double bookPrice;
	
	public static Logger log = 					
            Logger.getLogger(Book.class.getName());

	public Book() {
		super();
	
		log.info("Zero Argument logger constructed");
		
	}
	public Book(int bookNumber, String bookName, String author, double bookPrice) {
		super();
		this.bookNumber = bookNumber;
		this.bookName = bookName;
		this.author = author;
		this.bookPrice = bookPrice;
	}
	public int getBookNumber() {
		return bookNumber;
	}
	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	
	@Override
	public String toString() {
		return "Book [bookNumber=" + bookNumber + ", bookName=" + bookName + ", author=" + author + ", bookPrice="
				+ bookPrice + "]";
	}
	
	@Override
	public int compareTo(Book otherObj) {
		if(otherObj.bookNumber<this.bookNumber) return -1;
		if(otherObj.bookNumber>this.bookNumber) return 1;
		return 0;
		//(here also, we use two arguments as this. and otherObj because, we are in same class here)
		
		//return otherObj.bookName.compareTo(this.bookName);
	}
}
