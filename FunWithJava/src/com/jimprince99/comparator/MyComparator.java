package com.jimprince99.comparator;

import java.util.Comparator;

public class MyComparator implements Comparator<Person> {

	@Override
	public int compare(Person p1, Person p2) {
		String name1 = p1.getFirstName() + " " + p1.getLastName();
		String name2 = p2.getFirstName() + " " + p2.getLastName();

		return name1.compareToIgnoreCase(name2);
	}

}
