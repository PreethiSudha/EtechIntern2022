package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Address;
import com.example.demo.repos.AddressRepository;

@Service
public class AddressService {

	@Autowired
	private AddressRepository addRepo;
	
	public void task1() {
		
		List<Address> addressList = addRepo.findAll();
		
		for(Address eachAdress:addressList) {
			System.out.println(eachAdress.getTitle());
			System.out.println(eachAdress.getCity());
			System.out.println(eachAdress.getUser());
		}
	}
	
//	public void task2() {
//		
//		List<Address> addressList = addRepo.findAll();
//		
//		for(Address eachAdress:addressList) {
//			System.out.println(eachAdress.getTitle());
//			System.out.println(eachAdress.getCity());
//			System.out.println(eachAdress.getUser());
//		}
//	}
	
	public void task4() {
		
		List<Address> addressList = addRepo.findAll();
		
		for(Address eachAdress:addressList) {
			System.out.println(eachAdress.getTitle());
			//System.out.println(eachAdress.getCity());
			System.out.println(eachAdress.getUser());
		}
	}
}
