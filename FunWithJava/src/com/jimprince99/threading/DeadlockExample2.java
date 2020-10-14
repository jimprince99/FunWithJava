package com.jimprince99.threading;

public class DeadlockExample2 implements Runnable {
	
	public void run() {
		synchronized(Integer.class) {
			System.out.println("locking on Integer class");
			
			synchronized(String.class) {
				System.out.println("locking on String class");
				
				try {
				Thread.sleep(2000);
				} catch (InterruptedException e) {
					
				}
			}
		}
	}

}
