package com.jimprince99.exceptions;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Rule;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

class TestBasicExceptions2 {

	static BasicExceptions2 be2 = null;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		be2 = new BasicExceptions2();

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
	void test1001() throws Exception{

		MyCheckedException myException = assertThrows(MyCheckedException.class, () -> be2.generateMyCheckedException());
		assertTrue(myException.getMessage().contains("jim"));
	}

	@Test
	void test1002() {
		MyRuntimeException myException = assertThrows(MyRuntimeException.class, () -> be2.generateMyRuntimeException());
		assertTrue(myException.getMessage().contains("jim2"));
	}
	

}
