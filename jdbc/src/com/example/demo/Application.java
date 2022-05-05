package com.example.demo;
import java.sql.*;
import java.util.Optional;

import com.example.demo.services.Invoice;
import com.example.demo.services.ProductService;
import com.example.entity.Product;
public class Application {

	public static void main(String[] args) {
		
		Connection con;
		
		try {
			
			con = DriverManager.getConnection("jdbc:Oracle:thin:@10.90.1.105:1521/DEV", "HR", "HR");
			
			ProductService service = new ProductService(con);
			
			//maven - usingTxn
			Product katli = new Product(646,"Katli", 1200.0);
			
			//Product jamun = new Product(625, "Jamun", 450.0);
			
			Invoice invoice = new Invoice(879, "AAA", 5, 108);
			
			service.usingTxn(katli, invoice);
			//to run it now, the 1st pd1 will be added and the pd2 will not be added so check this 
			//tillhere
			
			Product toAdd = new Product(778, "Micro Procesors", 35880.90);
			
			int rowAdded = service.addProduct(toAdd);
			
			service.findAll().forEach(System.out::println);
			
			System.out.println("rowAdded: " +rowAdded);
			
			System.out.println("===================================================");
			
			int rowsDeleted = service.deleteById(645);
			
			service.findAll().forEach(System.out::println);
			
			System.out.println("rowsDeleted: " +rowsDeleted);
			
			System.out.println("===================================================");
			
			Optional<Product> found = service.findById(111);
			
			if(found.isPresent()) {
				
				System.out.println(found.get());
			
			}else {
				
				System.out.println("product with given id is not present");
			}
			
			System.out.println("===================================================");
			
			int rowsUpdated = service.UpdatePriceByName("fridge", 98990);
			
			service.findAll().forEach(System.out::println);
			
			System.out.println("rowsUpdated: " +rowsUpdated);
			
			//System.out.println(con);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
	}

}
