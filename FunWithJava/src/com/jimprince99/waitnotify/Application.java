package com.jimprince99.waitnotify;

public class Application {

	public static void main(String[] args) {
		Object myMonitor = new Object();
		
		Thread sender = new Thread(new SenderThread(myMonitor));
		Thread waiter = new Thread(new WaiterThread(myMonitor));
		
		waiter.start();
		sender.start();
		
		try {
		waiter.join();
		} catch (InterruptedException e) {};
		
		try {
		sender.join();
		} catch (InterruptedException e) {};
		
		
		System.out.println("Complete");

		
		
		
		// TODO Auto-generated method stub

	}

}
