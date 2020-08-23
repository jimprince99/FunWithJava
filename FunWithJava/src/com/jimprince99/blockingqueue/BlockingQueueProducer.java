package com.jimprince99.blockingqueue;

import java.util.concurrent.BlockingQueue;

public class BlockingQueueProducer implements Runnable {
	
	BlockingQueue<String> queue = null;
	
	BlockingQueueProducer(BlockingQueue<String> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		
		for (int loop=1; loop <= 2; loop++) {
			queue.add(Thread.currentThread().getName());
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			
			}
		}
		
	}

}
