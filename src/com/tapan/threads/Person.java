package com.tapan.threads;

public class Person implements Runnable {

	@Override
	public void run() {
		System.out.println("Running");
	}

}
