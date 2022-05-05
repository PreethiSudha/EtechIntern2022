package com.training;

//import java.util.Collection;
import java.util.List;
import com.training.ifaces.CrudRepository;
import com.training.model.Book;
import com.training.services.BookService;

public class Application {

	//public static void print(Collection<Book> books) {
	public static void print(List<Book> books) {
		
		for(Book eachBook:books) {
			System.out.println(eachBook);
			System.out.println("===============================");
		}
		//Method Reference
		 books.forEach(System.out::println);
	}
	
	public static void main(String[] args) {
		
		Book java = new Book(101, "Java", "Loch", 199);
		Book spring = new Book(102, "Spring", "Mad", 550);
		Book maven = new Book(103, "Maven", "Paeng", 250);
		Book html = new Book(104, "Html", "Artit", 465);
		Book python = new Book(105, "Python", "Meen", 585);
		
	

	CrudRepository service = new BookService();
	
	System.out.println("Is added:= " +service.add(java));
	
	service.add(java);
	service.add(spring);
	service.add(maven);
	service.add(html);
	service.add(python);
	
	System.out.println("Greater than 200");
	List<Book> bookList1 = ((BookService)service).getBookGrtThan(200);
	bookList1.forEach(System.out::println);
	
	System.out.println("===============================================");
	
	List<Book> bookList = service.findAll();
	
	for(Book eachBook:bookList) {
		System.out.println(eachBook);
	}
	
	System.out.println("================FIND A BOOK WITH A GIVEN VALUE======================");
	
	Book foundBook = service.findByBookId(103);
	System.out.println("Found Book:=" +foundBook);

	System.out.println("================REMOVING ONE BOOK======================");
	
	service.remove(spring);
	List<Book> secondList = service.findAll();
	for(Book eachBook:secondList)
	{
		System.out.println(eachBook);
	}
	
	System.out.println("Size:" +secondList.size());
	
	System.out.println("=================AFTER REMOVING ONE BOOK=====================");
	
	print(service.findAll());
	
	System.out.println("==============FIRST UPDATE========================");
	
	Book mania = new Book(106, "Mania", "Mahir", 560);
	
    service.update(mania);
	
	print(service.findAll());
	
	System.out.println("=================SECOND UPDATE=====================");
	
	Book rockan = new Book(107, "Rockan", "Ro", 465);
	
	service.add(rockan);
	
	print(service.findAll());
	
	System.out.println("=================AFTER VALUE CHANGES IN SECOND UPDATE=====================");
	
	Book rockanNew = new Book(107, "Rockan", "Rohi", 565);
	
	service.update(rockan, rockanNew);
	
	print(service.findAll());
	
	
	
	}
}