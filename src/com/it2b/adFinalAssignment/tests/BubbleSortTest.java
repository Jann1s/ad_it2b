package com.it2b.adFinalAssignment.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.it2b.adFinalAssignment.algos.*;

public class BubbleSortTest {

	BubbleSort<Integer> sorter;
	List<Integer> testList;
	
	@Before
	public void setUp() throws Exception {
		sorter = new BubbleSort<Integer>();
		
		testList = new ArrayList<Integer>();
		testList.add(6);
		testList.add(1);
		testList.add(5);
		testList.add(3);
		testList.add(2);
		testList.add(0);
		testList.add(4);
	}

	/**
	 * Test if the bubble sort algorithm sorts the defined list
	 */
	@Test
	public void testBubbleSort() {
		testList = (List<Integer>) sorter.sort(testList);
		
		assertEquals(testList.get(0), Integer.valueOf(0));
		assertEquals(testList.get(1), Integer.valueOf(1));
		assertEquals(testList.get(2), Integer.valueOf(2));
		assertEquals(testList.get(3), Integer.valueOf(3));
		assertEquals(testList.get(4), Integer.valueOf(4));
		assertEquals(testList.get(5), Integer.valueOf(5));
		assertEquals(testList.get(6), Integer.valueOf(6));
	}

}
