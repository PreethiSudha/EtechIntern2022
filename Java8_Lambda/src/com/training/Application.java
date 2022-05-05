package com.training;

import com.training.ifaces.Converter;
import com.training.services.CurrencyConverter;

public class Application {
	//create a ststic method as print and this method takes Converter as an args.
	public static void print(Converter<Double,Double> conv) {

		System.out.println(conv.convert(300.0));
		
	}

	public static void main(String[] args) {
		
		Converter<Double, Double> obj = new CurrencyConverter();
		
		System.out.println(obj.convert(20.0));
		
		Converter<Double, Double> lambda1= new CurrencyConverter();
		
		System.out.println(lambda1.convert(30.0));
		
		Converter<Double, Double> lambda = (val)-> val*200.0;
		
		System.out.println(lambda.convert(40.0));
		
		print(lambda);
		
		Converter<String,Integer> strLength = (str)->str.length();
		
		System.out.println(strLength.convert("Sushu"));
		
	}

}
