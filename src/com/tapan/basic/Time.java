package com.tapan.basic;

import com.tapan.opps.Person;

public class Time {

	private int hour;
	private int min;
	private double sec;
	private Person person;

	public Time() {
		this.hour = 0;
		this.min = 0;
		this.sec = 0.0;
		this.person = new Person();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + hour;
		result = prime * result + min;
		result = prime * result + ((person == null) ? 0 : person.hashCode());
		long temp;
		temp = Double.doubleToLongBits(sec);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Time other = (Time) obj;
		if (hour != other.hour)
			return false;
		if (min != other.min)
			return false;
		if (person == null) {
			if (other.person != null)
				return false;
		} else if (!person.equals(other.person))
			return false;
		if (Double.doubleToLongBits(sec) != Double.doubleToLongBits(other.sec))
			return false;
		return true;
	}

	public static void main(String[] args) {
		
		Person person1 = new Person();
		Person person2 = new Person();
		
		person2 = null;
		
		System.out.println(person1.equals(person2));
		
		
	}

	 
}
