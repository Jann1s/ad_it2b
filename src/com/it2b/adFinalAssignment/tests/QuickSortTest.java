package com.it2b.adFinalAssignment.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.it2b.adFinalAssignment.algos.*;

public class QuickSortTest {

	Integer[] testArray;
	QuickSort<Integer> qS;
	
	@Before
	public void setUp() throws Exception {
		qS = new QuickSort<Integer>();
		testArray = new Integer[] {3, 2, 10, 23, 1};
	}

	@Test
	public void testArraySorting() {
		testArray = qS.sort(testArray);
		assertEquals(testArray[0], Integer.valueOf(1));
		assertEquals(testArray[1], Integer.valueOf(2));
		assertEquals(testArray[2], Integer.valueOf(3));
		assertEquals(testArray[3], Integer.valueOf(10));
		assertEquals(testArray[4], Integer.valueOf(23));
	}

}
