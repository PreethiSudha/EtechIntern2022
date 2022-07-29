package com.example.demo.controllers;

import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dto.Donordto;
import com.example.demo.entity.BloodDonor;
import com.example.demo.entity.BloodPatient;

@RestController
@RequestMapping(path = "/client")
public class ClientController {

	private RestTemplate template;

	@Autowired
	private Donordto dto;
	

	@Autowired
	public ClientController(RestTemplate template) {
		super();
		this.template = template;
	}
	
	@GetMapping(path = "/patients")
	public String getPatients() {
		return this.template.getForObject("http://PATIENT-SERVICE-DETAILS/api/v1/patients/", String.class);
	}
	
	
	@GetMapping(path = "/patients/json")
	public BloodPatient[] getPatientJson() {
		return this.template.getForObject("http://PATIENT-SERVICE-DETAILS/api/v1/patients/", BloodPatient[].class);
	}
	
	@GetMapping(path = "/donors")
	public String getDonors() {
		return this.template.getForObject("http://BBMS-DONOR-SERVICE/api/v1/donors/", String.class);
	}
	
	@GetMapping(path = "/patient/donors/{name}")
	public Donordto getPatientDonors(@PathVariable("name")String name) {
		
		BloodPatient patient=this.template.getForObject("http://PATIENT-SERVICE-DETAILS/api/v1/patients/srch/"+name,BloodPatient.class);
				
		BloodDonor[] donors=this.template.getForObject("http://BBMS-DONOR-SERVICE/api/v1/donors/srch/grp/"+name,BloodDonor[].class);	
		
		dto.setPatient(patient);
		List<BloodDonor> detailSet = Arrays.asList(donors);
//		Set<Donor> detailSet = Arrays.stream(donors).collect(Collectors.toSet());
		dto.setDonors(detailSet);
		return dto;
	}
	
	@GetMapping(path = "/patient/donors/loc/{place}")
	public Donordto getLocation(@PathVariable("place")String place) {
		
		BloodPatient patient=this.template.getForObject("http://PATIENT-SERVICE-DETAILS/api/v1/patients/srch/loc/"+place,BloodPatient.class);
				
		BloodDonor[] donors=this.template.getForObject("http://BBMS-DONOR-SERVICE/api/v1/donors/srch/loc/"+place,BloodDonor[].class);	
		
		dto.setPatient(patient);
		List<BloodDonor> detailSet = Arrays.asList(donors);
//		Set<Donor> detailSet = Arrays.stream(donors).collect(Collectors.toSet());
		dto.setDonors(detailSet);	
		return dto;
	}
}
