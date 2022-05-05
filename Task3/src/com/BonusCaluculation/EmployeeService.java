package com.BonusCaluculation;
import java.util.*;
public class EmployeeService {
	private long salary;
	private double bonus;
	
	
	
	public EmployeeService(long salary) {
	super();
	this.salary = salary;
	}

	

	public EmployeeService(double bonus) {
		super();
		this.bonus = bonus;
	}



	public long getSalary() {
		return salary;
	}


	public void setSalary(long salary) {
		this.salary = salary;
	}


	
	public double getBonus() {
		return bonus;
	}



	public void setBonus(double bonus) {
		this.bonus = bonus;
	}



	public static void main(String[] args) {
		
		 salary sal = new salary();
		   
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 33% bonus of the total Salary: "); 
		long sal= nextLong();
		sal.setsalary(sal);
		System.out.println("Salary = " +sal.getsalary());
		sc.close();
		
		
		
		
	}
	
	

}
