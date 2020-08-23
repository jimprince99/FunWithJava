package com.jimprince99.synchronizedwait;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProducerConsumerTest {

	MySynchronisedWaitQueue<String> queue;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		queue = new MySynchronisedWaitQueue<>(5);
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	void test10001() {
		/* setup */
		
		Thread p1 = new Thread(new producer<String>(queue, "hello"));
		Thread c1 = new Thread(new consumer<String>(queue));

		/* execute */
		//c1.start();
		p1.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		
		c1.start();
		
		try {
			p1.join();
		} catch (InterruptedException e) {
		}
		
		try {
			c1.join();
		} catch (InterruptedException e) {
		}

		
		/* validation */
		assertEquals(0, queue.size());

		/* teardown */
		
	}
	
	
	
	
	@Test
	void test10101() {
		/* setup */
		
		Thread p1 = new Thread(new producer<String>(queue, "hello"));
		Thread p2 = new Thread(new producer<String>(queue, "hello"));
		Thread p3 = new Thread(new producer<String>(queue, "hello"));
		Thread p4 = new Thread(new producer<String>(queue, "hello"));
		Thread p5 = new Thread(new producer<String>(queue, "hello"));
				
		Thread c1 = new Thread(new consumer<String>(queue));
		Thread c2 = new Thread(new consumer<String>(queue));
		Thread c3 = new Thread(new consumer<String>(queue));
		Thread c4 = new Thread(new consumer<String>(queue));
		Thread c5 = new Thread(new consumer<String>(queue));
		

		/* execute */
		c1.start();
		p1.start();
		c2.start();
		c3.start();
		p2.start();
		p3.start();
		p4.start();
		p5.start();
		c4.start();
		c5.start();
		
		try {
			p1.join();
			p2.join();
			p3.join();
			p4.join();
			p5.join();
			c1.join();
			c2.join();
			c3.join();
			c4.join();
			c5.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/* validation */
		assertEquals(0, queue.size());

		/* teardown */
		
	}

}
