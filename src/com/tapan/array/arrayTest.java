package com.tapan.array;

import java.util.Random;

public class arrayTest {

	Random random = new Random();

	public int[] uniqueRandomArray(int n) {

		int[] A = new int[n];

		for (int i = 0; i < A.length;) {
			
			int b = random.nextInt(6);

			if (f(A, b) == false) {
				A[i++] = b;
			}
		}
		return A;
	}

	public boolean f(int[] A, int n) {
		for (int i = 0; i < A.length; i++) {
			if (A[i] == n) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {

		arrayTest array = new arrayTest();
		int n = 5;
		int A[] = array.uniqueRandomArray(n);
		for (int i = 0; i < n; i++) {
			System.out.println(A[i]);
		}
	}
}
