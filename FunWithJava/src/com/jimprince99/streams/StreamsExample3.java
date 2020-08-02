package com.jimprince99.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamsExample3 {

	public static void main(String[] args) {


		Stream.of("jim1", "jim2", "jim3")
		.sorted()
		.findFirst()
		.ifPresent(System.out::println);
		
		String[] names = {"jim1", "jim2", "jim3", "xjim1", "xjim2", "xjim3" };
		
		Arrays.stream(names)
		.filter(element -> element.startsWith("x"))
		.sorted()
		.forEach(System.out::println);

				
		Optional<String> name = 
		Arrays.stream(names)
		.filter(element -> element.startsWith("x"))
		.sorted()
		.findFirst();			
		System.out.println("name=" + name.get());
				
				
		List<String> names2 = Arrays.asList( "jim1", "jim2", "jim3" );
		
//		names2.stream()
//		.map( String::toLowerCase)
//		.filter( name -> name.startsWith("j"))
//		.forEach(naem -> System.out.println(name));
		
		
		
		
		
	}

}
