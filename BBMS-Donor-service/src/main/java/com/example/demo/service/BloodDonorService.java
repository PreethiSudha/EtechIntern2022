package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.BloodDonor;
import com.example.demo.repos.BloodDonorRepository;

@Service
public class BloodDonorService {

	
	private BloodDonorRepository repo;
	
	@Autowired
	public BloodDonorService(BloodDonorRepository repo) {
		super();
		this.repo = repo;
	}

	public BloodDonor save(BloodDonor entity) {
		return repo.save(entity);
	}
	
	public List<BloodDonor> findAll(){
		return repo.findAll();
	}
	
	public BloodDonor[] findByBloodGroup(String name) {
		return repo.findByBloodGroup(name);
	}
	
	public BloodDonor[] findByLocation(String place) {
		return repo.findByLocation(place);
	}

	public BloodDonor[] removeByMobileNumber(long mblNum) {
		return repo.deleteByMobileNumber(mblNum);
	}
	
	public BloodDonor[] deleteByEmail(String email){
		return repo.deleteByEmail(email);	
	}
	
//	public BloodDonor[] updateByLocation(String loc) {
//		return repo.updateByLocation(loc);
//	}

//	public BloodDonor[] newLoc(String oldLoc, String newLoc ) {
//		return this.repo.modifyLocation(oldLoc, newLoc);
//	}
	
	 public int updateLocation(long mobileNumber, String updateLocation){
		   return this.repo.modifyLocation(mobileNumber, updateLocation);
	 }
}
