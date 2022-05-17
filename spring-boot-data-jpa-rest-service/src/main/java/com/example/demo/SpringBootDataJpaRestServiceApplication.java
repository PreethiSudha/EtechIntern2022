package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Passenger;
import com.example.demo.repos.PassengerRepository;

@SpringBootApplication
public class SpringBootDataJpaRestServiceApplication {

	public static void main(String[] args) {
	
		SpringApplication.run(SpringBootDataJpaRestServiceApplication.class, args);
		
		
	}
	
	@Bean
	public CommandLineRunner runner() {
		
		return new CommandLineRunner() {
			
			@Autowired
			PassengerRepository repo; 
			
			@Override
			public void run(String... args) throws Exception {
		
				repo.save(new Passenger(501, "Vats", "vats123@gamil.com", "GreenLand", triplist));
			}
		};
	}

}
