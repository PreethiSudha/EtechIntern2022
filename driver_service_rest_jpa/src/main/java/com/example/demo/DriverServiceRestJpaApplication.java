package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Driver;
import com.example.demo.repos.DriverRepository;

@SpringBootApplication
public class DriverServiceRestJpaApplication {

	public static void main(String[] args) {
		
				SpringApplication.run(DriverServiceRestJpaApplication.class, args);

				//we could not close this spring boot application , 
				//if we do so we cant able to run the code in the web
	}

	@Bean
	public CommandLineRunner runner() {
		
		return new CommandLineRunner() {
			
			@Autowired
			DriverRepository repo;
			
			@Override
			public void run(String... args) throws Exception {
				
				repo.save(new Driver(101, "damu", 954698875, 45.22));
				
			}
		};
	}
}
