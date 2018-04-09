package com.it2b.adFinalAssignment.algos;

public class SmartBubbleSort <T extends Comparable<T>> {
	
	
	/**
	 * @param arr	- The array which will be sorted
	 * @return	the sorted array
	 */
	public T[] sort(T[] arr) {
		
		boolean flag = true;   // set flag to true to begin first pass
		int list = arr.length;
		T temp;
		while(flag) {
			flag= false;    //set flag to false awaiting a possible swap
			for (int i = 0; i < list - 1; i++) {
				for (int j = 0; j < list - 1 - i; j++) {
					if (arr[j].compareTo(arr[j + 1]) > 0) {

						// swap elements
						temp = arr[j];
						arr[j] = arr[j + 1];
						arr[j + 1] = temp;
						flag = true;  //shows a swap occurred 
					}
				}
			}
		}
		
		return arr;
	}
}
