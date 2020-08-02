package com.jimprince99.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/* 
 * This is a merge of the Map and the Flatten operations
 * [{a,b,c}, {d,e,f,g}, {h,i}]
 * ->
 * [{a,b,c,d,e,f,g,h,i}]
 */
public class MyFlatMapExample1 {
	private List<String> list1;
	private List<String> list2;
	private List<String> list3;
	private List<String> list4;
	
	// This is the flatMap
	List<List<String>> flatMapExample;

	public static void main(String[] args) {
		
		MyFlatMapExample1 flatMap1 = new MyFlatMapExample1();
		
		
		flatMap1.test1();
		flatMap1.test2();
		flatMap1.test3();
		flatMap1.test4();

	}

	public MyFlatMapExample1() {
		
		list1 = Arrays.asList("one", "two", "Three", "four");
		list2 = Arrays.asList("eleven", "twelve", "thirteen", "fourteen");
		list3 = Arrays.asList("twentyone", "twentytwo", "twentythree", "twentyfour");
		list4 = Arrays.asList("thirtyone", "thirtytwo", "thirtythree", "thirtyfour");
		
		flatMapExample = new ArrayList<List<String>>();
		
		flatMapExample.add(list1);
		flatMapExample.add(list2);
		flatMapExample.add(list3);
		flatMapExample.add(list4);
	}
	
	/**
	 * not using Streams
	 */
	private void test1() {
		
		List<String> tempList = new ArrayList<String>();
		
		for (List<String> list : flatMapExample) {
			for (String element : list) {
				tempList.add(element);
			}
		}
		
		System.out.println("test1=" + tempList.toString());
	}
	
	/**
	 * using one stream
	 */
	private void test2() {
	
		List<String> tempList = new ArrayList<String>();
		
		for (List<String> list : flatMapExample) {
			list.stream()
		    .forEach(element -> tempList.add(element));
		}
		System.out.println("test2=" + tempList.toString());
	}
	
	/**
	 * using two streams
	 */
	private void test3() {

		List<String> tempList = new ArrayList<String>();

		flatMapExample.stream()
		   .forEach(element -> element.stream().forEach(e -> tempList.add(e)));
		System.out.println("test3=" + tempList.toString());
	}
	
	/**
	 * using flatmap
	 */
	private void test4() {
		
		List<String> tempList;

		tempList = flatMapExample.stream()
				.flatMap(element -> element.stream()).collect(Collectors.toList());
		System.out.println("test3=" + tempList.toString());

	}
	
	
	
//	Function<List<String>, String> unpackList = element -> {
//		StringBuffer tmpList = new StringBuffer();
//		element.stream()
//		.forEach(e -> tmpList.append(e));
//		return tmpList.toString();
//	}

}
