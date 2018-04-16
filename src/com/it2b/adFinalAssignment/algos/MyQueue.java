package com.it2b.adFinalAssignment.algos;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class MyQueue <T extends Comparable<T>>{

private List<T> queueList;
	
	public MyQueue() {
		queueList = new ArrayList<T>();
	}
	
	/**
	 * Check if MyQueue is empty
	 * @return true if empty
	 */
	public boolean isEmpty() {
		if (queueList.isEmpty())
			return true;
		
		return false;
	}
	
	/**
	 * Get next item without removing it
	 * @return	item
	 */
	public T peek() {
		
		if (!isEmpty())
			return queueList.get(queueList.size() - 1);
		else
			return null;
	}
	
	/**
	 * Get next item without removing it. Exception instead of null if queue is empty.
	 * @return	item
	 */
	public T element() {
		if (!isEmpty())
			return queueList.get(queueList.size() - 1);
		else
			throw new NoSuchElementException();
	}
	
	/**
	 * get and remove item from queue
	 * @return	item
	 */
	public T poll() {
		
		if (!isEmpty()) {
			T tmp = queueList.get(queueList.size() - 1);
			queueList.remove(queueList.size() - 1);
			return tmp;
		}
		else 
			return null;
	}
	
	/**
	 * get and remove item from queue. Exception instead of null if queue is empty.
	 * @return
	 */
	public T remove() {
		
		if (!isEmpty()) {
			T tmp = queueList.get(queueList.size() - 1);
			queueList.remove(queueList.size() - 1);
			return tmp;
		} 
		else
			throw new NoSuchElementException();
	}
	
	/**
	 * @param item	- item which will be added to the queue
	 * @return	true if item was successfully added
	 */
	public boolean add(T item) {
		
		queueList.add(item);
		
		if (peek() == item)
			return true;
		else
			return false;
	}
}
