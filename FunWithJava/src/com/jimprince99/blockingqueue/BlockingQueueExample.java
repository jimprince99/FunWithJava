package com.jimprince99.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueExample {

	public static void main(String[] args) {
		
		BlockingQueue<String> queue = new ArrayBlockingQueue<>(10);
		
		BlockingQueueProducer p1 = new BlockingQueueProducer(queue);
		BlockingQueueProducer p2 = new BlockingQueueProducer(queue);
		BlockingQueueProducer p3 = new BlockingQueueProducer(queue);
		BlockingQueueProducer p4 = new BlockingQueueProducer(queue);
		BlockingQueueProducer p5 = new BlockingQueueProducer(queue);
		BlockingQueueProducer p6 = new BlockingQueueProducer(queue);
		BlockingQueueProducer p7 = new BlockingQueueProducer(queue);
		
		
		BlockingQueueConsumer c1 = new BlockingQueueConsumer(queue);
		BlockingQueueConsumer c2 = new BlockingQueueConsumer(queue);
		BlockingQueueConsumer c3 = new BlockingQueueConsumer(queue);
		BlockingQueueConsumer c4 = new BlockingQueueConsumer(queue);
		BlockingQueueConsumer c5 = new BlockingQueueConsumer(queue);
		BlockingQueueConsumer c6 = new BlockingQueueConsumer(queue);
		BlockingQueueConsumer c7 = new BlockingQueueConsumer(queue);
		
		
		Thread producerThread1 = new Thread(p1);
		Thread producerThread2 = new Thread(p2);
		Thread producerThread3 = new Thread(p3);
		Thread producerThread4 = new Thread(p4);
		Thread producerThread5 = new Thread(p5);
		Thread producerThread6 = new Thread(p6);
		Thread producerThread7 = new Thread(p7);
		Thread consumerThread1 = new Thread(c1);
		Thread consumerThread2 = new Thread(c2);
		Thread consumerThread3 = new Thread(c3);
		Thread consumerThread4 = new Thread(c4);
		Thread consumerThread5 = new Thread(c5);
		Thread consumerThread6 = new Thread(c6);
		Thread consumerThread7 = new Thread(c7);
		
		producerThread1.start();
		producerThread2.start();
		producerThread3.start();
		producerThread4.start();
		producerThread5.start();
		producerThread6.start();
		producerThread7.start();
		
		consumerThread1.start();
		consumerThread2.start();
		consumerThread3.start();
		consumerThread4.start();
		consumerThread5.start();
		consumerThread6.start();
		consumerThread7.start();

		try {
			producerThread1.join();
			producerThread2.join();
			producerThread3.join();
			producerThread4.join();
			producerThread5.join();
			producerThread6.join();
			producerThread7.join();

			consumerThread1.join();
			consumerThread2.join();
			consumerThread3.join();
			consumerThread4.join();
			consumerThread5.join();
			consumerThread6.join();
			consumerThread7.join();
		} catch (InterruptedException e) {
		}
		
		if (queue.size() == 0) {
			System.out.println("success");
		} else {
			System.out.println("fail");
		}
		
		// TODO Auto-generated method stub

	}

}
