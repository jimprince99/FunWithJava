package com.jimprince99.primenumbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SieveOfEratosthenes {

	public List<Integer> calculate(int n) {
		boolean[] isPrime = new boolean[n + 1];

		Arrays.fill(isPrime, true);

		// for each number to process
		for (int p = 2; p * p < n; p++) {

			// for each element in the list
			for (int loop = p * 2; loop < n; loop += p) {
				if (isPrime[loop]) {
					isPrime[loop] = false;
				}

			}
		}

		List<Integer> results = new ArrayList<>();
		
		for (int i = 1; i<n; i++) {
			if (isPrime[i]) {
				results.add(i);
			}
		}
		
		return results;
		
	}

}
