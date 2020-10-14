package com.jimprince99.waitnotify;

public class SenderThread implements Runnable {
	
	Object myMonitor = null;
	
	SenderThread(Object myMonitor) {
		this.myMonitor = myMonitor;
	}
	
	public void run() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
		}
		
		synchronized(myMonitor) {
			myMonitor.notifyAll();
		}
	}

}
