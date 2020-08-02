package com.jimprince99.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamsExample2 {

	public static void main(String[] args) {

		StreamsExample2 example2 = new StreamsExample2();
		System.out.println("");
		example2.intermediateOperations();

		System.out.println("reduce examples");
		example2.reduceExamples();

		System.out.println("Optional examples");
		example2.orElseExample();
		
		System.out.println("Collect examples");
		example2.collectExamples();

	}

	/**
	 * example of creating streams in different ways.
	 */
	public void StreamCreation() {
		// an empty stream
		Stream<String> stream1 = Stream.empty();

		// Create a stream from an array
		Collection<String> c = Arrays.asList("a", "b", "c");
		Stream<String> stream2 = c.stream();

		// Stream from objects
		Stream<String> stream3 = Stream.of("a", "b", "c");

		// Stream from array again
		String[] a = new String[] { "a", "b", "c" };
		Stream<String> stream4 = Arrays.stream(a);

		// Stream from builder
		Stream<String> stream5 = Stream.<String>builder().add("a").add("b").add("c").build();

		// stream from loop
		Stream<String> stream6 = Stream.generate(() -> "element").limit(10);

		// Stream with iterate
		Stream<Integer> stream7 = Stream.iterate(10, n -> n + 2);

		// create an integer stream
		IntStream is = IntStream.range(1, 3);

		LongStream ls = LongStream.range(1, 100);

		IntStream stream8 = "abc".chars();
	}

	/**
	 * example of using loops with streams
	 */
	public void loopingWithStreams() {

	}

	/**
	 * example of intermediate operations
	 */
	public void intermediateOperations() {

		System.out.println("map example");
		Stream<String> stream1 = Stream.of("a", "b", "c");
		stream1.map(element -> element + "1").map(element -> element + "2")
				.forEach(element -> System.out.println(element));

		System.out.println("skip example");
		Stream<String> stream2 = Stream.of("a", "b", "c");
		stream2.map(element -> element + "1").map(element -> element + "2").skip(1)
				.forEach(element -> System.out.println(element));

		System.out.println("skip example");
		Stream<String> stream3 = Stream.of("a", "b", "c");
		stream3.skip(1).forEach(element -> System.out.println(element));

		// get first output element
		Stream<String> stream4 = Stream.of("a", "b", "c");
		;

		String result = stream4.map(element -> element + "1").map(element -> element + "2").findFirst().get();

		System.out.println("result=" + result);

	}

	/*
	 * reduce examples
	 */
	public void reduceExamples() {

		// sum the elements, print the total
		OptionalInt reduce = IntStream.range(1, 4).reduce((a, b) -> a + b);
		System.out.println("output1 = " + reduce.getAsInt());

		// reduce with starting value
		// note: we return an int this time
		int reduce2 = IntStream.range(1, 4).reduce(10, (a, b) -> (a + b));
		System.out.println("reduce2 = " + reduce2);

		// reduce with complex statement
		// identity = 10
		// accumulator = a+b
		// the combiner part is not called as this is not parallel
		int reduce3 = Stream.of(1, 2, 3).reduce(10, (a, b) -> a + b, (a, b) -> {
			System.out.println("hello");
			return a + b;
		});
		System.out.println("reduce3 = " + reduce3);

		// reduce with parallel running
		int reduce4 = Arrays.asList(1, 2, 3).parallelStream().reduce(10, (a, b) -> a + b, (a, b) -> {
			System.out.println("hello, a=" + a + ", b=" + b);
			return a + b;
		});
		System.out.println("reduce4 = " + reduce4);

		
		
	}
	
	/*
	 * examples of using collector
	 * with these we can turn a stream into a list.
	 */
	public void collectExamples() {
		List<Product> products = Arrays.asList(new Product("apple", 10), new Product("orange", 20));
		
		Stream<Product> p = products.stream();
		
		List<String> productNames = p
				.map(Product::getName)
				.collect( Collectors.toList());
		// so we have now converted a stream back to a collection using toList()
		
		for (String name : productNames) {
			System.out.println(name);
		}
		
		// Now lets convert to a single value
		Stream<Product> p2 = products.stream();
		String names = p2
				.map(Product::getName)
				.collect(Collectors.joining(", "));
		
		System.out.println("Names=" + names);
		
		// so Collect can take lots of Collector type methods.
		
		Stream<Product> p3 = products.stream();
		IntSummaryStatistics total = p3
				.collect(Collectors.summarizingInt(Product::getPrice));
		System.out.println("Total p3 = " + total.getSum());
							
				
		
	}

	/*
	 * should move these to a separate class for Optional examples.
	 */
	public void orElseExample() {

		// declare an empty variable
		Optional<String> o1 = Optional.empty();
		System.out.println(o1.orElse("empty"));

		// assign a value to it.
		o1 = Optional.of("jim");
		System.out.println(o1.orElse("empty"));

	}

}
