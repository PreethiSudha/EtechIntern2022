package org.example.stub;

import java.util.Arrays;
import java.util.List;

import org.example.ifaces.StudentRepository;
import org.example.model.Student;

public class StudentRepositoryStub implements StudentRepository {

	@Override
	public Student add(Student entity) {
		return null;
	}

	@Override
	public List<Student> findAll() {
		return Arrays.asList(new Student(201,"Shiva"), new Student(202, "Dhivya"));
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
