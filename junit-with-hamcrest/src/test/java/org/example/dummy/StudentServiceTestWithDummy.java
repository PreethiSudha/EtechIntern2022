package org.example.dummy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.faketest.StudentRepoFake;
import org.example.model.Student;
import org.example.service.StudentProfessorService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StudentServiceTestWithDummy {
	
	@Test
	@DisplayName(value = "Test Add Method Return instead object back")
	void testAddMethod() {
		StudentRepoFake repo=new StudentRepoFake();
		DummyProfessorRepository dummy=new DummyProfessorRepository();
		StudentProfessorService service= new StudentProfessorService(repo, dummy);
		Student ram=new Student(201, "Ramesh");
		Student actual= service.add(ram);
		assertEquals(actual, ram);
	}
	
	
}

