package org.example.model;

public class Professor {

	public String Qualification;

	public Professor() {
		super();
	}

	public Professor(String qualification) {
		super();
		Qualification = qualification;
	}

	public String getQualification() {
		return Qualification;
	}

	public void setQualification(String qualification) {
		Qualification = qualification;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Qualification == null) ? 0 : Qualification.hashCode());
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
		Professor other = (Professor) obj;
		if (Qualification == null) {
			if (other.Qualification != null)
				return false;
		} else if (!Qualification.equals(other.Qualification))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Professor [Qualification=" + Qualification + "]";
	}
	
}
