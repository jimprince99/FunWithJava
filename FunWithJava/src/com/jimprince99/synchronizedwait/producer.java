package com.jimprince99.synchronizedwait;

public class producer<T> implements Runnable{
	
	MySynchronisedWaitQueue<T> queue;
	T value;

	//MySynchronisedWaitQueue<String> queue = new MySynchronisedWaitQueue<>(10);
	
	producer(MySynchronisedWaitQueue<T> queue, T value) {
		this.queue = queue;
		this.value = value;
	}
	
	@Override
	public void run() {
		for (int loop=0; loop < 10; loop++) {
			queue.put(value);
			System.out.println("write (" + loop + "): " + value);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			}
		}

	}

}
