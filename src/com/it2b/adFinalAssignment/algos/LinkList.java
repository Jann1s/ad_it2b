package com.it2b.adFinalAssignment.algos;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class LinkList {
	
	private List<Object> myLinkList;
	
	public LinkList() {
		myLinkList = new ArrayList<Object>();
	}
	
	//add - Appends the specified element to the end of this list.
	public Object add(Object item) {		
		myLinkList.add(item);
		return true;
	}
	
	//add - Inserts the specified element at the specified position in this list.
	public Object add(int position, Object item) {		
		myLinkList.add(position, item);
		return true;
	}
	
	//addAll - Appends all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection's iterator.
	//addAll - Inserts all of the elements in the specified collection into this list, starting at the specified position.
	
	//addFirst - Inserts the specified element at the beginning of this list.
	public Object addFirst(Object item) {		
		myLinkList.add(0, item);
		return true;
	}

	//addLast - Appends the specified element to the end of this list.
	public Object addLast(Object item) {		
		//myLinkList.add(myLinkList.size(), item);
		myLinkList.add(item);
		return true;
	}

	//clear - Removes all of the elements from this list. The list will be empty after this call returns.
	public void clear() {
		myLinkList.clear();
	}
	
	//clone - Returns a shallow copy of this LinkedList.
	
	//contains - Returns true if this list contains the specified element. More formally, returns true if and only if this list contains at least one element e such that (o==null ? e==null : o.equals(e)).
	public Object contains(Object item) {
		if(myLinkList.contains(item))
			return true;
		else
			return false;
	}
	
	//descendingIterator - Returns an iterator over the elements in this deque in reverse sequential order. The elements will be returned in order from last (tail) to first (head).
	
	//element - Retrieves, but does not remove, the head (first element) of this list.
	public Object element() {	
		if (!myLinkList.isEmpty())
			return myLinkList.get(0);	
		else
			throw new NoSuchElementException();
	}
	
	//get - Returns the element at the specified position in this list
	public Object get(int item) {
		if(item < 0 || item >= myLinkList.size())
			throw new IndexOutOfBoundsException();
		else
			return myLinkList.get(item);
	}
	
	//getFirst - Returns the first element in this list
	public Object getFirst() {
		if(!myLinkList.isEmpty())
			return myLinkList.get(0);
		else
			throw new NoSuchElementException();
	}
	
	//getLast - Returns the last element in this list
	public Object getLast() {
		if(!myLinkList.isEmpty())
			return myLinkList.get(myLinkList.size()-1);
		else
			throw new NoSuchElementException();
	}
	
	//indexOf - Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
	public Object indexOf(Object item) {
		int position = -1;
		int end = (int) myLinkList.get(myLinkList.size()-1);
		do {						
			position ++;
		}while(!(item==myLinkList.get(position)) || position != end);
		
		if(!(item==myLinkList.get(position)) && position == end)
			return -1;
		else
			return position;
	}
	
	//lastIndexOf - Returns the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element.

	//listIterator - Returns a list-iterator of the elements in this list (in proper sequence), starting at the specified position in the list.	
	
	//offer - Adds the specified element as the tail (last element) of this list.
	
	//offerFirst - Inserts the specified element at the front of this list.
	
	//offerLast - Inserts the specified element at the end of this list.
	
	//peek - Retrieves, but does not remove, the head (first element) of this list.
	
	//peekFirst - Retrieves, but does not remove, the first element of this list, or returns null if this list is empty.
	
	//peekLast - Retrieves, but does not remove, the last element of this list, or returns null if this list is empty.
	
	//poll - Retrieves and removes the head (first element) of this list.
	
	//pollFirst - Retrieves and removes the first element of this list, or returns null if this list is empty.
	
	//pollLast - Retrieves and removes the last element of this list, or returns null if this list is empty.
	
	//pop - Pops an element from the stack represented by this list.
	
	//push - Pushes an element onto the stack represented by this list.
	
	//remove - Retrieves and removes the head (first element) of this list.
	public Object remove() {
		if(!myLinkList.isEmpty())
			return myLinkList.remove(0);
		else
			throw new NoSuchElementException();
	}
	
	//remove - Removes the element at the specified position in this list
	
	//remove - Removes the first occurrence of the specified element from this list, if it is present
	
	//removeFirst - Removes and returns the first element from this list.
	
	//removeFirstOccurrence - Removes the first occurrence of the specified element in this list (when traversing the list from head to tail)
	
	//removeLast - Removes and returns the last element from this list.
	
	//removeLastOccurrence - Removes the last occurrence of the specified element in this list (when traversing the list from head to tail).
	
	//set - Replaces the element at the specified position in this list with the specified element.
	
	//size - Returns the number of elements in this list.
	
	//toArray - Returns an array containing all of the elements in this list in proper sequence (from first to last element).
	
	//toArray - Returns an array containing all of the elements in this list in proper sequence (from first to last element); the runtime type of the returned array is that of the specified array.
}
