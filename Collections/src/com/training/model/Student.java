package com.training.model;

public class Student implements Comparable<Student>{

	private int rollNo;
	private String name;
	private int markScored;
	
	public Student() {
		super();
	}

	public Student(int rollNo, String name, int markScored) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.markScored = markScored;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarkScored() {
		return markScored;
	}

	public void setMarkScored(int markScored) {
		this.markScored = markScored;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + markScored;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + rollNo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (markScored != other.markScored)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (rollNo != other.rollNo)
			return false;
		return true;
	}

	@Override
	public int compareTo(Student otherObj) {
		return otherObj.name.compareTo(this.name);
	}

	@Override
	public String toString() {
		return "Student [getRollNo()=" + getRollNo() + ", "
				+ "getName()=" + getName() + ", getMarkScored()=" + getMarkScored() + "]";
	}
	
}
