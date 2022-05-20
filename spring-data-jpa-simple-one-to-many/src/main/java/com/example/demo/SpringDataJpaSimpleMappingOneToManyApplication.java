package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Doctor;
import com.example.demo.entity.Patient;
import com.example.demo.utils.DoctorUtils;

@SpringBootApplication
public class SpringDataJpaSimpleMappingOneToManyApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringDataJpaSimpleMappingOneToManyApplication.class, args);
		
		DoctorUtils obj = ctx.getBean(DoctorUtils.class);
		
		obj.create();
		
		//obj.findAll();
		
		//obj.findDoctorFromPatient();
		
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
		return new Patient(101, "Sushmitha", 963852741);
	}
	
	@Bean
	public Patient jaya() {
		return new Patient(102, "Jayavardhini", 968537421);
	}

	@Bean
	public Patient amali() {
		return new Patient(103, "Amalichristina", 987354621);
	}
}
