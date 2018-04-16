package com.it2b.adFinalAssignment.algos;

import java.util.Collection;
import java.util.List;

public class BubbleSort <T extends Comparable<T>>{
	
	public Collection<T> sort(Collection<T> arr) {
		int list = arr.size();
		T temp;
		
		if (arr instanceof List) {
			for (int i = 0; i < list - 1; i++) {
				for (int j = 0; j < list - 1 - i; j++) {
					if (((List<T>) arr).get(j).compareTo(((List<T>) arr).get(j + 1)) > 0) {

						// swap elements
						temp = ((List<T>) arr).get(j);
						((List<T>) arr).set(j, ((List<T>) arr).get(j + 1));
						((List<T>) arr).set(j + 1, temp);
					}
				}
			}
		}
		
		return arr;
	}
}
