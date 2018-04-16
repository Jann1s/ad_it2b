package com.it2b.adFinalAssignment.algos;

import java.util.Collection;
import java.util.List;

public class QuickSort <T extends Comparable<T>> {
	
	private Collection<T> arrObj;
	
	/**
	 * @param arr	- T array which will be sorted
	 * @return sorted T array
	 */
	public Collection<T> sort(Collection<T> arr) {
			
		arrObj = arr;
		quickSortT(0, arr.size() - 1);
		return arrObj;
	}
	
	
	/**
	 * @param low	- the lowest index of array
	 * @param high	- the length of the array
	 */
	private void quickSortT(int low, int high) {
		
		if (arrObj instanceof List) {
			if (low < high) {
	            int i = low, j = high;
	            T x = ((List<T>) arrObj).get((i + j) / 2);

	            do {
	                while (((List<T>) arrObj).get(i).compareTo(x) < 0) i++;
	                while (x.compareTo(((List<T>) arrObj).get(j)) < 0) j--;

	                if ( i <= j) {
	                	T tmp = ((List<T>) arrObj).get(i);
						((List<T>) arrObj).set(i, ((List<T>) arrObj).get(j));
						((List<T>) arrObj).set(j, tmp);
	                    i++;
	                    j--;
	                }

	            } while (i <= j);

	            quickSortT(low, j);
	            quickSortT(i, high);
	        }
		}
	}
}