package com.training.model;

import com.training.ifaces.Conditional;

public class Principal implements Conditional {
	 
	private String CollegeName;
	
	
	public Principal() {
		super();
		
	}

	

	public Principal(String collegeName) {
		super();
		CollegeName = collegeName;
	}

	

	public String getCollegeName() {
		return CollegeName;
	}



	public void setCollegeName(String collegeName) {
		CollegeName = collegeName;
	}



	@Override
	public boolean test(Object value) {
		 String strCollegeName = (String)value;
		 
		 boolean result = false;
		 if(strCollegeName.toUpperCase().equals("MAHENDRA COLLEGE OF ENGINEERING")) {
			 return true;
		 }
		return result;
	}

}
