package com.training;

import java.util.*;

import com.training.model.Product;

public class Application {

	public static void main(String[] args) {
		
		Product cadbury = new Product(101, "Cadbury", 975);
		Product dairy = new Product(102, "Dairy", 855);
		Product ferrero = new Product(103, "Ferrero Rocher", 1000);	
		Product amul = new Product(104, "Amul", 500);
		Product nutella = new Product(105, "Nutella", 650);
		
		
		Set<Product>  choco = new TreeSet<>();
		
		choco.add(cadbury);
		choco.add(dairy);
		choco.add(ferrero);
		choco.add(amul);
		choco.add(nutella);
		
		}
	}


