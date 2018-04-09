package com.it2b.adFinalAssignment.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.it2b.adFinalAssignment.algos.MyQueue;

public class MyQueueTest {

	MyQueue queue;
	
	@Before
	public void setUp() throws Exception {
		queue = new MyQueue();
	}

	//Test add-method
	@Test
	public void addTest() {
		assertEquals(queue.add(4), true);
	}
	
	//Test offer-method
	@Test
	public void offerTest() {
		assertEquals(queue.offer(5), true);
	}
	
	//Test peek-method
	@Test
	public void peekTest() {
		queue.add(4);
		assertEquals(queue.peek(), 4);
	}

	//Test element-method
	@Test
	public void elementTest() {
		queue.add(4);
		assertEquals(queue.poll(), 4);
	}
	
	//Test remove-method
	@Test
	public void removeTest() {
		queue.add(4);
		assertEquals(queue.remove(), 4);
	}
	
	//Test poll-method
	@Test
	public void poll() {
		queue.add(4);
		assertEquals(queue.poll(), 4);
	}
}
