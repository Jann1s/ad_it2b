package com.it2b.adFinalAssignment.algos;

import java.util.Collection;
import java.util.List;

public class Insertion <T extends Comparable<T>> {
		
	//STRING area
	public Collection<T> sort(Collection<T> arr) {
		
		if (arr instanceof List) {
			for (int i = 1; i < arr.size(); ++i)
	        {
	            T key = ((List<T>) arr).get(i);
	            int j = i - 1;
	 
	 			//Move elements of arrString[0..i-1], that are
				//greater than key, to one position ahead
				//of their current position
	            while (j>=0 && ((List<T>) arr).get(j).compareTo(key) > 0)
	            {
	            	((List<T>) arr).set(j + 1, ((List<T>) arr).get(j));
	                j = j-1;
	            }
	            ((List<T>) arr).set(j + 1, key);
	        }
		}
		
		return arr;
	}
}
