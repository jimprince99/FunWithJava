package com.jimprince99.hashtable;

import java.util.Hashtable;

/**
 * Demonstrate HashTable
 * 
 * @author jpri1335
 *
 */
public class HashtableExample1 {
	
	/**
	 * method to return a small HashTable
	 */
	public Hashtable<String, String> smallHashTable() {
		Hashtable<String, String> ht = new Hashtable<String, String>();
		
		ht.put("one", "one");
		ht.put("two", "two");
		ht.put("three", "three");
		ht.put("four", "four");
		
		return ht;
	}
	
	
}
