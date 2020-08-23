package com.jimprince99.blockingqueue;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BlockingQueueConsumerTest {
	
	private final String NAME1 = "name1";
	private final String NAME2 = "name2";
	private final String NAME3 = "name3";
	
	BlockingQueue<String> queue = new ArrayBlockingQueue(10);

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		queue.clear();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test10001() {
		
		/* setup */
		BlockingQueueConsumer c1 = new BlockingQueueConsumer(queue);
		
		queue.add(NAME1);
		queue.add(NAME2);
		queue.add(NAME3);
		
		/* execute */
		Thread t1 = new Thread(c1);
		t1.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {

		}

		/* validation */
		assertEquals(1, queue.size());

		/* teardown */

		
	}
	
	@Test
	void test10002() {
		
		/* setup */
		BlockingQueueConsumer c1 = new BlockingQueueConsumer(queue);
		BlockingQueueConsumer c2 = new BlockingQueueConsumer(queue);
		BlockingQueueConsumer c3 = new BlockingQueueConsumer(queue);
		
		queue.add(NAME1);
		queue.add(NAME2);
		queue.add(NAME3);
		queue.add(NAME1);
		queue.add(NAME2);
		queue.add(NAME3);
		
		/* execute */
		Thread t1 = new Thread(c1);
		Thread t2 = new Thread(c1);
		Thread t3 = new Thread(c3);
		t1.start();
		t2.start();
		t3.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {

		}

		/* validation */
		assertEquals(0, queue.size());

		/* teardown */

		
	}

}
