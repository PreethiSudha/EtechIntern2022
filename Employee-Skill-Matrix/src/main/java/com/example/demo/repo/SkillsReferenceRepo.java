package com.example.demo.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Skills_Reference;

public interface SkillsReferenceRepo extends JpaRepository<Skills_Reference, Integer> {

	@Query(value = "select * from pre_skills_ref where skillName=:name", nativeQuery=true)
	public Optional<SkillsReferenceRepo> findBySkillName(@Param("name") String skillName);

	
	
}
