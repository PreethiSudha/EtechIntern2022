package com.training.model.services;

import java.util.*;
import com.training.ifaces.CrudRepository;
import com.training.model.Book;
import com.training.services.BookService;
import com.training.utils.BookNameComparator;

public class App {
	
	public static void print(List<Book> books) {
		
		for(Book eachBook:books) {
			System.out.println(eachBook);
		}
		
	}

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		
		names.add("Preetz");
		names.add("Lolita");
		names.add("Loch");
		names.add("Yazhini");
		names.add("Sushu");
		
		System.out.println(names);
		Collections.sort(names);
		System.out.println(names);
			
		Book java = new Book(101, "Java", "Loch", 499);
		Book spring = new Book(102, "Spring", "Mad", 550);
		Book maven = new Book(103, "Maven", "Paeng", 750);
		Book html = new Book(104, "Html", "Artit", 465);
		Book python = new Book(105, "Python", "Meen", 585);
			
		CrudRepository service = new BookService();
		
		System.out.println("Is added:= " +service.add(java));
		//service.add(java);
		service.add(spring);
		service.add(maven);
		service.add(html);
		service.add(python);
		
		List<Book> bookList = service.findAll();
		
		Collections.sort(bookList);
		System.out.println("Sort by Book Number");
		print(bookList);
		
		Collections.sort(bookList, new BookNameComparator());
		System.out.println("Sort by Book Name");
		print(bookList);
	
	}
	
}
