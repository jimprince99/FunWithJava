package com.jimprince99.puzzles;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArraySort {

	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		int k = Integer.parseInt(in.nextLine());
		
		String[] output = readArray();
		Arrays.sort(output, Collections.reverseOrder());
		
		Arrays.stream(output).limit(3).forEach(c -> System.out.println(c + " "));
	}
	
	static String[] readArray() {
		String input = in.nextLine();
		String input2[] = input.split("[\\s]+");		
		
		return input2;
	}

}
