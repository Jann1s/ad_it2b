package com.it2b.adFinalAssignment.algos;

import java.util.NoSuchElementException;

public class LinkList <T extends Comparable<T>> {
	
	private Node<T> head = null;
	private int size;
	
	public LinkList() {
		size = 0;
	}
	
	
	/**
	 * @param element	- item that should be added
	 */
	public void addFirst(T element) {
		Node<T> tNode = new Node<T>(element);
		
		tNode.setNext(head);
		head = tNode;
		size++;
	}
	
	/**
	 * @param element	- item that should be added
	 */
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
	
	/**
	 * @return	the deleted value
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
	
	
	/**
	 * @param index	- index of item
	 * @return	selected value
	 */
	public T get(int index) {
		return getNode(index).getValue();
	}
	
	/**
	 * @param index	- index of item
	 * @return	selected value
	 */
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
	
	/**
	 * private Node class as storage of every added item
	 */
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
