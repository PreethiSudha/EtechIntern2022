package com.training;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.training.ifaces.CrudRepository;
import com.training.model.Book;
import com.training.services.BookService;

public class App {
	
	// Using Print instead of using System.out.println();
	private static void print(List<Book> book) { //Collection<Book> can alos be used bcoz it's a superclass
		for(Book eachValue:book) {
			System.out.println(eachValue);
		}	
	}

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		
		names.add("Suba");
		names.add("Aarya");
		names.add("Doodoo");
		names.add("Cuba");
		names.add("Kajol");
		
		System.out.println(names);
		System.out.println("***After sorting the collection of names***");
		Collections.sort(names);
		System.out.println(names);
		
		System.out.println("###################################");
		
		Book java = new Book(101, "Java", "Loch", 199);
		Book spring = new Book(102, "Spring", "Mad", 550);
		Book maven = new Book(103, "Maven", "Paeng", 250);
		Book html = new Book(104, "Html", "Artit", 465);
		Book python = new Book(105, "Python", "Meen", 585);
		
		CrudRepository service = new BookService();
		
		service.add(java);
		service.add(spring);	
		service.add(maven);
		service.add(html);
		service.add(python);
		
		List<Book> list = service.findAll();
		Collections.sort(list);
		System.out.println("Sort By Book Number");
		print(list);
		System.out.println("###################################");
		
		System.out.println("Book greater than given value");
		List<Book> bookLists = ((BookService) service).getBookGrtThan(300);
		bookLists.forEach(System.out::println);
		System.out.println("###################################");
		
		
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
/*                                         Stream Concept                                                 */

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
		System.out.println("===========Using Streams====================");
		
		// Using Streams
		((BookService) service)
		.findBookGrtThan1(300)
		.forEach(System.out::println);
		
		System.out.println("===========Using map, filter====================");
		
		// Using map, filter
		List<String> nameList = ((BookService) service).getBookNames();
		nameList.forEach(System.out::println);
		
		System.out.println("==========Getting bookNamegreaterThanPrice====================");
		
		List<String> bookNameList = ((BookService) service).getBookNamesGrtThanPrice(500);
		bookNameList.forEach(System.out::println);
	
		System.out.println("===========Using Sortbyname====================");
		
		List<Book> sortedByName = ((BookService) service).sortedByName();
		sortedByName.forEach(System.out::println);
	
		System.out.println("===========Using SortByNumberInReverse====================");
		
		List<Book> sortedByNumberInReverse = ((BookService) service).sortedByNumberDesc();
		sortedByNumberInReverse.forEach(System.out::println);
	
	}

}