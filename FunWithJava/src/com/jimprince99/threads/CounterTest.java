package com.jimprince99.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CounterTest {

	public static void main(String[] args) {
		ExecutorService executor = null;
		Counter counter = new Counter();
		
		executor = Executors.newFixedThreadPool(2);
		
		Runnable task1 = () -> {
			for (int i =0; i < 2000000; i++) {
				counter.increment();
				Thread.yield();
			}
		};
		
		Runnable task2 = () -> {
			for (int i =0; i < 8000000; i++) {
				counter.increment();
				Thread.yield();
			}
		};
		
		executor.submit(task1);
		executor.submit(task2);
				
		try {
			executor.awaitTermination(10, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println((counter.get()));
		executor.shutdown();
		executor.shutdownNow();
		
	}

}
