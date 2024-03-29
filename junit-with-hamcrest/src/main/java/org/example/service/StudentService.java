package org.example.service;

import java.util.List;
import org.example.model.Student;
import org.example.ifaces.StudentRepository;

public class StudentService {

	private StudentRepository repo;
	
	public StudentService(StudentRepository repo) {
		super();
		this.repo = repo;
	}

	public Student add(Student entity) {
		return this.repo.add(entity);
	}
	
	public List<Student> findAll(){
		return this.repo.findAll();
	}

	public int findStudentSize() {
		return this.repo.findAll().size();
	}
	
	public Student addWithCondition(Student stud) {
		Student added = null;
		if(stud.getRollNumber()>2000)
		{
			this.repo.add(stud);
			added = stud;
		}
			return added;
	}

}