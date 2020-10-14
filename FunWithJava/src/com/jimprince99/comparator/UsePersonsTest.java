package com.jimprince99.comparator;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UsePersonsTest {

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
		UsePersons p = new UsePersons();
		
		/* execute */
		List<Person> l = p.getOrderedList();
		
		l.stream()
		.forEach(System.out::println);
		
		/* verify */
		
		/* teardown */
		
		
	}
	
	@Test
	void test10002() {
		/* setup */
		UsePersons p = new UsePersons();
		
		/* execute */
		List<Person> l = p.getOrderedList3();
		
		l.stream()
		.forEach(System.out::println);
		
		/* verify */
		
		/* teardown */
		
		
	}
	
	

}
