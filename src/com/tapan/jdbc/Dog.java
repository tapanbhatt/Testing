package com.tapan.jdbc;

public class Dog implements Comparable<Dog> {

	String color;
	int size;

	Dog(String c, int s) {
		color = c;
		size = s;
	}

	public String toString() {
		return color + " dog";
	}

	@Override
	public int compareTo(Dog o) {
		return o.size - this.size;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + size;
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
		Dog other = (Dog) obj;
		if (size != other.size)
			return false;
		return true;
	}

	 
	
	

}
