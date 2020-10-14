package com.jimprince99.waitnotify;

public class WaiterThread implements Runnable {
	Object myMonitor = null;
	
	WaiterThread(Object myMonitor) {
		this.myMonitor = myMonitor;
	}
	
	public void run() {
		synchronized(myMonitor) {
			try {
				myMonitor.wait();
			} catch (InterruptedException e) {
				
			}
		}
	}

}
