package com.training.services;

import java.util.List;

import com.training.model.Product;

public class ProductServices {
	
	public List<Product> GetTopThree(){
		int i;
		for(i=0; i<=3; i++) {
			System.out.println("Top three Products are : " +i);
		}
		return this.GetTopThree();
		
	}
	
	
}
