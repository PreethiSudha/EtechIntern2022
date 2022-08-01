package org.example.services;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
	
	public int findProduct;


	public double findDiscount(String product) {
		double discount = 0.10;
		if(product.equals("tv") || product.equals("laptop")) {
			discount=0.20;
		}
		return discount;
	}
	
	
	public List<String> findProduct() {
		List<String> laptops = new ArrayList<String>(); 
		laptops.add("Dell");
		laptops.add("Lenovo");
		laptops.add("Hp");
		laptops.add("Asus");
		return laptops;
		
		//String[] list= {"Dell","Lenevo","Preadoter","Hp","Asus"};
		//List<String> productList=Arrays.asList("Dell","Lenevo","Preadoter","Hp","Asus");
	}

}
