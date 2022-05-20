package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import com.example.demo.entity.Product;
import com.example.demo.repos.ProductRepository;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
		
		ApplicationContext ctx  =SpringApplication.run(SpringJdbcApplication.class, args);
		
		ProductRepository repo = ctx.getBean(ProductRepository.class);
		
		Product tv = ctx.getBean(Product.class);
		
		//System.out.println("Row Added:=" +repo.add(tv));
		
		System.out.println("***********Before Removing and Updating*********");
		
		repo.findAll().forEach(System.out::println);
		
		System.out.println("Row found:=" +repo.findById(631));
		
		System.out.println("Row Deleted:=" +repo.remove(611));
		
		System.out.println("Row updated:=" +repo.update(tv));
		
		System.out.println("***********After Removing and Updating*********");
		
		repo.findAll().forEach(System.out::println);
	
	}

	@Bean
	public Product tv() {
		return new Product(108, "tablet", 87000);
	}
}
