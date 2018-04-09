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

	@Test
	void testBinarySearch() {
		int position = searcher.search(array, Integer.valueOf(3), 0, array.length);
		
		assertEquals(position, 3);
	}
}