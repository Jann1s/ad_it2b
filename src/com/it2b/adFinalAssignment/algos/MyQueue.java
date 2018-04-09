package com.it2b.adFinalAssignment.algos;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class MyQueue {

	private List<Object> queueList;
	
	public MyQueue() {
		queueList = new ArrayList<Object>();
	}
	
	//ADD - Inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions, 
	//returning true upon success and throwing an IllegalStateException if no space is currently available.
	public Object add(Object item) {	
		queueList.add(item);
		if(queueList.get(queueList.size() - 1) == item)
			return true;
		else
			throw new IllegalStateException();
	}

	//OFFER - Inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions. When using a capacity-restricted queue, 
	//this method is generally preferable to add(E), which can fail to insert an element only by throwing an exception.
	public Object offer(Object item) {
		queueList.add(item);
		if(queueList.get(queueList.size() - 1) == item)
			return true;
		else
			return false;
	}
	
	//PEEK - Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
	public Object peek() {		
		if (!queueList.isEmpty())
			return queueList.get(0);
		
		return null;
	}
	
	//ELEMENT - Retrieves, but does not remove, the head of this queue. This method differs from peek only in that it throws an exception if this queue is empty.
	public Object element() {	
		if (!queueList.isEmpty())
			return queueList.get(0);	
		else
			throw new NoSuchElementException();
	}
	
	//POLL - Retrieves and removes the head of this queue, or returns null if this queue is empty.
	public Object poll() {
		if(!queueList.isEmpty())
			return queueList.remove(0);
		else
			return null;
	}
	
	//REMOVE - Retrieves and removes the head of this queue. This method differs from poll only in that it throws an exception if this queue is empty.
	public Object remove() {
		if(!queueList.isEmpty())
			return queueList.remove(0);
		else
			throw new NoSuchElementException();
	}
}
