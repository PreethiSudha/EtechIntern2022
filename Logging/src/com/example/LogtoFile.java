package com.example;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class LogtoFile {

	public static void main(String[] args) {
		
		Logger log = Logger.getLogger(LogtoFile.class.getName());
		
		FileHandler handler;
		try {
			handler = new FileHandler("logs.log");
			log.addHandler(handler);
			log.info("Try Block Called");
			throw new Exception("Preetz is a Great Coder");
		} catch (SecurityException e) {
			log.warning(e.getMessage());
		} catch (IOException e) {
			log.warning(e.getMessage());                                                                                                                                                                                                                                                                                                                                          
		} catch (Exception e) {
			log.warning(e.getMessage());
		}

	}

}
