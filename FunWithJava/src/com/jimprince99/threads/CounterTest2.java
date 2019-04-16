package com.jimprince99.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class CounterTest2 {

	public static void main(String[] args) throws InterruptedException {
		ExecutorService executor = Executors.newFixedThreadPool(3);
		SynchronizedCounter counter = new SynchronizedCounter();

		IntStream.range(0,1000)
		.forEach(count -> executor.submit(counter::increment2));
		// so here, the method does not need to be the Runnable method.

		executor.awaitTermination(1000, TimeUnit.MILLISECONDS);
		
		System.out.println("counter=" + counter.getCounter());
		executor.shutdown();
		executor.shutdownNow();
	}

}
