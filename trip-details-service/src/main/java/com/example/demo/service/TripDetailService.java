package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.entity.TripDetail;
import com.example.demo.repo.TripDetailRepository;

@Service
public class TripDetailService {
	
	private TripDetailRepository repo;
	
	public TripDetailService(TripDetailRepository repo) {
		super();
		this.repo=repo;
	}

	public List<TripDetail> findAll(){
		return this.repo.findAll();
	}
	
	public TripDetail findByDriverId(int id){
		return this.repo.findByDriverId(id);
	}

	public TripDetail save(TripDetail entity) {
		return this.repo.save(entity);
	}

//	public void removeById(int tripId) {
//		Optional<TripDetail> foundId = repo.findById(tripId);
//		if(foundId.isPresent()) {
//			repo.deleteById(tripId);
//		}else {
//			throw new RuntimeException("Element with " +tripId+ " Not Present");
//		}
//	}
	
	
}
