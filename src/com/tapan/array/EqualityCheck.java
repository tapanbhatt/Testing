package com.tapan.array;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import com.tapan.jdbc.Employee;

public class EqualityCheck{

	
	public static void main(String[] args) {

		Employee emp1 = new Employee();
		emp1.setID(1);
	
		Employee emp2 = new Employee();
		emp1.setID(3);
	
		Employee emp3 = new Employee();
		emp1.setID(5);
	
		Employee emp4 = new Employee();
		emp1.setID(7);
	
		Employee emp5 = new Employee();
		emp1.setID(2);
	
		TreeMap<Employee, Integer> emp = new TreeMap<>();

		emp.put(emp1, 100);
		emp.put(emp2, 500);
		emp.put(emp3, 400);
		emp.put(emp4, 800);
		emp.put(emp5, 200);

		Set<Entry<Employee, Integer>> empset = emp.entrySet();
		
		System.out.println("No of elements in SET == "+empset.size());

		/*for (Entry<Employee, Integer> empEntry : empset) {
			
			System.out.println("Keys -----> " +empEntry.getKey().toString());
			
			System.out.println("Values -----> " +empEntry.getValue());
		}*/
		
		for(Entry<Employee,Integer> ent : emp.entrySet()){
			
			System.out.println("Keys -----> " +ent.getKey().toString());
			
			System.out.println("Values -----> " +ent.getValue());
		}

	}

}
