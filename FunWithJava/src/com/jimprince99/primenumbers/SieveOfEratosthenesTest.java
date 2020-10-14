package com.jimprince99.primenumbers;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SieveOfEratosthenesTest {
	
	Integer[] check1 = {1,2,3,5,7};
	Integer[] check2 = {1,2,3,5,7,11,13,17,19};
	Integer[] check3 = {1,2,3,5,7,11,13,17,19,23,29,31};


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
		SieveOfEratosthenes s = new SieveOfEratosthenes();
		
		/* execute */
		List<Integer> result = s.calculate(10);
		
		result.stream()
		.forEach(System.out::println);
		
		/* verify */
		assertEquals(check1, result);
		
		/* teardown */
	}
	
	@Test
	void test10002() {
		/* setup */
		SieveOfEratosthenes s = new SieveOfEratosthenes();
		
		/* execute */
		List<Integer> result = s.calculate(36);
		
		result.stream()
		.forEach(System.out::println);
		
		/* verify */
		assertEquals(check3, result);
		
		/* teardown */
	}
	
	

}
