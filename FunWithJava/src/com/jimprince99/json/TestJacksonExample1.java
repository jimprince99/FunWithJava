package com.jimprince99.json;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonProcessingException;

class TestJacksonExample1 {

	static JacksonExample1 je;
	private final String JSON1 = "{\"firstName\":\"jim\",\"lastName\":\"prince\",\"age\":1}";
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		je = new JacksonExample1();
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
	void test1001() throws JsonProcessingException {
		PersonBean pb = new PersonBean("jim", "prince", 1);
		
		String result = je.toJson(pb);
		
		assertEquals(JSON1, result);
	}
	
	@Test
	void test1002() throws JsonProcessingException {		
		PersonBean pb = je.toBean(JSON1);
		
		assertEquals(pb.getFirstName(), "jim");
		assertEquals(pb.getLastName(), "prince");
		assertEquals(pb.getAge(), 1);
		
	}
	
}
