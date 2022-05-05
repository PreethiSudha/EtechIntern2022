package com.training.ifaces;

@FunctionalInterface
public interface Converter<T,R> {
	
	public R convert(T value);
	
	//when we use @functionalInterface, then the interface have only one abstract method not more than that.
	//public R change(T value);

}
