package com.it2b.adFinalAssignment.algos;

import java.util.NoSuchElementException;

public class LinkList <T extends Comparable<T>> {
	
	private Node<T> head = null;
	private int size;
	
	public LinkList() {
		size = 0;
	}
	
	public void addFirst(T element) {
		Node<T> tNode = new Node<T>(element);
		
		tNode.setNext(head);
		head = tNode;
		size++;
	}
	
	public void addLast(T element) {
		Node<T> tNode = new Node<T>(element);
		
		if (size == 0) {
			head = tNode;
		}
		else {
			Node<T> tmp = head;
			for (int i = 0; i < (size - 1); i++) {
				tmp = tmp.next;
			}
			
			tmp.setNext(tNode);
			
		}
		
		size++;
	}
	
	/*
	public T remove(int index) {
		if (index < 0 || index > size) 
			throw new IndexOutOfBoundsException();
		
		if (index > 1) {
			index--;
		}
		
		Node<T> tmp = getNode(index);
        tmp.setNext(tmp.getNext().getNext());
        return tmp.getNext().getValue();
	}
	*/
	
	public T remove() {
		
		Node<T> tmp = head;
		
		if(head.getNext()!=null) {
			head = head.getNext();
		}
		else {
			head = null;
		}
		
		return tmp.getValue();
	}
	
	/*
	public T remove(int index) {
    	if (index < 0 || index > size) 
			throw new IndexOutOfBoundsException();
    	Node<T> tmp = getNode(index);
        remove(tmp);
        return tmp.getValue();
    }
    */
	
	public T get(int index) {
		return getNode(index).getValue();
	}
	
	private Node<T> getNode(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}
		Node<T> tmp = head;
		for (int i=0; i<index; i++) {
			tmp = tmp.next;
		}
		return tmp;
	}
	
	private class Node<T> {

		private T value;
		private Node<T> next;

		public Node(T value) {
			this.value = value;
		}

		public void setNext(Node<T> next) {
			this.next = next;
		}

		public Node<T> getNext() {
			return next;
		}

		public T getValue() {
			return value;
		}

	}
}
