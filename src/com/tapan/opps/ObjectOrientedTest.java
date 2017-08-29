package com.tapan.opps;

import java.net.URL;
import java.net.URLClassLoader;

public class ObjectOrientedTest{
	
	

	public static void main(String[] args) throws CloneNotSupportedException {

		Person person1 = new Person();
		Person person2 = new Person();
		person2=person1;
		
		/*System.out.println("Object person1 = " + person1);
		System.out.println("Object person2 = " + person2);
		
		System.out.println("Object1 hashCode = " + person1.hashCode());
		System.out.println("Object2 hashCode = " + person2.hashCode());
		
		System.out.println("Object1 equals Object2 = " + person1.equals(person2));
		System.out.println("Object2 equals Object1 = " + person2.equals(person1));
		
		System.out.println("Object1 toString = " + person1.toString());
		System.out.println("Object2 toString = " + person2.toString());
		
		System.out.println("Object1 Clone = " + person1.clone().hashCode());
		
		Object obj1 = person1.clone();
		System.out.println("obj1 Clone hashCode = " + obj1.hashCode());
		
		Object obj2 = person2.clone();
		System.out.println("obj2 Clone hashCode = " + obj2.hashCode());
		
		System.out.println("Object getCount = " + Person.getCount() );*/
		
		person1.setName("Tapan");
		//person2 = null;
		URL[] classLoader = ((URLClassLoader)Person.class.getClassLoader()).getURLs();
		for (int i = 0; i < classLoader.length; i++) {
			System.out.println("URL = "+classLoader[i]);	
		}
		
		System.out.println("Object1 equals Object2 = " + person1.equals(person2));
		System.out.println("person 2 hashCode = "+person1.hashCode());
		System.out.println("person 2 hashCode = "+person2.hashCode());
		
		
	}
}
