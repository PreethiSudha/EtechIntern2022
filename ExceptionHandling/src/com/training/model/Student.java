package com.training.model;

import com.training.exception.RangeCheckException;

public class Student {

	private int rollNumber;
	private String firstName;
	private double markScored;
	
	public Student() {
		super();
	}

	public Student(int rollNumber, String firstName, double markScored) throws RangeCheckException
	{
		super();
		if(markScored<0) {
			throw new RangeCheckException("Marks should be Positive Integer[0-100]");
		}
		this.rollNumber = rollNumber;
		this.firstName = firstName;
		this.markScored = markScored;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public double getMarkScored() {
		return markScored;
	}

	public void setMarkScored(double markScored) {
		if(markScored<0) {
			try {
				throw new RangeCheckException("Marks should be Positive Integer[0-100]");
			} catch (RangeCheckException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			this.markScored = markScored;
		}
	}
	
	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + "]";
	}

	
}
