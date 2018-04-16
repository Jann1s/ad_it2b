package com.it2b.adFinalAssignment.tests;

import static org.junit.Assert.*;

import java.util.NoSuchElementException;

import org.junit.Before;
import org.junit.Test;

import com.it2b.adFinalAssignment.algos.LinkList;

public class LinkedListTest {

	LinkList<Integer> myList;
	
	@Before
	public void setUp() throws Exception {
		myList = new LinkList<Integer>();
	}

	/**
	 * Test if the items will be added.
	 */
	@Test
	public void addTest() {
		myList.addLast(4);
		myList.addFirst(5);
		myList.addLast(9);
		myList.addFirst(1);
		myList.addLast(10);
		
		assertEquals(Integer.valueOf(1), myList.get(0));
		assertEquals(Integer.valueOf(5), myList.get(1));
		assertEquals(Integer.valueOf(4), myList.get(2));
		assertEquals(Integer.valueOf(9), myList.get(3));
		assertEquals(Integer.valueOf(10), myList.get(4));
	}
	
	/**
	 * Test if IndexOutOfBoundsException will be triggered
	 */
	@Test(expected = IndexOutOfBoundsException.class)
	public void getOutOfBounds() {
		myList.get(3);
	}
	
	/**
	 * test remove method in advanced way to cover all possibilities
	 */
	@Test
	public void removeTest() {
		myList.addLast(1);
		myList.addLast(2);
		myList.addLast(3);
		
		assertEquals(Integer.valueOf(1), myList.get(0));
		assertEquals(Integer.valueOf(2), myList.get(1));
		assertEquals(Integer.valueOf(3), myList.get(2));
		
		assertEquals(Integer.valueOf(1), myList.remove());
		
		assertEquals(Integer.valueOf(2), myList.get(0));
		assertEquals(Integer.valueOf(3), myList.get(1));
		
		assertEquals(Integer.valueOf(2), myList.remove());
		assertEquals(Integer.valueOf(3), myList.remove());
	}
}
