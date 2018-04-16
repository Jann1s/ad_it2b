package com.it2b.adFinalAssignment.algos;

import java.util.Collection;
import java.util.List;

public class SmartBubbleSort <T extends Comparable<T>> {
	
	
	/**
	 * @param arr	- The array which will be sorted
	 * @return	the sorted array
	 */
	public Collection<T> sort(Collection<T> arr) {
		if (arr instanceof List) {
			
			boolean flag = true;   // set flag to true to begin first pass
			int list = arr.size();
			T temp;
			
			while(flag) {
				flag = false;    //set flag to false awaiting a possible swap
				
				for (int i = 0; i < list - 1; i++) {
					for (int j = 0; j < list - 1 - i; j++) {
						
						//If item X is bigger than item Y -> they will be swapped
						if (((List<T>) arr).get(j).compareTo(((List<T>) arr).get(j + 1)) > 0) {

							// swap elements
							temp = ((List<T>) arr).get(j);
							((List<T>) arr).set(j, ((List<T>) arr).get(j + 1));
							((List<T>) arr).set(j + 1, temp);
							
							flag = true;  //shows a swap occurred 
						}
					}
				}
			}
		}
		
		
		return arr;
	}
}
