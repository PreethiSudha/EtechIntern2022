package org.example.stud.service;



import org.example.model.Student;
import org.example.repos.StudRepository;

public class StudService {
	
	private StudRepository studRep;

	public StudService(StudRepository studRep) {
		super();
		this.studRep = studRep;
	}
	
	//simple and correct method too
	public Student getById(int id) {
		int found = id;
		if(id==found) {
			return this.studRep.getById(id);
		}
			return null;
	}
	
	public Student findById(int id) {
		Student found = this.studRep.getById(2020);
		found.setRollNumber(5600);
		return found;
	}
	
	public Student deleteById(int id) {
		Object found = null;
		if(found==null) {
			this.studRep.deleteById(id);
			found = id;
		}
			return null;
	}

}