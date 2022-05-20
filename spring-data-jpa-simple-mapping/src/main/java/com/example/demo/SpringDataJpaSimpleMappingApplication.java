package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.service.DoctorService;

@SpringBootApplication
public class SpringDataJpaSimpleMappingApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringDataJpaSimpleMappingApplication.class, args);
		//Doctor siva = ctx.getBean(Doctor.class);
		DoctorService service = ctx.getBean(DoctorService.class);
		//service.findAll().forEach(System.out::println);
		//Doctor added = service.add(siva);
//		if(added!=null) {
//			System.out.println("One Doctor Added");
//		}
			
		service.findByDepartment("Pediatrist").forEach(System.out::println);
		System.err.println("**********************************");
		System.out.println(service.findByDoctorName("Prawin"));
		System.err.println("***********************************");
		System.out.println(service.findByDoctorNameAndDepartment("Suresh","Dentist"));
		System.err.println("************************************");
     	service.findAll().forEach(System.out::println);
		ctx.close();
	}
	
	
}








