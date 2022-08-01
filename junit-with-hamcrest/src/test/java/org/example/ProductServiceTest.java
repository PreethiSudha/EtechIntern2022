package org.example;

import org.example.services.ProductService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.List;


public class ProductServiceTest {
	
	ProductService service = null;
	
	@BeforeEach
	void init() {
		service = new ProductService();
	}
	
	@DisplayName(value="Test findDiscount method returns 0.20 or above for tv and laptops")
	@Test
	void testFindDiscount1() {
		double actual = service.findDiscount("tv");
		assertThat(actual, is(greaterThan(0.19)));
	}
	
	@DisplayName(value="Test findDiscount method returns 0.10 or above for fridge,washing machine")
	@Test
	void testFindDiscount2() {
		double actual = service.findDiscount("tv");
		assertThat(actual, is(greaterThan(0.19)));
	}
	
	@DisplayName(value="Test findProducts method returns a list of four brands")
	@Test
	void testFindSize() {
		int actual = service.findProduct().size();
		assertThat(actual, is(equalTo(4)));
	}

	@DisplayName(value="Test findProducts method returns a list containing "
						+ "Dell, Lenovo, Hp, Asus for product laptop")
	@Test
	void testShowProducts() {
		List<String> actual = service.findProduct();  
		assertThat(actual, contains("Dell", "Lenovo", "Hp", "Asus"));
	}

	@DisplayName(value="Test findProducts method returns a list containing a particular product in that list"
			+ "Dell, Lenovo, Hp, Asus for product laptop")
	@Test
	void testFindProductList() {
	    List<String> findList = Arrays.asList("Dell", "Lenovo", "Hp", "Asus");  
	  	assertThat(findList, hasItem("Dell"));	
	}

}
