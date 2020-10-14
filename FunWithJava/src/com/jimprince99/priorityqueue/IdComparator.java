package com.jimprince99.priorityqueue;

import java.util.*;

/**
 * 
 * @author jpri1335
 *
 */
public class IdComparator implements Comparator<Employee> {
	
	public int compare(Employee e1, Employee e2) {
		return e1.getId() - e1.getId();
	}

}
