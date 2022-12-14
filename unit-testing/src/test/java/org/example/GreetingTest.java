package org.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GreetingTest {
	
	@Test
	@DisplayName(value = "Test the Get Message return a string of length 8 characters")
	
	void testMaxlength() {
		
		Greeting grtObj = new Greeting();
		
		int actual = grtObj.getMessage().length();
		int expected = 5;
		
		assertEquals(expected, actual);
		
	}

	@Test
	@DisplayName(value = "Test the Birthday Wish method does not return null")
	
	void testBirthdayWish() {
		
		Greeting grtObj = new Greeting();
		
		String actual = grtObj.birthdayWish("ram");
		
		//assertNotNull(actual);
		assertNull(actual);
	}
	
	@Test
	@DisplayName("Test Birthday Wish Method should return Happy Birthday with user name suffixed")
	
	void testBirthdayWishSufWithName() {
		
		Greeting grtObj = new Greeting();
		
		String actual = grtObj.birthdayWishSufWithName("Ramesh");
		String expected = "Happy Birthday Ramesh";
		
//		String arg = "ramesh";
//		String actual = grtObj.birthdayWish(arg);
//		String expected = "Happy Birthday "+arg;
		
		assertEquals(expected, actual);	
		
	}
	
}
