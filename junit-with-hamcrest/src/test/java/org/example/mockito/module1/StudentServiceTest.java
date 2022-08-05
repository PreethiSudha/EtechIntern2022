package org.example.mockito.module1;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.example.ifaces.StudentRepository;
import org.example.model.Student;
import org.example.service.StudentService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class StudentServiceTest {
	
	@Mock
	StudentRepository studRepo;
	
	@Mock
	StudentService serviceMock;
	
	@InjectMocks
	StudentService studService;
	
	@DisplayName(value="Test Find All Method with Mockito Stub")
	@Test
	void testFindAll() {
		
//		StudentRepository studRepo = mock(StudentRepository.class);
//		StudentService studService = new StudentService(studRepo);
		
		//stubbing
		
		List<Student> list = new ArrayList<>();
		
		list.add(new Student(101, "Ramesh"));
		list.add(new Student(102, "Rajesh"));
		
		when(studRepo.findAll()).thenReturn(list);
		assertEquals(2, studService.findStudentSize());
		
	}
	
	@DisplayName(value="test addWithCondition Method of the service it should add elements"
					+ "roll number is greater than 2000 else it should return a null value")
	@Test
	void testAddWithCondition() {
		
		Student stud = new Student(2001, "Rakesh");
		
		assertNotNull(studService.addWithCondition(stud));
		
	}
	
	@DisplayName(value="Test verifyAddWithCondition method with invoke the mock for StudentService")
	@Test
	void testVerifyAddWithCondition() {
		
		Student stud = new Student(2001, "Rakesh");
		
		serviceMock.addWithCondition(stud);
		
		verify(serviceMock,times(1)).addWithCondition(stud);
		
	}

}
