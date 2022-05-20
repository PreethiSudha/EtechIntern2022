package com.example.demo.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Seminar;
import com.example.demo.entity.Speaker;
import com.example.demo.ifaces.SeminarRepository;

@Component
public class SeminarUtils {

	@Autowired
	Seminar smnr;
	
	@Autowired
	private Speaker spkrList;
	
	@Autowired
	SeminarRepository repo;
	
	public void create() {
		smnr.setSpeaker(spkrList);
		Seminar added = repo.save(smnr);
		if(added!=null) {
			System.out.println("One Record Added!!!");
		}
	}

	public void findAll() {
		
		System.out.println(spkrList);
	}

}
