package com.tapan.exception;

public class ExceptionTest {

	public static void resize(int[] arr) {
		System.out.println(arr.length);
		int[] old = arr;
		arr = new int[old.length * 2 + 1];
		System.out.println("AFTER " +arr.length);
		for (int i = 0; i < old.length; i++)
			arr[i] = old[i];
	}

	public static void main(String[] args) {

		int[] arr = new int[]{1,2,3,4,5};
		 
		resize(arr);
		
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}
}
