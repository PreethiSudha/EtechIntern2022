package com.example.demo.services;

import org.springframework.stereotype.Service;

@Service
public class LoanService {

public double getInterestRate(int val) {
		
		System.out.println("Actual value: "+val);
		
		if(val>10000) {
			return 1.0;
		}
		return 2.0;
		}

//	public double getInterestRate(int val1, int val2 ) {
//		
//		System.out.println("Actual value: "); 
//		System.out.println("value1 : "+val1 + " , " +"Value2 : " +val2);
//		
//		if(val1>1000) {
//			System.out.println("value1 : " +val1+" val1 is greater ");
//		}else if(val2>val1){
//			System.out.println("value1 : "+val2+" val1 is greater than val2 ");
//		}else {
//			System.out.println("val2 is greater than all " +val2);
//		}
//		
//		return 1.0;
//		}
	
}
