package com.jimprince99.synchronizedwait;

public class consumer<T> implements Runnable{

	MySynchronisedWaitQueue<T> queue;
	
	consumer(MySynchronisedWaitQueue<T> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {

		System.out.println("into run ");
		for (int loop = 0; loop < 10; loop++) {
			T value = queue.remove();
			System.out.println("read (" + loop + "): " + value);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			}
			System.out.println("end!");
		}
	}
}
