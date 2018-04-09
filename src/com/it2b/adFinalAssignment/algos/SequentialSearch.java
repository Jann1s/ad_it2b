package com.it2b.adFinalAssignment.algos;

public class SequentialSearch <T extends Comparable<T>>{
	
	/**
	 * @param arr	- the array which should be crawled
	 * @param input - the item which should be searched for
	 * @return	index of array
	 */
	public int search(T[] arr, T input) {
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(input))
				return i;
		}
		
		return -1;
	}
}
