package com.training.model;

public class Book implements Comparable<Book> {
	
	private int bookNumber;
	private String bookName;
	private String author;
	private double bookPrice;
	
	public Book() {
		super();
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((bookName == null) ? 0 : bookName.hashCode());
		result = prime * result + bookNumber;
		long temp;
		temp = Double.doubleToLongBits(bookPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (bookName == null) {
			if (other.bookName != null)
				return false;
		} else if (!bookName.equals(other.bookName))
			return false;
		if (bookNumber != other.bookNumber)
			return false;
		if (Double.doubleToLongBits(bookPrice) != Double.doubleToLongBits(other.bookPrice))
			return false;
		return true;
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
