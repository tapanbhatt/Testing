package com.tapan.array;

public class Sorting {

	private static int[] arr = { 3, 6, 1, 8, 4, 5 };

	public static int[] selectionSort() {

		  for (int i = 0; i < arr.length - 1; i++)  
	        {  
	            int index = i;  
	            for (int j = i + 1; j < arr.length; j++){  
	                if (arr[j] < arr[index]){  
	                    index = j;//searching for lowest index  
	                }  
	            }  
	            System.out.println("index = "+index);
	            int smallerNumber = arr[index];   
	            arr[index] = arr[i];  
	            arr[i] = smallerNumber;  
	        } 
		  printArray();
		  return arr;
	}

	public static void printArray() {
		for (int i = 0; i < arr.length - 1; i++) {
			System.out.println("ELements = " + arr[i]);
		}
	}

	public static void main(String[] args) {

		Sorting sorting = new Sorting();
		sorting.selectionSort();
	}
}
