package com.it2b.adFinalAssignment.tests;

import static org.junit.Assert.*;

import java.util.NoSuchElementException;

import org.junit.Before;
import org.junit.Test;

import com.it2b.adFinalAssignment.algos.MyQueue;

public class MyQueueTest {

	MyQueue<Integer> queue;
	
	@Before
	public void setUp() throws Exception {
		queue = new MyQueue<Integer>();
	}

	/**
	 * test if queue is empty or not
	 */
	@Test
	public void isEmptyTest() {
		assertEquals(queue.isEmpty(), true);
		
		queue.add(4);
		assertEquals(queue.isEmpty(), false);
	}
	
	//Test add-method
	@Test
	public void addTest() {
		assertEquals(queue.add(4), true);
	}
	
	//Test offer-method
	@Test
	public void offerTest() {
		//assertEquals(queue.offer(5), true);
	}
	
	//Test peek-method
	@Test
	public void peekTest() {
		//Check if return null because of empty queue
		assertEquals(queue.peek(), null);
		
		queue.add(4);
		assertEquals(queue.peek(), Integer.valueOf(4));
	}
	
	/**
	 * test if element will be returned
	 */
	@Test
	public void elementTest() {
		queue.add(4);
		assertEquals(queue.element(), Integer.valueOf(4));
	}
	
	/**
	 * test if element will rise the expected exception
	 */
	@Test(expected = NoSuchElementException.class)
	public void elementException() {
		queue.element();
	}
	
	//Test remove-method
	@Test
	public void remove() {
		queue.add(4);
		assertEquals(queue.remove(), Integer.valueOf(4));
	}
	
	/**
	 * test if remove method will rise the expected exception
	 */
	@Test(expected = NoSuchElementException.class)
	public void removeException() {
		queue.remove();
	}
	
	//Test poll-method
	@Test
	public void poll() {
		assertEquals(queue.poll(), null);
		
		queue.add(4);
		assertEquals(queue.poll(), Integer.valueOf(4));
	}
}
