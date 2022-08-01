package org.example.dummy;

import org.example.ifaces.ProfessorRepository;

public class DummyProfessorRepository implements ProfessorRepository{

	@Override
	public String Qualification() {
		throw new AssertionError("This is a dummy method for testing");
	}

}

