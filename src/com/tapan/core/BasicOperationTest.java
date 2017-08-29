package com.tapan.core;

import com.tapan.array.BasicOperations;

public class BasicOperationTest {

	// Calling main method in another method
	public void OperationTest() {

	      // Call the main() method of MyClass
	      String[] arguments = new String[] {"123"};
	      BasicOperations.main(arguments);
	    }
	
	//Calling main method inside one main method:
	public static void main(String[] args) {
		
		String[] arguments = new String[] {"123"};
	      BasicOperations.main(arguments);
	}
	
	
	
	
	
	
}
