package com.jimprince99.threads2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.Function;

public class Future1 {
	
	private ExecutorService executor = Executors.newSingleThreadExecutor();
	
	/*
	 * This one can't be Unit tested
	 */
	public Future<Integer> calculateSquare(Integer value) {
		return executor.submit(() -> {
				Thread.sleep(1000);
			return value * value;
		});
	}
	
	public Future<Integer> calculateSquare2(Integer value) {
		return executor.submit(() -> square.apply(value));
	} 
	
	/**
	 * function to square an integer
	 * This is used as a Callable, and passed to the executor
	 */
	Function<Integer, Integer> square = (Integer value) -> {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// Nothing to do here
		}
		return value * value;
	};

}
