package com.jimprince99.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UsePersons {
	
	public List<Person> getOrderedList() {
		
		Person p5 = new Person("aaa", "AAA", 10, 1);
		Person p4 = new Person("bbb", "BBB", 10, 1);
		Person p3 = new Person("ccc", "CCC", 10, 1);
		Person p2 = new Person("ddd", "DDD", 10, 1);
		Person p1 = new Person("eee", "EEE", 10, 1);
		
		List<Person> people = new ArrayList<>();
		
		people.add(p1);
		people.add(p2);
		people.add(p3);
		people.add(p4);
		people.add(p5);
		
		Collections.sort(people);
		
		return people;
		
	}
	
	public List<Person> getOrderedList1() {
		Person p5 = new Person("aaa", "AAA", 10, 1);
		Person p4 = new Person("bbb", "BBB", 10, 1);
		Person p3 = new Person("ccc", "CCC", 10, 1);
		Person p2 = new Person("ddd", "DDD", 10, 1);
		Person p1 = new Person("eee", "EEE", 10, 1);
		
		List<Person> people = new ArrayList<>();
		
		people.add(p1);
		people.add(p2);
		people.add(p3);
		people.add(p4);
		people.add(p5);
		
		Collections.sort(people, new MyComparator());
		
		return people;
	}
	
	public List<Person> getOrderedList3() {
		Person p5 = new Person("aaa", "AAA", 10, 1);
		Person p4 = new Person("bbb", "BBB", 20, 1);
		Person p3 = new Person("ccc", "CCC", 30, 1);
		Person p2 = new Person("ddd", "DDD", 40, 1);
		Person p1 = new Person("eee", "EEE", 50, 1);
		
		List<Person> people = new ArrayList<>();
		
		people.add(p1);
		people.add(p2);
		people.add(p3);
		people.add(p4);
		people.add(p5);
		
		Collections.sort(people, new MyAgeComparator2());
		return people;
	}

}
