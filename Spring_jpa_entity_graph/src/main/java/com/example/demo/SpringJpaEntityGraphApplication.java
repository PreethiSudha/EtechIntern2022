package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Address;
import com.example.demo.entity.City;
import com.example.demo.entity.User;
import com.example.demo.repos.AddressRepository;
import com.example.demo.services.AddressService;

@SpringBootApplication
public class SpringJpaEntityGraphApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx = 
				SpringApplication.run(SpringJpaEntityGraphApplication.class, args);
		
		AddressService service = ctx.getBean(AddressService.class);
		
		//service.task1();
		
		//service.task2();
		
		service.task4();
		
		ctx.close();
		
	}
	
	@Bean
	//special type of bean, it is a functional interface which has only one functional abstract method
	public CommandLineRunner runner() {
		
		return new CommandLineRunner() {
			
			@Autowired
			AddressRepository addRepo;
			
			
			@Override
			public void run(String... args) throws Exception {
				
				City chennai = new City(980, "Chennai");
				City madurai = new City(982, "Madurai");
				
				User ramesh = new User(700, "Ramesh", 46655);
				User suresh = new User(701 , "Suresh", 756146);
				
				Address address1 = new Address(101, "Mr.", madurai, suresh);
				Address address2 = new Address(102, "Mr.", chennai, ramesh);
				
				this.addRepo.save(address1);
				this.addRepo.save(address2);
				
			}
		};
	}

}
