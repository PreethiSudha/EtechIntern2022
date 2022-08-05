package org.example.faketest;

import java.util.ArrayList;
import java.util.List;

import org.example.ifaces.StudentRepository;
import org.example.model.Student;

public  class StudentRepoFake implements StudentRepository {
	
	private List<Student> list;
	
	public StudentRepoFake() {
		super();
		list = new ArrayList<>();
	}

	@Override
	public Student add(Student entity) {
		return list.add(entity)?entity:null;
	}

	@Override
	public List<Student> findAll() {
		return this.list;
	}

	@Override
	public int findStudentSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Student addWithCondition(Student stud) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
