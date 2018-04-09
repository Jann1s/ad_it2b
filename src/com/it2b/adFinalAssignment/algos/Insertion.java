package com.it2b.adFinalAssignment.algos;

public class Insertion <T extends Comparable<T>> {
		
	//STRING area
	public T[] sort(T[] arr) {
		
		for (int i=1; i<arr.length; ++i)
        {
            T key = arr[i];
            int j = i-1;
 
 			//Move elements of arrString[0..i-1], that are
			//greater than key, to one position ahead
			//of their current position
            while (j>=0 && arr[i].compareTo(arr[i]) > arr[i].compareTo(key))
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
		
		return arr;
	}
}
