package com.example.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.ConfigurableApplicationContext;

import org.springframework.context.annotation.Bean;

import com.example.demo.entity.bidirectional.Doctor;

import com.example.demo.entity.bidirectional.Patient;
import com.example.demo.utils.bidirectional.PatientUtils;

@SpringBootApplication
public class SpringDataJpaOneToManyBidirectionalApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx =
				
				SpringApplication.run(SpringDataJpaOneToManyBidirectionalApplication.class, args);
		
		PatientUtils obj = ctx.getBean(PatientUtils.class);
		
		obj.create();
		
		obj.findAll();
		
		ctx.close();
	}
	
	@Bean
	public Doctor munna() {
		Doctor doc =  new Doctor();	
		doc.setDoctorId(3030);
		doc.setDoctorName("Rasak Munna");
		doc.setDepartment("Cardialogist");
		doc.setPhonenumber(987456321);
		return doc;
	}
	
	@Bean
	public Patient sush() {
		return new Patient(201, "Sushmi", 963852741);
	}
	
	@Bean
	public Patient jaya() {
		return new Patient(202, "Jaya", 968537421);
	}

	@Bean
	public Patient amali() {
		return new Patient(303, "Amali", 987354621);
	}
}
