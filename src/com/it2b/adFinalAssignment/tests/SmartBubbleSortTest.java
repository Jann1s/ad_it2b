package com.it2b.adFinalAssignment.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.it2b.adFinalAssignment.algos.*;

public class SmartBubbleSortTest {

	BubbleSort<Integer> sorter;
	Integer[] array;
	
	@Before
	public void setUp() throws Exception {
		sorter = new BubbleSort<Integer>();
		array = new Integer[] {6, 1, 5, 3, 2, 0, 4};
	}

	@Test
	public void testSmartBubbleSort() {
		array = sorter.sort(array);
		assertEquals(array[0], Integer.valueOf(0));
		assertEquals(array[1], Integer.valueOf(1));
		assertEquals(array[2], Integer.valueOf(2));
		assertEquals(array[3], Integer.valueOf(3));
		assertEquals(array[4], Integer.valueOf(4));
		assertEquals(array[5], Integer.valueOf(5));
		assertEquals(array[6], Integer.valueOf(6));
	}
	
	@Test
	public void testPreSorted() {
		array = new Integer[] {0, 1, 2, 3, 4, 5, 6};
		array = sorter.sort(array);
		assertEquals(array[0], Integer.valueOf(0));
		assertEquals(array[1], Integer.valueOf(1));
		assertEquals(array[2], Integer.valueOf(2));
		assertEquals(array[3], Integer.valueOf(3));
		assertEquals(array[4], Integer.valueOf(4));
		assertEquals(array[5], Integer.valueOf(5));
		assertEquals(array[6], Integer.valueOf(6));
	}
}
