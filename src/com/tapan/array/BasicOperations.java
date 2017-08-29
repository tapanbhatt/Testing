package com.tapan.array;

import java.util.Random;

public class BasicOperations {

	public Random random = new Random();

	public static int[] intArray = { 20, 50, 10, 40, 60 };

	public static char[] charArray = { 'B', 'A', 'H', 'S', 'K', 'H', 'B' };

	public static String[] strArray = { "banana", "orange", "kiwi", "apple" };

	public static char[] numArray = { '8', '5', '2', '1', '4' };

	public static String[] numStringArray = { "111453", "123", "1134", "1" };

	// Sorting elements:
	private static char[] Sorting() {
		System.out.println("Length of CharArray ===> " + numArray.length);
		for (int i = 0; i < numArray.length; i++) {
			for (int j = i + 1; j < numArray.length; j++) {
				if (numArray[i] > numArray[j]) {
					char temp = numArray[j];
					numArray[j] = numArray[i];
					numArray[i] = temp;
				}

			}

		}
		return numArray;
	}

	// Sorting string array in asceding order if compare to > 0
	private static String[] sortingStringArray() {

		System.out.println("Length of strArray ===> " + numStringArray.length);

		for (int i = 0; i < numStringArray.length; i++) {
			for (int j = i + 1; j < numStringArray.length; j++) {
				if ((numStringArray[i].compareTo(numStringArray[j]) > 0)) {
					String temp = numStringArray[j];
					numStringArray[j] = numStringArray[i];
					numStringArray[i] = temp;
				}

			}

		}
		return numStringArray;
	}

	// Find Duplicate element:
	private static void duplicateElement() {

		int count = 0;
		System.out.println("Length of CharArray ===> " + charArray.length);

		for (int i = 0; i < charArray.length; i++) {
			for (int j = 0; j < charArray.length; j++) {
				if (charArray[i] == charArray[j] && i != j) {
					count++;
					System.out.println("Element" + charArray[i] + "   " + "appears" + "  " + count + "times");
				}
			}

		}

	}

	// Copy array values from one to anther:sortingStringArray

	public static char[] copyArray() {
		char[] newArray = new char[charArray.length];
		sortingStringArray();
		for (int i = 0; i < charArray.length; i++) {
			newArray[i] = charArray[i];
		}
		return newArray;
	}

	// Insert 10 Unique Random number in array

	public static int[] uniqueArray() {
		int[] arr = new int[5];
		Random random = new Random();
		for (int i = 0; i < arr.length;) {
			int num = random.nextInt(10);
			if (!isPresent(arr, num)) {
				arr[i] = num;
				i++;
			}
		}

		return arr;

	}

	public static boolean isPresent(int[] arr, int num) {
		for (int i = 0; i < arr.length;i++) {
			if (num == arr[i]) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {

		int[] newArray = uniqueArray();

		for (int i = 0; i < newArray.length; i++) {

			System.out.println("Elements: " + newArray[i]);
		}

	}

}
