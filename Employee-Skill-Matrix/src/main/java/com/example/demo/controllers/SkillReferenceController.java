package com.example.demo.controllers;

import java.util.List;

import javax.annotation.security.RolesAllowed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Skills_Reference;
import com.example.demo.services.SkillsReferenceService;

@RestController
@RequestMapping(path="/api/v1/skillReference/")
public class SkillReferenceController {
	
	@Autowired
	private SkillsReferenceService skillRefService;
	
//	//Post api to just insertion of entity by Manager
//	@PostMapping(path="insert/skillName")
//	@RolesAllowed({"MANAGER"})
//	public ResponseEntity<Skills_Reference> add(@RequestBody Skills_Reference entity){
//		Skills_Reference skillsRef = this.skillRefService.insert(entity);
//		return ResponseEntity.status(HttpStatus.CREATED).body(skillsRef);
//	}

	/* API - 3*/
	//Post api to insert the entities by Manager and audit log to transaction table
	@PostMapping(path="insert/skillName")
	@RolesAllowed({"Project Manager"})
	public Object addSkillNames(@RequestBody Skills_Reference entity){
		Object skillsRef = this.skillRefService.insert(entity);
		skillRefService.transactionstatus(entity, skillsRef);
		return skillsRef;
	}
	
	@GetMapping(path="get/skillList")
	public List<Skills_Reference> findAll() {
		List<Skills_Reference> list = this.skillRefService.skillList();
		skillRefService.transactionstatus( "get skillList", list.size()+" SkillList Metadata recieved from DB ");
		return this.skillRefService.skillList();
	}
}