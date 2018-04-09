package com.it2b.adFinalAssignment.algos;

import java.util.NoSuchElementException;

public class DoublyLinkedList<T> {
	
	private Node head;
	private Node tail;
	private int size;
	
	public DoublyLinkedList() {
		size = 0;
	}
	private class Node {
		public T element;
		public Node next;
		public Node prev;

		public Node(T data,Node next,Node prev) {
			this.element = data;
			this.next = next;
			this.prev = prev;
		}

	}
	///Return list size
	public int size() {
		return size;
	}
	// Check if List is empty
	public boolean isEmpty() {
		return size == 0;
	}
	//Add element at first position
	public void addFirst(T element) {
		Node tmp = new Node(element, head , null);
		if(head != null) {
			head.prev = tmp;
		}
		head = tmp;
		if(tail == null) {
			tail = tmp;
		}
		size++;
	}
	//Add element at last position 
	public void addLast(T element) {
		Node tmp = new Node(element, null, tail);
		if(head != null) {
			tail.next = tmp;
		}
		tail = tmp;
		if(head == null) {
			head = tmp;
		}
		size++;
		
	}
	// Add element at index
	public void add(int index, T element)  {
		if (index < 0 || index > size) 
			throw new IndexOutOfBoundsException();
		Node tmp = new Node(element,null,null);
		if (head == null) {		// list is empty, index must be 0
			head = tmp;
			tail = tmp;
		}
		else if (index == 0) {			// insert before head
			tmp.next = head;
			head.prev = tmp;
			head = tmp;
		}
		else if (index == size) { 	// insert after tail
			tmp.prev = tail;
			tail.next = tmp;
			tail = tmp;
		}
		else {					// general case
			Node nodeRef = head;
			for (int i = 1; i < index; i++) 
				nodeRef = nodeRef.next;
			// nodeRef now points to the node before the insert point
			tmp.next = nodeRef.next;
			nodeRef.next = tmp;
			tmp.prev = nodeRef;
			tmp.next.prev = tmp;
		}
		size++;
	}
	
	//Iterate trough the list backwards 
	public void iterateBack() {
		Node tmp = tail;
		while(tmp != null) {
			System.out.println(tmp.element);
			tmp = tmp.prev;
		}
		
	}
	//Iterate trough the list forwards
	public void iterateForward() {
		 Node tmp = head;
	        while(tmp != null){
	            System.out.println(tmp.element);
	            tmp = tmp.next;
	        }
	}
	//Remove element at first position
    public T removeFirst() {
        if (size == 0) throw new NoSuchElementException();
        Node tmp = head;
        head = head.next;
        head.prev = null;
        size--;
        
        return tmp.element;
    }
    //Remove element at last position
    public T removeLast() {
        if (size == 0) throw new NoSuchElementException();
        Node tmp = tail;
        tail = tail.prev;
        tail.next = null;
        size--;
       
        return tmp.element;
    }
    //Remove element 
    private void remove(Node tmp) {
        tmp.prev.next = tmp.next;
        tmp.next.prev = tmp.prev;
        size--;
    }
    //Remove element at position
    public T remove(int index) {
    	if (index < 0 || index > size) 
			throw new IndexOutOfBoundsException();
    	Node tmp = getNode(index);
        remove(tmp);
        return tmp.element;
    }
    //Return node at index
	private Node getNode(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}
		Node tmp = head;
		for (int i=0; i<index; i++) {
			tmp = tmp.next;
		}
		return tmp;
	}
}
