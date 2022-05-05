package com.training.exception;

public class InvalidEmailException extends Exception {

	private String Message;

	public InvalidEmailException(String Message) {
		super();
		this.Message=Message;
	}
	
	
	
	@Override
	public String getMessage()
	{		
	return Message;
	}
	
	
	
}
