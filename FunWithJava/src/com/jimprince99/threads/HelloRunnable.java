package com.jimprince99.threads;

public class HelloRunnable implements Runnable {

	public static void main(String[] args) {
		new Thread(new HelloRunnable()).start();
	}

	@Override
	public void run() {
		System.out.println("Hello World");
	}

}
