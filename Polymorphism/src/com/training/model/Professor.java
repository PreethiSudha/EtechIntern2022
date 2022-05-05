package com.training.model;

import com.training.ifaces.Conditional;

public class Professor implements Conditional {
	
	
	private String qualification;
	
	
	public Professor() {
		super();
		
	}
	
	public Professor(String qualification) {
		super();
		this.qualification = qualification;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	@Override
	public boolean test(Object value) {
		String strValue = (String)value;
		
		boolean result = false;
		if(strValue.toLowerCase().equals("chennai")){
			result = true;
			
		}
		return result;
	}

}
