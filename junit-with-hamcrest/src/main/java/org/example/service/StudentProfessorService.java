package org.example.service;

import java.util.List;

import org.example.ifaces.ProfessorRepository;
import org.example.ifaces.StudentRepository;
import org.example.model.Student;

public class StudentProfessorService {

private StudentRepository studRepo;
private ProfessorRepository profRepo;
	
	public StudentProfessorService(StudentRepository studRepo, ProfessorRepository profRepo) {
	super();
	this.studRepo = studRepo;
	this.profRepo = profRepo;
}

	public Student add(Student entity) {
		return this.studRepo.add(entity);
	}
	
	public List<Student> findAll(){
		return this.studRepo.findAll();
	}
}
