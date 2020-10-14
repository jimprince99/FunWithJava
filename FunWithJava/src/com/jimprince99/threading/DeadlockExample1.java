package com.jimprince99.threading;

public class DeadlockExample1 implements Runnable {
	
	@Override
	public void run() {
		
		synchronized(String.class) {
			System.out.println("locking on String class");
			
			synchronized(Integer.class) {
				System.out.println("locking on Integer class");
				try {
				Thread.sleep(2000);
				} catch (InterruptedException e) {
					
				}
			}
		}
		
	}
	
	

}
