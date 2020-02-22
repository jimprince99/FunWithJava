package com.jimprince99.exceptions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Rule;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

class TestBasicExceptions1 {

	static BasicExceptions1 be1;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		be1 = new BasicExceptions1();
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
	void test1001() {
		
		// no exception expected
		be1.myException1();
	}

	@Test
	void test1002() {
		Exception myException = assertThrows(Exception.class, () -> be1.myException2());
		assertTrue(myException.getMessage().contains("jim"));
		
	}
	
	@Test
	void test1003() {
		RuntimeException myException = assertThrows(RuntimeException.class, () -> be1.myException3());
		assertTrue(myException.getMessage().contains("jim"));
		
	}

}
