package com.jimprince99.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class MyPredicates {
	
	public static void main(String args[]) {
		String test1 = null;
		
		if (isSet.test(test1))
		{
			System.out.println("string is defined");
		} else {
			System.out.println("string is not defined");
		}
		
		List<String> strings = new ArrayList<String>();
		strings.add("one");
		strings.add("two");
		strings.add("three");
		strings.add("four");
		
		// sort strings based on a compare of their lengths
		Collections.sort(strings, c);
		System.out.println(strings);
		
		
		
	}
	
    static Predicate<String> isSet = s -> (s != null && s != "");
    
    static Comparator<String> c = (s1, s2) ->
        Integer.compare(s1.length(), s2.length());
    
	

}
