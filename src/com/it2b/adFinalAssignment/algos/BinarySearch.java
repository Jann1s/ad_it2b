package com.it2b.adFinalAssignment.algos;

public class BinarySearch <T extends Comparable<T>> {
	
	/**
	 * @param items	- the array which should be crawled
	 * @param key	- the key which should be searched for
	 * @param low	- lowest index of the array
	 * @param high	- highest index of the array
	 * @return	position of the key in array
	 */
	public int search(T[] items, T key, int low, int high)
    {
	    // Returns index of x if it is present between l and r inside items[], else return -1
	    if (high >= low)
        {
            int mid = (high + low) / 2;
    
            // If the element is present at the middle itself
            T item = items[mid];  
            if (item == key)
               return mid;
           
            // If element is smaller than mid, then it can only be present in left side
            if (item.compareTo(key) > 0)
            	return search(items, key, low, mid -1);
 
            // Else the element can only be present in the right side
            return search(items, key, mid +1 , high);
            
        }
	    
        return -1;	//return -1 if not found
    }
}
