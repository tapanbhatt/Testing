package com.tapan.array;

public class Test {

	static int[] arr = { 3, 6, 1, 8, 4, 5 };

	public static void main(String[] args) {
		for (int i = 0; i < arr.length; i++) {
			int min = i, temp;
			for (int j = i + 1; j < arr.length; j++) {
				System.out.println("i = " + arr[i] + " j = " + arr[j] + " min =" + min);
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			System.out.println("min = " + min);
			temp = arr[min];
			arr[min] = arr[i];
			arr[i]=temp;
		}

	}
}
