package com.tapan.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RandomTest {

	public static void main(String[] args) {

		int[] arr1 = { 1, 3, 2, 4, 5 };
		int[] arr2 = { 6, 7, 5, 9, 0 };

		arr2 = arr1;
		arr1 = arr2;

		

		/*for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == 5) {
				arr1[i] = 42;
				System.out.println("Change Value : " + arr1[i]);
			}
			System.out.println("arr1: " + arr1[i]);
		}

		System.out.println("===");

		for (int i = 0; i < arr2.length; i++) {
			System.out.println("arr2: " + arr2[i]);
		}*/

	}

}
