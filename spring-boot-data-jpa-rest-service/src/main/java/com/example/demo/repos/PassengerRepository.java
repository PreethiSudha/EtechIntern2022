package com.example.demo.repos;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Integer> {

	 //Passenger findByPassengerName(String passengername); 
	//we will get one passenger with his/her too many trip histories
	
	List<Passenger> findByPassengerName(String passengerName); 
	//it may be look like many to many but why we used in one to many means
	//may be 2 or more persons have the same name
	
	//passemgerlist contains passenger1, passenger2,.....
	//List<Passenger> shows what are all the properties that are related to the passenger
	
	 List<Passenger> findByTripListTripDateTime(LocalDateTime tripDate);
}
