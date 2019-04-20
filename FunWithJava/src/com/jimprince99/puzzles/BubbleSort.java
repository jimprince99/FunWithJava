package com.jimprince99.puzzles;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {

		int k = Integer.parseInt(in.nextLine());
		
		int[] myArray = readArray();
		
		boolean updated = true;
		while (updated) {
			updated = false;

			for (int loop = 0; loop < myArray.length - 1; loop++) {
				if (myArray[loop] > myArray[loop + 1]) {
					//System.out.println(" " + myArray[loop] + "->" + myArray[loop + 1]);
					int tmp = myArray[loop];
					myArray[loop] = myArray[loop + 1];
					myArray[loop + 1] = tmp;
					updated = true;
				}
			}
		}
		
		for (int loop = 0; loop < k; loop++) {
			System.out.print(myArray[loop] + " ");
		}
	}
	
	static int[] readArray() {
		int[] output ;
		
		String input = in.nextLine();
		
		if (input != null && input != "") {
			String[] stringInput = input.split("[\\s]+");
			output = new int[stringInput.length];
			
			for (int loop = 0; loop < stringInput.length; loop++)
			{
				output[loop] = Integer.parseInt(stringInput[loop]);
			}
			
			return output;
		}
		return new int[1];
			
	}

}
