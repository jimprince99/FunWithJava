package com.jimprince99.hashtable;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Hashtable;
import java.util.Iterator;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HashtableExample1Test {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test10001() {
		/* setup */
		HashtableExample1 ht = new HashtableExample1();
		
		/* execute */
		Hashtable<String, String> result = ht.smallHashTable();
		
		/* verificaton */
		
		result.forEach((k, v) -> System.out.println("key=" + k + ", value=" + v)); 
		
		/* teardown */
		
		
		
		
	}

}
