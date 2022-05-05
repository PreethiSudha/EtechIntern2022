package com.example;

public class Fruits implements Comparable<Fruits>
{
	private String fruitName;

	public Fruits() {
		super();
	}

	public Fruits(String fruitName) {
		super();
		this.fruitName = fruitName;
	}

	public String getFruitName() {
		return fruitName;
	}

	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}

	@Override
	public String toString() {
		return  "[" + fruitName + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fruitName == null) ? 0 : fruitName.hashCode());
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
		Fruits other = (Fruits) obj;
		if (fruitName == null) {
			if (other.fruitName != null)
				return false;
		} else if (!fruitName.equals(other.fruitName))
			return false;
		return true;
	}

	@Override
	public int compareTo(Fruits obj) {
		
		return this.fruitName.compareTo(obj.fruitName);
	}
	
}









