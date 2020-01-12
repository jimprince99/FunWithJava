package com.jimprince99.lambda;

import java.util.Arrays;

/*
 * Compare two strings by length using lamdba expression
 */
public class MyComparator {

	public static void main(String[] args) {
		String[] words = {"Bye", "Hi", "Adios", "Hola", "Aloha" };
		
		Arrays.sort(words,
				(s1, s2) -> Integer.compare(s1.length(), s2.length()));

		System.out.println((Arrays.deepToString(words)));
	}

}
