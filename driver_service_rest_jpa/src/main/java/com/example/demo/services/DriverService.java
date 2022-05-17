package com.example.demo.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Driver;
import com.example.demo.repos.DriverRepository;

@Service
public class DriverService {

	@Autowired
	private DriverRepository repo;

	public List<Driver> findAll() {
		return this.repo.findAll();
	}
	
	public Driver add(Driver entity) {
		return this.repo.save(entity);
	}
	
	public Driver findById(int id) {
		return this.repo.
				findById(id).
				orElseThrow((()-> new RuntimeException("ID NOT FOUND")));
	}
	
	//to use the method having any datatype with try-catch block
//	public String deleteById(int id) {
//		String message;
//		try {
//		this.repo.deleteById(id);
//		
//		message="Element deleted";
//		
//		
//		} catch (NoSuchElementException e) {
//
//			e.printStackTrace();
//		//	message="No present";
//		}
//		return message;
//	}
	
	//to use the method having any datatype with if-else method
//	public Driver removeById(Driver entity) {
//	boolean result=this.repo.existsById(entity.getId());
//	if(result) {
//		this.repo.delete(entity);
//	}
//	else {
//		throw new NoSuchElementException("element with id "+entity.getId()+"not present");
//	}
//	return entity;
//		}
//	}
	
	//to use both the void and response entity methods
	public void removeById(int id) {
		repo.deleteById(id);
	}
	
	
	public List<Driver> findByDriverName(String srchName){
		return this.repo.findByDriverName(srchName);
	}

	public List<Driver> srchByMobileNumber(long number){
		return this.repo.findByMobileNumber(number);
	}
	
	public List<Driver> srchByMobileNumber(double rating){
		return this.repo.searchByRating(rating);
	}
	
	public int updatedRating(int id, double updatedRating ) {
		int rowsUpdated = 0;
		this.repo.modifyRating(id, updatedRating);
		return rowsUpdated;
	}
}



















