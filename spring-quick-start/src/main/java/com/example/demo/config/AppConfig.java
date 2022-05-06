package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.model.Customer;
import com.example.demo.model.Product;
import com.example.demo.model.Student;
import com.example.demo.model.Teacher;

@Configuration
public class AppConfig {
	
	//Id of the bean is same as the method name bcoz method name is always starts with small letter
	
	@Bean
	public Student ram() {
		return new Student(101, "Ramnath", 70);
	}
	
	@Bean
	public Student shyam() {
		return new Student(102, "Shyamnath", 90);
	}
	
	@Bean
	public Teacher ravi() {
		return new Teacher(221, "Ravinath", "Maths");
	}
	
	@Bean
	public Product tv() {
		return new Product(301, "Sony LED");
	}
	
//	@Bean
//	public Product fridge() {
//		return new Product(302, "Samsung whirlpool");
//	}
	
	@Bean
	public Customer vignesh() {
		return new Customer(401, "Vignesh");
	}
	
	@Bean
	public Customer magesh() {
		return new Customer(402, "Magesh");
	}
	
	@Bean
	public Customer rajesh() {
		return new Customer(403, "Rajesh");
	}
}
