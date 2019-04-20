package com.jimprince99.puzzles;

import java.util.Scanner;

/**
 * Given an array of integers, write a function that returns true if there is a
 * triplet (a, b, c) that satisfies a2 + b2 = c2.
 * 
 * Input: The first line contains T, denoting the number of testcases. Then
 * follows description of testcases. Each case begins with a single positive
 * integer N denoting the size of array. The second line contains the N space
 * separated positive integers denoting the elements of array A.
 * 
 * Output: For each testcase, print "Yes" or "No" whether it is Pythagorean
 * Triplet or not (without quotes).
 * 
 * Constraints: 1 <= T <= 100 1 <= N <= 107 1 <= A[i] <= 1000
 * 
 * Example: Input: 1 5 3 2 4 6 5
 * 
 * Output: Yes
 * 
 * @author jpri1335
 *
 */
public class PythagoreanTriplet {

	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		// read in number of input strings
		int numberOfTests = getNumberOfTests();

		// loop number of input strings
		for (int i = 0; i < numberOfTests; i++) {
			int[] triplets = readArguments();

			checkValues(triplets);
		}
		System.out.println("NO");
	}

	/**
	 * loop round each set of value and check for matches
	 * 
	 * @param triplets
	 */
	protected static void checkValues(int[] triplets) {
		if (triplets.length < 3) {
			System.out.println("No");
			return;
		}

		for (int loop = 0; loop < triplets.length - 2; loop++) {
			for (int loop2 = 1; loop2 < triplets.length - 1; loop2++) {
				for (int loop3 = 2; loop3 < triplets.length; loop3++) {
					if (match(triplets[loop], triplets[loop2], triplets[loop3])) {
						System.out.println("YES");
						System.exit(0);
					}
				}
			}
		}
	}

	protected static boolean match(int x, int y, int z) {
		System.out.println("checking " + x + ", " + y + ", " + z);
		if (x * x + y * y == z * z)
			return true;
		if (z * z + y * y == x * x)
			return true;
		if (x * x + z * z == y * y)
			return true;
		return false;
	}

	protected static int getNumberOfTests() {
		String x = in.nextLine();
		return Integer.parseInt(x);
	}

	protected static int[] readArguments() {
		String x = in.nextLine();
		String y = in.nextLine();

		int sizeOfArray = Integer.parseInt(x);

		String tripletsArray[];
		tripletsArray = y.split("[\\s]+");

		int tripletsIntsArray[] = new int[tripletsArray.length];

		for (int loop = 0; loop < sizeOfArray; loop++) {
			tripletsIntsArray[loop] = Integer.parseInt(tripletsArray[loop]);
		}
		return tripletsIntsArray;
	}
}
