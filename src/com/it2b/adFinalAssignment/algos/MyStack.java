package com.it2b.adFinalAssignment.algos;

import java.util.ArrayList;
import java.util.List;

public class MyStack <T extends Comparable<T>>{

	private List<T> stackList;
	
	public MyStack() {
		stackList = new ArrayList<T>();
	}
	
	public boolean isEmpty() {
		if (stackList.isEmpty())
			return true;
		
		return false;
	}
	
	public T peek() {
		
		if (!isEmpty())
			return stackList.get(stackList.size() - 1);
		
		return null;
	}
	
	public T pop() {
		
		if (!isEmpty()) {
			T tmp = stackList.get(stackList.size() - 1);
			stackList.remove(stackList.size() - 1);
			return tmp;
		}
		
		return null;
	}
	
	public T push(T item) {
		
		stackList.add(item);
		return item;
	}
	
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
