package com.tapan.array;

public class Table {

	public static void main(String[] args) {

		// int[] arr = { 1, 2, 3, 4 };
		// System.out.println("Elements of array = " + arr);
		// Output - [I@139a55 - [ stands for array, I stands for integer
		// @139a55 stands for memory address of array

		// Encapsulation & Generalization

		// Direct into main method

		/*
		 * int i = 1; while (i <= 6) { System.out.printf("%4d", 2 * i); i = i +
		 * 1; } System.out.println();
		 */

		// Print row method call once for each number
		// printRow();
		// printRow1(4); // Print row with

		// printRow method needs to call multiple times to print table
		/*int i = 1;
		while (i < 6) {
			printRow1(i);
			i = i + 1;
		}
		System.out.println();*/
		//printTable();
		printTable3(10); 
	}

	// Convert it into method ( encapsulation )

	private static void printRow() {
		int i = 1;
		while (i <= 6) {
			System.out.printf("%4d", 2 * i);
			i = i + 1;
		}
		System.out.println();
	}

	// replace the constant value, 2, with a parameter, n ( Generalization)

	private static void printRow1(int n) {
		int i = 1;
		while (i <= 6) {
			System.out.printf("%4d", n * i);
			i = i + 1;
		}
		System.out.println();
	}

// Print table with no of col pass
	
	private static void printRow2(int n, int col) {
		int i = 1;
		while (i <= col) {
			System.out.printf("%4d", n * i);
			i = i + 1;
		}
		System.out.println();
	}
	
	// Printing the table 
	private static void printTable() {
		int i = 1;
		while (i < 6) {
			printRow1(i);
			i = i + 1;
		}
		System.out.println();
	}
	
	
// The previous version of printTable always displays 6 rows. We can generalize it by replacing the literal 6 with a parameter:
	private static void printTable1(int row) {
		int i = 1;
		while (i < row) {
			printRow1(i);
			i = i + 1;
		}
		System.out.println();
	}
	
	// Printing the table with number of columns
			private static void printTable2(int rows) {
				int i = 1;
				while (i < rows) {
					printRow2(i,rows);
					i = i + 1;
				}
				System.out.println();
			}
			
			// Printing the table with non repeating rows and column
						private static void printTable3(int rows) {
							int i = 1;
							while (i < rows) {
								printRow2(i,i);
								i = i + 1;
							}
							System.out.println();
						}
}
