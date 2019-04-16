package com.jimprince99.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UsingExecutors extends Thread {

	public static void main(String[] args) throws InterruptedException {
		ExecutorService executor = Executors.newSingleThreadExecutor();
		executor.execute(new UsingExecutors());
		Thread.sleep(1000);
		executor.shutdown();
		if (!executor.isTerminated())
		{
			executor.shutdownNow();
		}
	}

	@Override
	public void run()
	{
		System.out.println("Hello world, I am called " + Thread.currentThread().getName());
	}

}
