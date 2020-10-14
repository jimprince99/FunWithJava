package recursion;

import java.util.List;

/**
 * find longest line in list
 * @author jpri1335
 *
 */
public class RecursionExample1 {
	
	public int getLongest(List<String> input) {
		
		// turn list to array
		
		String[] in = new String[input.size()];
		in = input.toArray(in);
		
		// check each line compared to last line
		int max = check(in, 0);
		
		System.out.println(max);
		return max;
		
	}
	
	public int check(String[] input, int currentPosition) {
		
		// exit condition
		if ((input == null) || (currentPosition >= input.length)) {
			return 0;
		}
		
		int nextSize = check(input, currentPosition + 1);
		
		int thisSize = input[currentPosition].length();
		System.out.println(input[currentPosition] + ", " + thisSize);
		if (thisSize > nextSize) {
			return thisSize;
		} else {
			return nextSize;
		}
		
	}
	
	

}
