package com.jimprince99.foreach;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ForEachExample {

	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			myList.add(i);
		}
		
		Iterator<Integer> i = myList.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		
		System.out.println("foreach1");
		myList.forEach(System.out::print);
		
		System.out.println("\nforeach2");
		myList.forEach(x -> System.out.print(x));
		
		System.out.println("\nforeach3");
		myList.forEach(print);


	}
	
	static Consumer<Integer> print = (t) -> {
		System.out.println(t);
	};

}
