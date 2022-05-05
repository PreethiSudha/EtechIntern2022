package com.training.ifaces;

@FunctionalInterface
public interface Conditional<T> {
	//abstract method
	public boolean test(T t);
	
	//default method
    default boolean negate(Double value) {
		
		return value<70.00;
	
	}
	
    //static method                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
	public static String getMessage() {
		
		return "Static Method in Interface - Yes, It's Real";
	}
	
}
