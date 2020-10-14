package com.jimprince99.threading;

public class Runner {

	public static void main(String[] args) {
		
		DeadlockExample1 dl1 = new DeadlockExample1();
		DeadlockExample2 dl2 = new DeadlockExample2();
		
		Thread t1 = new Thread(dl1);
		Thread t2 = new Thread(dl2);
		
		t1.start();
		t2.start();
		
		System.out.println("complete");


		
	}

}
