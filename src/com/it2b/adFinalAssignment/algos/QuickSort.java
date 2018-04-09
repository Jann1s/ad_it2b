package com.it2b.adFinalAssignment.algos;

public class QuickSort <T extends Comparable<T>> {
	
	private T[] arrObj;
	
	/**
	 * @param arr	- T array which will be sorted
	 * @return sorted T array
	 */
	public T[] sort(T[] arr) {
		arrObj = arr;
		quickSortT(0, arr.length - 1);
		return arrObj;
	}
	
	
	/**
	 * @param low	- the lowest index of array
	 * @param high	- the length of the array
	 */
	private void quickSortT(int low, int high) {
		
		if (low < high) {
            int i = low, j = high;
            T x = arrObj[(i + j) / 2];

            do {
                while (arrObj[i].compareTo(x) < 0) i++;
                while (x.compareTo(arrObj[j]) < 0) j--;

                if ( i <= j) {
                    T tmp = arrObj[i];
                    arrObj[i] = arrObj[j];
                    arrObj[j] = tmp;
                    i++;
                    j--;
                }

            } while (i <= j);

            quickSortT(low, j);
            quickSortT(i, high);
        }
	}
}