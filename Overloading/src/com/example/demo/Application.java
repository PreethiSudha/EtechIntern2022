package com.example.demo;
import java.util.*;
public class Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the name: ");
		String name = sc.next();
		Converter convObj = new Converter();
		System.out.println(convObj.convert(name));
		
		
		System.out.println("Enter the farenTemp= ");
		double farenTemp = sc.nextDouble();
		Converter conObj1 = new Converter();
		System.out.println("Celcius Temp:= " +conObj1.convert(farenTemp) );
		
		
		System.out.println("Enter the amount:= ");
		double amount = sc.nextDouble();
		System.out.println("Enter the Current to Convert 1-USD 2-EURO");
		int frm = sc.nextInt();
		System.out.println(convObj.convert(amount, frm));
		System.out.println(convObj.convert(amount));
		
		
		sc.close();
	}

}