package com.it2b.adFinalAssignment.algos;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class MyQueue <T extends Comparable<T>>{

private List<T> queueList;
	
	public MyQueue() {
		queueList = new ArrayList<T>();
	}
	
	public boolean isEmpty() {
		if (queueList.isEmpty())
			return true;
		
		return false;
	}
	
	public T peek() {
		
		if (!isEmpty())
			return queueList.get(queueList.size() - 1);
		else
			return null;
	}
	
	public T element() {
		if (!isEmpty())
			return queueList.get(queueList.size() - 1);
		else
			throw new NoSuchElementException();
	}
	
	public T poll() {
		
		if (!isEmpty()) {
			T tmp = queueList.get(queueList.size() - 1);
			queueList.remove(queueList.size() - 1);
			return tmp;
		}
		else 
			return null;
	}
	
	public T remove() {
		
		if (!isEmpty()) {
			T tmp = queueList.get(queueList.size() - 1);
			queueList.remove(queueList.size() - 1);
			return tmp;
		} 
		else
			throw new NoSuchElementException();
	}
	
	public boolean add(T item) {
		
		queueList.add(item);
		
		if (peek() == item)
			return true;
		else
			return false;
	}
}
