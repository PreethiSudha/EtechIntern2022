package org.training.model;

import org.springframework.stereotype.Service;

@Service
public class Book {
	
	public double getBookDiscount(String bookName) {
		return 0.10;	
	}	
}
