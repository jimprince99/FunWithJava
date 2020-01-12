package com.jimprince99.lambda;

import java.util.ArrayList;
import java.util.List;

public class ForEach {

	public static void main(String[] args) {
		List<Integer> items = new ArrayList<>();
		items.add(1);
		items.add(2);
		items.add(3);
		items.add(4);
		
		items.forEach(System.out::println);
		
		// and 
		
		items.forEach(item -> System.out.println(item * item));
		
		// and for several lines of code
		items.forEach(bla -> {
			int x = bla;
			System.out.println("x=" + x);
		});
		
		
		

	}

}
