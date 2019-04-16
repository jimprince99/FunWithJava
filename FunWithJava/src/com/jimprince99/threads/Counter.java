package com.jimprince99.threads;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {

	private int counter = 0;
//	AtomicInteger counter = new AtomicInteger(0);
	
	public int get()
	{
		return counter;
	}
	
	public synchronized void increment() {
		counter++;
	}
	
//	public int get()
//	{
//		return counter.get();
//	}
//	
//	public synchronized void increment() {
//		counter.getAndIncrement();
//	}
	
}
