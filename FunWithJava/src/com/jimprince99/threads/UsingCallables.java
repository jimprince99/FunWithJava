package com.jimprince99.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class UsingCallables {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executor = Executors.newSingleThreadExecutor();
		CallableInteger callableInteger = new CallableInteger(123);
		Future<Integer> result = executor.submit(callableInteger);
		System.out.println("x=" + result.get());
		result.isDone();
		System.out.println("isDone=" + result.isDone());
		System.out.println("x=" + result.get());
		executor.shutdownNow();
	}

}

class CallableInteger implements Callable<Integer> {
	int x = 0;
	
	CallableInteger(int x) {
		this.x = x;
	}

	@Override
	public Integer call()  {
		
		try {
			TimeUnit.SECONDS.sleep(1);
			return x;
		} catch (InterruptedException e) {
			throw new IllegalStateException("task interrupted", e);
		}
	}
}
