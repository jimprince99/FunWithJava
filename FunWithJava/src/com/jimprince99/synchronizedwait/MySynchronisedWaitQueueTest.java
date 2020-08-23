package com.jimprince99.synchronizedwait;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MySynchronisedWaitQueueTest {
	private static final String ITEM1 = "Item1";
	private static final String ITEM2 = "Item2";
	private static final String ITEM3 = "Item3";
	

	MySynchronisedWaitQueue<String> queue = null;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		queue = new MySynchronisedWaitQueue(3);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	/*
	 * check initial size is zero
	 */
	@Test
	void test10001() {
		
		/* setup */
		assertEquals(0, queue.size());

		/* execute */

		/* validation */

		/* teardown */
		
	}
	
	/*
	 * check size increased after put
	 */
	@Test
	void test10002() {
		
		/* setup */
		assertEquals(0, queue.size());

		/* execute */
		queue.put(ITEM1);
		assertEquals(1, queue.size());


		/* validation */

		/* teardown */
		
	}
	
	/*
	 * check size increased after put and remove
	 */
	@Test
	void test10003() {
		
		/* setup */
		assertEquals(0, queue.size());

		/* execute */
		queue.put(ITEM1);
		assertEquals(1, queue.size());

		queue.remove();
		assertEquals(0, queue.size());
		
		/* validation */

		/* teardown */
		
	}
	
	/*
	 * check size increased after put and remove many
	 */
	@Test
	void test10004() {
		
		/* setup */
		assertEquals(0, queue.size());

		/* execute */
		queue.put(ITEM1);
		assertEquals(1, queue.size());

		queue.put(ITEM2);
		assertEquals(2, queue.size());

		queue.put(ITEM3);
		assertEquals(3, queue.size());

		queue.remove();
		assertEquals(2, queue.size());
		
		queue.remove();
		assertEquals(1, queue.size());
		
		queue.remove();
		assertEquals(0, queue.size());
		
		/* validation */

		/* teardown */
		
	}
	
//	/*
//	 * remove from an empty queue
//	 */
//	@Test
//	void test10005() {
//		
//		/* setup */
//		assertEquals(0, queue.size());
//
//		/* execute */
//		
//
//		queue.remove();
//		assertEquals(2, queue.size());
//		
//		
//		/* validation */
//
//		/* teardown */
//		
//	}
	

}
