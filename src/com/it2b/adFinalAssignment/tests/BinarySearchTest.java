package com.it2b.adFinalAssignment.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.it2b.adFinalAssignment.algos.*;

public class BinarySearchTest {

	BinarySearch<Integer> searcher;
	Integer[] array;
	
	@Before
	public void setUp() throws Exception {
		searcher = new BinarySearch<Integer>();
		array = new Integer[] {0, 1, 2, 3, 4, 5, 6};
	}

	/**
	 * Test if the search alogrithm is able to perform accordingly
	 */
	@Test
	public void testBinarySearch() {
		int mid = searcher.search(array, Integer.valueOf(3), 0, array.length);
		int before = searcher.search(array, Integer.valueOf(1), 0, array.length);
		int after = searcher.search(array, Integer.valueOf(5), 0, array.length);
		int failed = searcher.search(array, Integer.valueOf(5), 10, array.length);
		
		assertEquals(mid, 3);
		assertEquals(before, 1);
		assertEquals(after, 5);
		assertEquals(failed, -1);
	}
}