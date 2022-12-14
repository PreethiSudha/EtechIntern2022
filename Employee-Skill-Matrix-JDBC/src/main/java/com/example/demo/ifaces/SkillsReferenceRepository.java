package com.example.demo.ifaces;

import java.util.List;

import com.example.demo.entity.SkillsReference;

public interface SkillsReferenceRepository {

	public Object create(SkillsReference entity);
	public int add(SkillsReference entity);
	public List<SkillsReference> findAll();

	
}
