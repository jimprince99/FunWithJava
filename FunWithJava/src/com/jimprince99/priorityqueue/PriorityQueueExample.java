package com.jimprince99.priorityqueue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

import java.util.*;

/**
 * how to implement a priority queue
 * 
 * @param args
 */
public class PriorityQueueExample {

	public static void main(String[] args) {

		Comparator<Employee> age = new AgeComparator();
		Queue<Employee> q = new PriorityQueue<>(age);

		q.offer(new Employee(10, "jim", 1));
		q.offer(new Employee(16, "jim", 7));
		q.offer(new Employee(11, "jim", 2));
		q.offer(new Employee(12, "jim", 3));
		q.offer(new Employee(13, "jim", 4));
		q.offer(new Employee(14, "jim", 5));
		q.offer(new Employee(14, "jim", 6));

		for (int loop = 0; loop < 7; loop++) {

			Employee x = q.poll();
			System.out.println(x.toString());

		}

	}

}
