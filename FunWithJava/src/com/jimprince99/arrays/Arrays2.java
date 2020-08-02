package com.jimprince99.arrays;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Arrays2 {

	public static void main(String[] args) {

		// technically, this is a stream, not an array
		Integer[] array = {1, 2, 3, 4, 5};
		Stream<Integer> s = Stream.of(array);
		s.forEach(n -> System.out.println(n));
		
		for (int i : array) {
			System.out.println(i);
		}
		
		// and the same for Strings
		String[] array2 = {"a", "b", "c" };
		
		Stream<String> s2 = Stream.of(array2);
		s2.forEach(n -> System.out.println(n));
		
		for (String x : array2) {
			System.out.println(x);
		}
		

		
		
	}

}
