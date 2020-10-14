package com.jimprince99.threadsandexceptions;

public class ThreadWithException implements Runnable {

	@Override
	public void run() {
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		int x = 0;
		
		int y = 9/x;
				
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		
		
		
		
	}

}
