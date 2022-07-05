package com.mainclass.task;

import com.customer.task.Customer;
import com.employee.service.EmployeeService;
import com.employee.task.Employee;
import com.hotel.task.Hotel;
import java.util.Scanner;


public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer preethi=new Customer("preethi",9840123449L,"female","chennai");
		
		Employee sushmi=new Employee("sushmi",100,50000,"Developer");
		
		Hotel taj=new Hotel("Taj",984012345,5000);
		
		//Customer details 
		System.out.println("Customer details:");
		System.out.println(preethi.getCusName());
		System.out.println(preethi.getCusNo());
		System.out.println(preethi.getCusGender());
		System.out.println(preethi.getCusPlace());
		
		System.out.println();
		
		// Employee details
		System.out.println("Employee Details:");
		System.out.println(sushmi.getEmpName());
		System.out.println(sushmi.getEmpId());
		System.out.println(sushmi.getEmpSalary());
		System.out.println(sushmi.getEmpPosition());
		
		System.out.println();
		
		//taj details
		System.out.println("taj details:");
		System.out.println(taj.getHotelName());
		System.out.println(taj.getHotelNum());
		System.out.println(taj.getHotelAmount());
		//using Scanner
		
		
		System.out.println();
		
		EmployeeService bonus=new EmployeeService();
	      System.out.println("emp bonus "+bonus.calculateBonus(sushmi));
	      
	      System.out.println();
		
		Customer jaya=new Customer();
		Scanner scan=new Scanner(System.in);
		String name=scan.next();
		jaya.setCusName(name);
	      System.out.println("Customer Name is:"+jaya.getCusName());
	      
	      scan.close();
	
	}

}
