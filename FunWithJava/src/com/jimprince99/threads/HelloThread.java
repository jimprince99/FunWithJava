package com.jimprince99.threads;

public class HelloThread extends Thread {

	public static void main(String[] args) {
		(new HelloThread()).start();
	}
	
	@Override
	public void run()
	{
		System.out.println("Hello world. I am called " + Thread.currentThread().getName());
	}
}
