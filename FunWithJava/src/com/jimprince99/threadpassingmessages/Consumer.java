package com.jimprince99.threadpassingmessages;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class Consumer implements Runnable {
	
	BlockingQueue<String> queue = null;
	
	Consumer(BlockingQueue<String> q) {
		this.queue = q;
	}

	@Override
	public void run() {
		while (true) {
			String element = "";
			try {
				element = queue.poll(1000, TimeUnit.MILLISECONDS);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(element);
		}

		
	}
	
	

}
