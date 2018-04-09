package com.it2b.adFinalAssignment.algos;

public class BubbleSort <T extends Comparable<T>>{
	
	public T[] sort(T[] arr) {
		int list = arr.length;
		T temp;
		for (int i = 0; i < list - 1; i++) {
			for (int j = 0; j < list - 1 - i; j++) {
				if (arr[j].compareTo(arr[j + 1]) > 0) {

					// swap elements
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}
			}
		}
		
		return arr;
	}
}
