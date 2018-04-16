package com.it2b.adFinalAssignment.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.it2b.adFinalAssignment.algos.*;

public class SquentialSearchTest {

	SequentialSearch<Integer> searcher;
	Integer[] array;
	
	@Before
	public void setUp() throws Exception {
		searcher = new SequentialSearch<Integer>();
		array = new Integer[] {0, 1, 2, 3, 4, 5, 6};
	}

	@Test
	public void testSearch() {
		assertEquals(searcher.search(array, Integer.valueOf(3)), 3);
		assertEquals(searcher.search(array, Integer.valueOf(8)), -1);
	}

}
