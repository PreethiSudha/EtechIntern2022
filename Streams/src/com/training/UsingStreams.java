package com.training;
import static java.util.stream.Collectors.*;
import java.util.*;

import com.training.model.Book;

public class UsingStreams {
	
	public static void useDistinct(List<Book> bookList) {
		
		bookList.stream().distinct().forEach(System.out::println);
		
	}
	
	public static void collectToSet(List<Book> bookList) {
		
		Set<Book> bookSet = bookList
				.stream()
				.filter(e->e.getBookPrice()>500)
				.collect(toSet());
		
		bookSet.forEach(System.out::println);
	}
	
	public static void collectToMap(List<Book> bookList) {
		//way1		
		//		Set<Book> bookSet = bookList
		//				.stream()
		//				.collect(toSet());

		
		//way2 - Insert distinct() into this
		Map<String,Double> values = bookList.stream().filter(e->e.getBookPrice()>500).distinct()
				.collect(toMap(Book::getBookName, Book::getBookPrice));
		
		values.forEach((key,value)->System.out.println(key + "," +value));
	}

	public static void findMaxPrice(List<Book> bookList) {
		
		Optional<Book> opt = bookList.stream().max(Comparator.comparing(Book::getBookPrice));
		
		if(opt.isPresent()) {
			System.out.println("MaxResult : " +opt.get().getBookPrice());
			
			}
		}
	
	public static void findMinPrice(List<Book> bookList) {
		
		Optional<Book> opt = bookList.stream().min(Comparator.comparing(Book::getBookPrice));
		
		if(opt.isPresent()) {
			System.out.println("MinResult : " +opt.get().getBookPrice());
			
			}
		}
	
	public static void countBooksWithGivenChar(List<Book> bookList, String srchString) {
		
		long count = bookList.stream().filter(e->e.getBookName().contains(srchString)).count();
		
		System.out.println(srchString + " Occurs " + count + " times ");
		
		}
	
	public static void main(String[] args) {
	
		
		Book java = new Book(101, "Java", "Loch", 199);
		Book spring = new Book(102, "Spring", "Mad", 550);
		Book maven = new Book(103, "Maven", "Paeng", 250);
		Book html = new Book(104, "Html", "Artit", 465);
		Book python = new Book(105, "Python", "Meen", 585);
		Book mavenNew = new Book(103, "Maven", "Paeng", 250);
		Book htmlNew = new Book(104, "Html", "Artit", 465);
		
		List<Book> bookList = Arrays.asList(java, spring, maven, html, python, mavenNew, htmlNew);
		
		int key=6;
		switch(key) {
		case 1:
			useDistinct(bookList);
			break;
		case 2:	
			collectToSet(bookList);
			break;
		case 3:
			collectToMap(bookList);
			break;
		case 4:
			findMaxPrice(bookList);
			break;
		case 5:
			findMinPrice(bookList);
			break;
		case 6:
			countBooksWithGivenChar(bookList, "e");
			break;
		default:
			break;
	}

	}
}
