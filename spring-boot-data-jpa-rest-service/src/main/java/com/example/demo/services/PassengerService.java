package com.example.demo.services;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Passenger;
import com.example.demo.entity.TripHistory;
import com.example.demo.repos.PassengerRepository;

@Service
public class PassengerService {

	@Autowired
	private PassengerRepository repo; 
	
	public Passenger add(Passenger entity) {
		return this.repo.save(entity);
	}

	public List<Passenger> srchByPassengerName(String passengername) {
		return this.repo.findByPassengerName(passengername);
	}

	public List<TripHistory> srchByTripDate(LocalDate tripdate) {
		return this.repo.findByTripDate(tripdate);
	}
}
