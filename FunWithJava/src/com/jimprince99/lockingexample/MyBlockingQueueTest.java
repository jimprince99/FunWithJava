package com.jimprince99.lockingexample;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyBlockingQueueTest {
	
	private final String ITEM1 = "itme1";
	private final String ITEM2 = "itme2";
	private final String ITEM3 = "itme3";
	private final String ITEM4 = "itme4";
	
	MyBlockingQueue<String> queue;


	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		queue = new MyBlockingQueue<>(10);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test10001() {
		/* setup */
		//MyBlockingQueue<String> queue = new MyBlockingQueue(10);

		/* execute */
		assertEquals(0, queue.size());

		/* validation */

		/* teardown */
		
	}
	
	/**
	 * add one item to the queue
	 */
	@Test
	void test10002() {
		/* setup */
		//MyBlockingQueue<String> queue = new MyBlockingQueue(10);

		/* execute */
		assertTrue(queue.add(ITEM1));
		assertEquals(1, queue.size());

		/* validation */

		/* teardown */
		
	}
	
	/**
	 * remove one item from the queue
	 */
	@Test
	void test10003() {
		/* setup */
		//MyBlockingQueue<String> queue = new MyBlockingQueue(10);
		queue.add(ITEM1);

		/* execute */
		assertEquals(1, queue.size());
		assertEquals(ITEM1, queue.remove());
		assertEquals(0, queue.size());

		/* validation */

		/* teardown */
		
	}
	
	/**
	 * remove one item from the queue
	 */
	@Test
	void test10004() {
		/* setup */
		//MyBlockingQueue<String> queue = new MyBlockingQueue(10);
		queue.add(ITEM1);
		queue.add(ITEM2);
		queue.add(ITEM3);

		/* execute */
		assertEquals(3, queue.size());
		assertEquals(ITEM1, queue.remove());
		assertEquals(2, queue.size());
		assertEquals(ITEM2, queue.remove());
		assertEquals(1, queue.size());
		assertEquals(ITEM3, queue.remove());
		assertEquals(0, queue.size());

		/* validation */

		/* teardown */
		
	}
	
//	/**
//	 * remove one item from the queue
//	 */
//	@Test
//	void test10014() {
//		/* setup */
//		queue = new MyBlockingQueue(2);
//		assertTrue(queue.add(ITEM1));
//		assertTrue(queue.add(ITEM2));
//		assertFalse(queue.add(ITEM3));
//
//		/* execute */
//		assertEquals(2, queue.size());
//		assertEquals(ITEM1, queue.remove());
//		assertEquals(1, queue.size());
//		assertEquals(ITEM2, queue.remove());
//		assertEquals(0, queue.size());
//
//		/* validation */
//
//		/* teardown */
//		
//	}
	
		
	/**
	 * threading add 1000, check we get 1000 in the queue.
	 * don't check for blocking at this point
	 */
	@Test
	void test10005() {
		/* setup */
		queue = new MyBlockingQueue<>(1001);
		ExecutorService service = Executors.newFixedThreadPool(5);
		
		/* execute */
		for (int loop=0; loop < 1000; loop++) {
			service.execute(addItem);
		}		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
		}
		/* validation */
		assertEquals(1000, queue.size());

		/* teardown */
		
	}
	
	/**
	 * threading add 1000, check we get 1000 in the queue.
	 * Then remove all the entries
	 * don't check for blocking at this point
	 */
	@Test
	void test10006() {
		/* setup */
		queue = new MyBlockingQueue<>(1001);
		ExecutorService service = Executors.newFixedThreadPool(5);
		
		for (int loop=0; loop < 1000; loop++) {
			service.execute(addItem);
		}		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
		}

		/* execute */
		assertEquals(1000, queue.size());
		
		for (int loop=0; loop < 1000; loop++) {
			service.execute(removeItem);
		}	

		/* validation */
		assertEquals(0, queue.size());

		/* teardown */
		
	}
	
	/**
	 * threading add 1000, check we get 1000 in the queue.
	 * now with blocking
	 */
	@Test
	void test10007() {
		/* setup */
		ExecutorService writerservice = Executors.newFixedThreadPool(5);
		ExecutorService readerService = Executors.newFixedThreadPool(5);
		
		/* execute */
		for (int loop=0; loop < 1000; loop++) {
			writerservice.execute(addItem);
		}		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
		}
		/* validation */
		
		System.out.println("starting remove threads");
		for (int loop=0; loop < 1000; loop++) {
			readerService.execute(removeItem);
		}
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
		}
		assertEquals(0, queue.size());

		/* teardown */
		
	}
		
	
	Runnable addItem = () -> {
		queue.add(Thread.currentThread().getName());		
	};
	
	Runnable removeItem = () -> {
		queue.remove();		
	};	
	
	

}
