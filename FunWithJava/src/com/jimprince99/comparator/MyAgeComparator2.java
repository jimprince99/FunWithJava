package com.jimprince99.comparator;

import java.util.Comparator;

public class MyAgeComparator2 implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		int age1 = o1.getAge();
		int age2 = o2.getAge();
		
		if (age1 == age2) return 0;
		
		if (age1 < age2) return 1;
		return -1;

	}
	
	

}
