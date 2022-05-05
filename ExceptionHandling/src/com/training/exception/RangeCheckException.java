package com.training.exception;

public class RangeCheckException extends Exception {
	
	private String message;

	public RangeCheckException(String message) {
		
		super();
		
		this.message = message;
	}
	
	

}
