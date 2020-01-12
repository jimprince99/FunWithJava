package com.jimprince99.patternmatcher;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Example1 {

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
	void test0001() {
		String textString ="Hello World, I am jim";
		String textString2="1234";
		
		Pattern pattern1 = Pattern.compile("jim");
		
		Matcher matcher = pattern1.matcher(textString);
		assertTrue(matcher.find());
		
		assertEquals(matcher.start(), 18);
		assertEquals(matcher.end(), 21);
		assertEquals(matcher.group(), "jim");
		
		Pattern allDigits = Pattern.compile("\\d*");
		Matcher matcher2 = allDigits.matcher(textString2);
		assertTrue(matcher2.find());
		assertEquals(matcher2.start(), 0);
		
		
		
		
		
	}
	
	

}
