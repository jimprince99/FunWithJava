package com.jimprince99.threads;

public class SynchronizedCounter {

	private int counter = 0;
	
	public void increment() {
		setCounter(getCounter() +1);
	}
	
	public synchronized void increment2() {
		setCounter(getCounter() +1);
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}
	
	
	
	
	
}
