package com.jimprince99.threads2;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class UsingFuture1 {

	public static void main(String[] args) {
		
		Future<Integer> example1 = new Future1().calculateSquare2(7);
		
		while (!example1.isDone()) {
			System.out.println("Waiting");
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		Integer result = 0;
		try {
			result = example1.get();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("result=" + result);
		
		/*
		 *  and with a timeout
		 */
		System.out.println("Now with a wait");
		Future<Integer> example2 = new Future1().calculateSquare2(8);
		
		try {
			result = example2.get(1500, TimeUnit.MILLISECONDS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TimeoutException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("result=" + result);
		

	}

}
