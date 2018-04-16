package com.it2b.adFinalAssignment.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.it2b.adFinalAssignment.algos.*;

public class MyStackTest {

	MyStack<Integer> stack;
	
	@Before
	public void setUp() throws Exception {
		stack = new MyStack<Integer>();
	}

	//test if empty
	@Test
	public void testEmpty() {
		assertEquals(stack.isEmpty(), true);
	}
	
	//test pushing element
	@Test
	public void testPush() {
		assertEquals(stack.push(3), Integer.valueOf(3));
	}
	
	//test peek of element
	@Test
	public void testPeek() {
		stack.push(3);
		stack.push(10);
		assertEquals(stack.peek(), Integer.valueOf(10));
	}
	
	//test pop
	@Test
	public void testPop() {
		stack.push(3);
		stack.push(11);
		assertEquals(stack.pop(), Integer.valueOf(11));
	}
	
	//Test search
	@Test
	public void testSearch() {
		stack.push(1);
		stack.push(2);
		stack.push(3);
		assertEquals(stack.search(2), 1);
		assertEquals(stack.search(5), -1);
	}
	
	/**
	 * test with empty stack to cover all of the possibillities
	 */
	@Test
	public void testWithEmptyStack() {
		
		MyStack<Integer> emptyStack = new MyStack<Integer>();
		
		assertEquals(emptyStack.peek(), null);
		assertEquals(emptyStack.pop(), null);
	}
}
