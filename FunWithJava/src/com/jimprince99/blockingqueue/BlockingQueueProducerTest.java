package com.jimprince99.blockingqueue;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.jimprince99.mockito.Subscriber;

class BlockingQueueProducerTest {

	BlockingQueue<String> queue = new ArrayBlockingQueue<>(10);

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
	void test10001() throws InterruptedException {
		/* setup */
		BlockingQueueProducer p1 = new BlockingQueueProducer(queue);
		
		/* execute */
		Thread t1 = new Thread(p1);
		t1.start();		
		t1.join();
		
		/* validation */

		assertEquals(2, queue.size());
		
		/* teardown */
	}

	@Test
	void test10002() throws InterruptedException {
		/* setup */
		BlockingQueueProducer p1 = new BlockingQueueProducer(queue);
		
		/* execute */
		Thread t1 = new Thread(p1);
		t1.start();		
		t1.join();
		
		Thread t2 = new Thread(p1);
		t2.start();		
		t2.join();
		
		/* validation */

		assertEquals(4, queue.size());
		
		/* teardown */
	}
	
	@Test
	void test10003() throws InterruptedException {
		/* setup */
		BlockingQueueProducer p1 = new BlockingQueueProducer(queue);
		
		/* execute */
		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(p1);
		Thread t3 = new Thread(p1);
		t1.start();		
		t2.start();		
		t3.start();	
		
		t1.join();
		t2.join();
		t3.join();
		
		/* validation */

		assertEquals(6, queue.size());
		
		/* teardown */
	}
}
