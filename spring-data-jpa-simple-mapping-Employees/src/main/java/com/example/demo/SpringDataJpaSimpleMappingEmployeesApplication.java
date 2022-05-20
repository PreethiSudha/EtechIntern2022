package com.example.demo;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@SpringBootApplication
public class SpringDataJpaSimpleMappingEmployeesApplication {

	public static void main(String[] args) {
		 
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringDataJpaSimpleMappingEmployeesApplication.class, args);
		 Employee sushmi = ctx.getBean(Employee.class);
		 EmployeeService service = ctx.getBean(EmployeeService.class);
		 service.findAll().forEach(System.out::println);
		 System.err.println("**********************************");
		 Employee added = service.add(sushmi);
		 if(added!=null) {
			 System.out.println("One Employee added");
		 }
		 service.findByDateOfBirth(LocalDate.of(2000, 2, 25)).forEach(System.out::println);
			System.err.println("**********************************");

		 service.findByLocation("NetherLand").forEach(System.out::println);
			System.err.println("**********************************");

		 service.findBySkillSet("Sql").forEach(System.out::println);
			System.err.println("**********************************");

		 service.getByName("IceLand","javascript").forEach(System.out::println);
		
		 ctx.close();
	}

	@Bean
	public Employee raav() {
		return new Employee(104, "raav", LocalDate.of(2009,5,30),"IceLand", "javascript", 964547964);
	}
}
