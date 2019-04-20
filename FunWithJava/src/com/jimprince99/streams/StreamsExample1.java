package com.jimprince99.streams;

import java.util.Iterator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsExample1 {

	public static void main(String[] args) {
		Stream<Integer> integerStream  = Stream.of(1,2,3,4,5,6,7,8,9);
		Stream<Integer> integerStream2 = Stream.of(1,2,3,4,5,6,7,8,9);

		integerStream.forEach(i -> System.out.print(i + " "));
		System.out.println("jim");

		Iterator<Integer> i = integerStream2.iterator();
		while (i.hasNext()) System.out.print(i.next() + " ");
		System.out.println("end");
		
		Integer[] integerArray = new Integer[] {1,2,3,4,5,6,7,8,9};
		Stream stream = Stream.of(integerArray);
		stream.forEach(x -> System.out.print(x + " "));
		System.out.println("end3");
		
		// Use a builder
		Stream.Builder<Integer> builder = Stream.builder();
		Stream<Integer> integerStream4 = builder.add(1)
				.add(2).add(3).build();
		integerStream4.forEach(x->System.out.print(x + " "));
		System.out.println("end4");
		
		// stream iterator
		Stream.iterate(1, x->x + 1)
		.limit(10)
		.forEach(x->System.out.print(x + " "));
		System.out.println("end5");

		IntStream.range(1,10).forEach(x->System.out.print(x + " "));
		System.out.println("end6");

		

		

	}

}
