package com.training;
import java.util.*;
import java.util.stream.Collectors;

class Person{
	
	private int id;
	private String name;
	private long phoneNumber;
	
	public Person() {
		super();
	}

	public Person(int id, String name, long phoneNumber) {
		super();
		this.id = id;
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", phoneNumber=" + phoneNumber + "]";
	}

}

public class Test {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,78,89,91,12,23,34,45,56,67);
		
		numbers.stream().filter(e->e%2==0).forEach(System.out::println);
		
		System.out.println("***************^^^^^^^^^^*****************");
		
		List<Person> list = Arrays.asList(new Person(101, "Ravi", 6631616) ,
							new Person(102, "Rocky Bhai", 892356));
		
		Map<String , Long> personData = list.stream()
				.collect(Collectors.toMap(Person::getName,Person::getPhoneNumber))	;	
		
		personData.forEach((key,value)->System.out.println(key +","+ value));
		
		personData.forEach((key,value)->{System.out.println(key);System.out.println(value);
		
		});
		
	}

}































