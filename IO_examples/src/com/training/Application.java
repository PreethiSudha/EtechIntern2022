package com.training;

import com.training.model.Book;
import com.training.services.BookService;

public class Application {

	public static void main(String[] args) {
		
		Book java = new Book(101, "Head First Java", "rock", 560);
		
		BookService service = new BookService();
		
//		boolean result = service.writeToFile("books.txt", java);
//		if(result)
//		{
//		System.out.println("One record added to file");
//		}
//		
//		service.readFromFile(new File("Books.txt"))
//		.forEach(System.out::println);;
	}
}
