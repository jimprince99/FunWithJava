package com.jimprince99.blockingqueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class BlockingQueueConsumer implements Runnable{
	
	BlockingQueue<String> queue = null;

	BlockingQueueConsumer(BlockingQueue<String> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {

		String name = null;
		for (int loop = 0; loop < 2; loop++) {
			try {
				name = queue.poll(100, TimeUnit.MILLISECONDS);
			} catch (InterruptedException e) {
			}
			System.out.println(name);
		}
		
	}
	
	

}
