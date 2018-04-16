package com.it2b.adFinalAssignment.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.it2b.adFinalAssignment.algos.*;

public class QuickSortTest {

	List<Integer> testList;
	QuickSort<Integer> qS;
	
	@Before
	public void setUp() throws Exception {
		qS = new QuickSort<Integer>();
		
		testList = new ArrayList<Integer>();

		testList.add(3);
		testList.add(2);
		testList.add(10);
		testList.add(23);
		testList.add(1);
	}

	/**
	 * test if sorting algorithms sorts the list.
	 */
	@Test
	public void testArraySorting() {
		testList = (List<Integer>) qS.sort(testList);
		
		assertEquals(testList.get(0), Integer.valueOf(1));
		assertEquals(testList.get(1), Integer.valueOf(2));
		assertEquals(testList.get(2), Integer.valueOf(3));
		assertEquals(testList.get(3), Integer.valueOf(10));
		assertEquals(testList.get(4), Integer.valueOf(23));
	}

}
