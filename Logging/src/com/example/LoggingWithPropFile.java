package com.example;

import java.util.logging.Logger;

import com.training.model.Book;

public class LoggingWithPropFile {

	public static void main(String[] args) {
		
		String file = LoggingWithPropFile.class.getClassLoader().getClass()
				.getResource("logging.Properties")
				.getFile();
		
		System.setProperty("java.util.logging.config.file", file);
		
		System.out.println(file);
		
		Book.log.info("Logging Properties Done Right");
		
		Book java = new Book();
		
		Book.log.info(java.toString());
		
		Logger log = Logger.getLogger("com.training.model");
		
		System.out.println(java);
	}

}
