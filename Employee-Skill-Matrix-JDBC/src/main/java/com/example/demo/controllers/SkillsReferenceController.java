package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.SkillsReference;
import com.example.demo.services.SkillsReferenceService;

@RestController
@RequestMapping(path="api/v1/skillReference/")
public class SkillsReferenceController {
	
	@Autowired
	private SkillsReferenceService skillRefService;
	
	@PostMapping(path="create")
	public Object create(@RequestBody SkillsReference entity) {
		return skillRefService.create(entity);
	}

	@PostMapping(path="add")
	public int add(@RequestBody SkillsReference entity) {
		return skillRefService.add(entity);
	}
	
	@GetMapping(path="findAll")
	public List<SkillsReference> findAll() {
		return skillRefService.findAll();
	}
	
	//API-3
	@PostMapping(path="addskillDetails")
	public Object addSkillDetails(@RequestBody SkillsReference entity) {
		return skillRefService.addSkillDetails(entity);
	}
}
