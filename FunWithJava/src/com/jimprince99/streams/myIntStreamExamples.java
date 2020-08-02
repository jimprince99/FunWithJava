package com.jimprince99.streams;

import java.util.Arrays;
import java.util.stream.IntStream;

public class myIntStreamExamples {

	public static void main(String[] args) {
		
		IntStream.range(1,10)
		.forEach(System.out::print);
		System.out.println();


		IntStream.range(1,10)
		.skip(5)
		.forEach(x -> System.out.print(x + " "));
		System.out.println();

		int total = IntStream.range(1,  10)
				.sum();
		System.out.println("total=" + total);
			
		
		int[] numbers = {1,2,3,4,5};
		Arrays.stream(numbers)
		.map(x -> x * x)
		.average()
		.ifPresent(System.out::println);
		
		
		
		
		
		
	}

}
