package com.task.training;
import java.util.*;
import com.task.training1.*;
import com.task.training2.*;
import com.task.training3.*;

public class Application {

	public static void main(String[] args) {
		
		Customer custObj = new Customer(99, "Preetz", "MSR Luxury Pg", 987654321);
		Employee empObj = new Employee(100, "Vijay", 987654312, "Chicken Briyani", 200.0);
		Hotel hotelObj = new Hotel("Nissi", "Kelambaakkam", "Non-Veg", "Chicken and Chicken Only", "9.00 AM to 11.00PM");
		
		System.out.println("Customer Id: " +custObj.getCustId());
		System.out.println("Customer Name: " +custObj.getCustName());
		System.out.println("Customer Address: " +custObj.getCustAddress());
		System.out.println("Customer Mobile Number: " +custObj.getCustMblNumber());
		
		
		System.out.println("Employee ID: " +empObj.getEmpId());
		System.out.println("Employee Name: " +empObj.getEmpName());
		System.out.println("Employee Mobile Number: " +empObj.getEmpMblNumber());
		System.out.println("Employee Order Name: " +empObj.getOrderName());
		System.out.println("Employee Order Price: " +empObj.getOrderPrice());
		
		System.out.println("Hotel Name: " +hotelObj.getHotelName());
		System.out.println("Hotel Address: " +hotelObj.getHotelAddress());
		System.out.println("Hotel Dish Types: " +hotelObj.getHotelDishTypes());
		System.out.println("Hotel Dish Name: " +hotelObj.getHotelDishesName());
		System.out.println("Hotel Timings: " +hotelObj.getHotelTimings());
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Customer Name: ");
		String cust = sc.next();
		custObj.setCustName(cust);
		System.out.println("Customer Name: " +custObj.getCustName());
		
		sc.close();
		
	}

}
