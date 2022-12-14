package org.example;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.example.model.Book;
import org.example.service.BookService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class BookServiceTest {
	BookService service = null;
	
	@BeforeAll
	public static void init(TestInfo info) {
		System.out.println(info.getDisplayName()+" called");
	}
	
	@BeforeEach
	public void setUp(TestInfo info) {
		 service =  new BookService();
			System.out.println(info.getDisplayName()+" called");

	}
	
	@Test
	@DisplayName(value = "Get Method  Should Not return  Null Value")
	
	void testFindResultForNotNull() {
		
	     Object actual= service.getBookList();
	     assertNotNull(actual);
	}
	
	@Test
	@DisplayName(value = "Add Method  Should  return 1 for success and 0 for failure to insert")
	
	void testAdd(){
		
		Object actual = service.addBook(new Book());
		int expected= 1;
		assertEquals(expected, actual);
	}
	
	@Disabled
	@DisplayName(value = "addBook Method should not Accept Duplicate Value")
	@Test
	void testAddNotDuplicateValue() {
		
		// int actual1=service.addBook(new Book(101,"Java",7865));
		int actual2=service.addBook(new Book(101,"Java",7865));

		int expected=0;
		assertEquals(expected, actual2);	
	
	}
	
	@Test
	@DisplayName(value = "addBook method should not accept duplicate value")
	void testForAcceptingDuplicates() {

	assertAll("Testing Add Book",
	()->assertEquals(1,service.addBook(new Book(102, "java", 450))) ,
	()->assertEquals(0,service.addBook(new Book(102, "java", 450)))
	);

	}

	
	@DisplayName(value = "If the Element is not found in the collection"
			+ " removeBook method should throw RunTime exception with message Element not found")
	@Test
	void testRemove() {

		Throwable exception =
	            assertThrows(RuntimeException.class, ()->service.removeBook(new Book()));
		assertEquals("Element Not Found",exception.getMessage());

	}
	
	@DisplayName(value = "Test if getBestBook "
			+ "method has the value Head First Java in one of the first three positions")
	@ParameterizedTest
	@ValueSource(ints = {0,1,2})
	void testGetBestBook(int pox) {
		System.out.println(System.getProperty("os.name"));
		assumeTrue(System.getProperty("os.name").equals("windows 8"));
		assertEquals("Head First Java", service.getBestBooks().get(pox));
	}

}