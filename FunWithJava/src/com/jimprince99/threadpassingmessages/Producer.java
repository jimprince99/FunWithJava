package com.jimprince99.threadpassingmessages;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{
	
	BlockingQueue<String> queue = null;
	
	Producer(BlockingQueue<String> q) {
		this.queue = q;
	}
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				queue.put(Thread.currentThread().getName() + ":" + i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
	}



}
