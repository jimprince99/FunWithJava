package com.jimprince99.threadsandexceptions;

/**
 * the thread will die due to the exception
 * 
 * @author jpri1335
 *
 */
public class ThreadRunner {

	public static void main(String[] args) {
		
		ThreadWithException t = new ThreadWithException();
		
		Thread p = new Thread(t);
		
		p.start();
		
		try {
			p.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("End.");
		

	}

}
