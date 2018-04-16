package com.it2b.adFinalAssignment.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.it2b.adFinalAssignment.algos.DoublyLinkedList;

public class DoublyLinkedListTest {

	DoublyLinkedList<Integer> myList;
	
	@Before
	public void setUp() throws Exception {
		myList = new DoublyLinkedList<Integer>();
	}

	/**
	 * Check the addLast function
	 */
	@Test
	public void addLastTest() {
		myList.addLast(2);
		myList.addFirst(1);
		myList.addLast(4);
		myList.add(2, 3);
		
		assertEquals(Integer.valueOf(1), myList.get(0));
		assertEquals(Integer.valueOf(2), myList.get(1));
		assertEquals(Integer.valueOf(3), myList.get(2));
		assertEquals(Integer.valueOf(4), myList.get(3));
	}
	
	/**
	 * Test the addFirst() function
	 */
	@Test
	public void addFirstTest() {
		myList.addFirst(2);
		myList.addFirst(1);
		myList.addLast(4);
		myList.add(2, 3);
		
		assertEquals(Integer.valueOf(1), myList.get(0));
		assertEquals(Integer.valueOf(2), myList.get(1));
		assertEquals(Integer.valueOf(3), myList.get(2));
		assertEquals(Integer.valueOf(4), myList.get(3));
	}

	/**
	 * Test if the size of the list is according to the item number.
	 */
	@Test
	public void sizeTest() {
		myList.addFirst(1);
		myList.addFirst(2);
		
		assertEquals(2, myList.size());
	}
	
	/**
	 * Check if the list is empty or not
	 */
	@Test
	public void isEmptyTest() {
		assertEquals(true, myList.isEmpty());
		
		myList.addFirst(2);
		
		assertEquals(false, myList.isEmpty());
	}
	
	/**
	 * Test more advanced adding process to cover every line
	 */
	@Test
	public void addExtendedTest() {
		myList.add(0, 2);
		myList.add(0, 1);
		myList.add(2, 3);
		
		assertEquals(Integer.valueOf(1), myList.get(0));
		assertEquals(Integer.valueOf(2), myList.get(1));
		assertEquals(Integer.valueOf(3), myList.get(2));
	}
	
	/**
	 * Test removeFirst method.
	 */
	@Test
	public void removeFirstTest() {
		myList.add(0, 2);
		myList.add(0, 1);
		myList.add(2, 3);
		
		assertEquals(Integer.valueOf(1), myList.removeFirst());
	}
	
	/**
	 * Test removeLast method
	 */
	@Test
	public void removeLastTest() {
		myList.add(0, 2);
		myList.add(0, 1);
		myList.add(2, 3);
		
		assertEquals(Integer.valueOf(3), myList.removeLast());
	}
	
	/**
	 * Test remove method
	 */
	@Test
	public void removeTest() {
		myList.add(0, 2);
		myList.add(0, 1);
		myList.add(2, 3);
		
		assertEquals(Integer.valueOf(2), myList.remove(1));
	}
}
