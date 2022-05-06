package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.model.Bill;
import com.example.demo.model.CustomerList;
import com.example.demo.model.Invoice;
import com.example.demo.model.Student;
import com.example.demo.model.Teacher;

@SpringBootApplication
public class SpringQuickStartApplication {

	public static void trial(String[] args) {
		
		ApplicationContext ctx = SpringApplication.run(SpringQuickStartApplication.class, args);
		
		//when using Id need to cast to specific Bean since
		//return type of getBean method is Object
		
		System.out.println(ctx.getBean("ram")); //student
		
		//System.out.println(ctx.getBean("Teacher"));
		//we cant able to call the class name as an object
		//getBean overloaded method 
		//method name same but different args
		
		//casting not required, but there should be only one bean of that type will throw exception
		
		Student shyam = ctx.getBean(Student.class); 
		System.out.println(shyam); //student
		
		//when more than one of Bean of the same type ar available should use id and class name
		
		Teacher stella = ctx.getBean(Teacher.class);
		
		stella.setId(201);
		stella.setName("Stella Marie");
		stella.setSubject("Java");
		
		System.out.println(stella); //teacher
		System.out.println(ctx.getBean("ravi")); //teacher
		
	}
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = SpringApplication.run(SpringQuickStartApplication.class, args);

		Invoice inv = ctx.getBean(Invoice.class);
		System.out.println(inv);
		
		Bill bill = ctx.getBean(Bill.class);
		
		System.out.println("Customer:"+bill.getCustomer());
		System.out.println("Product:"+bill.getProduct());
		
		CustomerList list = ctx.getBean(CustomerList.class);
		
		
		System.out.println("======List======");
		list.getCustList().forEach(System.out::println);
	}
}



























