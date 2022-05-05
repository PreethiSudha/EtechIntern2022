package com.example;
import java.util.logging.*;

public class Application {

	public static void main(String[] args) {
		
		Logger log = Logger.getLogger("com.example.Application");
		log.setLevel(Level.ALL);
		log.info("Info Message");
		//System.out.println("Info Message");
		//the above two lines are same , just to see both at the same time, we use it on same example
		log.warning("Warning message ******");
		log.severe("Severe message ++++++++++");
		log.fine("I am fine $$$$$$$$$$$$$$$$$$");
	}

}
