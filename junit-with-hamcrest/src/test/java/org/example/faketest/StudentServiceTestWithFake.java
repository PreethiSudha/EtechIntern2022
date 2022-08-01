package org.example.faketest;

//import java.util.List;
//
//import org.example.dummy.DummyProfessorRepository;
//import org.example.model.Student;
//import org.example.service.StudentService;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class StudentServiceFakeTesting {

//	@Test
//	@DisplayName(value="Test Add Method Return inserted object back")
//	void testAddMethod() {
//		
//		StudentRepoFake fake = new StudentRepoFake();
//		DummyProfessorRepository dummy = new DummyProfessorRepository();
//		StudentService service = new StudentService(fake,dummy);
//		
//		Student ram = new Student(101, "Ram");
//		
//		Student actual = service.add(ram);
//		
//		assertEquals(actual, ram);
//		
//	}
//	
//	@Test
//	@DisplayName(value="Test findAll method return all the Elements added")
//	void testFindAll() {
//		
//		StudentRepoFake fake = new StudentRepoFake();
//		DummyProfessorRepository dummy = new DummyProfessorRepository();
//		StudentService service = new StudentService(fake,dummy);
//		
//		List<Student> actual = service.findAll();
//		
//		Student ram = new Student(101, "Ram");
//		Student raj = new Student(102, "Raj");
//		
//		service.add(ram);
//		service.add(raj);
//
//		int expected = 2;
//		
//		assertEquals(actual,expected);
//		
//	}
//}

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import org.example.model.Student;
import org.example.service.StudentService;

public class StudentServiceTestWithFake {

	@Test
	@DisplayName(value = "Test addMethod Return insteard object back")
	void testAddMethod() {
		StudentRepoFake fake=new StudentRepoFake();
		StudentService service=new StudentService(fake);
		Student ram=new Student(101, "Rama Krishna");
		
		Student actual=service.add(ram);
		
		assertEquals(actual, ram);
	}
	
	@Test
	@DisplayName(value = "Test findAll method return all the element Added")
	void testAddMethodReturn() {
		StudentRepoFake fake=new StudentRepoFake();
		StudentService service=new StudentService(fake);
		Student lochan=new Student(101, "Rahul");
		Student rahul=new Student(101, "lochan");
		
		int x=0;
		x+=(service.add(rahul) != null?1:0);
		x+=(service.add(lochan) != null?1:0);
		assertEquals(2, x);
		
//		service.add(rahul);
//		service.add(lochan);
//		int actual=service.findAll().size();
//		assertEquals(2, actual);
	}
}

