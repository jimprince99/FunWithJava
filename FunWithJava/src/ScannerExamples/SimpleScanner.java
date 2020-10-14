package ScannerExamples;

import java.util.Scanner;

public class SimpleScanner {

	public static void main(String[] args) {
		
		System.out.println("Input a string");
		Scanner s = new Scanner(System.in);
		
		String input = s.nextLine();
		
		System.out.println("Read " + input);

	}

}
