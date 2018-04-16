package com.it2b.adFinalAssignment.algos;

import java.util.ArrayList;
import java.util.List;

public class MyStack <T extends Comparable<T>>{

	private List<T> stackList;
	
	public MyStack() {
		stackList = new ArrayList<T>();
	}
	
	/**
	 * check if MyStack is empty
	 * @return true if stack is empty
	 */
	public boolean isEmpty() {
		if (stackList.isEmpty())
			return true;
		
		return false;
	}
	
	/**
	 * Get next item without removing it
	 * @return	item
	 */
	public T peek() {
		
		if (!isEmpty())
			return stackList.get(stackList.size() - 1);
		
		return null;
	}
	
	/**
	 * get and remove item from stack
	 * @return	item
	 */
	public T pop() {
		
		if (!isEmpty()) {
			T tmp = stackList.get(stackList.size() - 1);
			stackList.remove(stackList.size() - 1);
			return tmp;
		}
		
		return null;
	}
	
	/**
	 * @param item	- item which will be added to the stack
	 * @return	added item
	 */
	public T push(T item) {
		
		stackList.add(item);
		return item;
	}
	
	/**
	 * @param item	- item which should be searched for
	 * @return	index of item
	 */
	public int search(T item) {
		
		if (!isEmpty()) {
			for (int i = 0; i < stackList.size(); i++) {
				if (stackList.get(i).equals(item))
					return i;
			}
		}
		
		return -1;
	}
}
