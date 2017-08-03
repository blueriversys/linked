package com.blueriver.linked;

public class LinkedNode<T> {
	private T data;
	private LinkedNode<T> prev;
	private LinkedNode<T> next;
	
	public LinkedNode(T data) {
		this.data = data;
	}
	
	/**
	 * @return the data
	 */
	public T getData() {
		return data;
	}
	/**
	 * @return the prev
	 */
	public LinkedNode<T> getPrev() {
		return prev;
	}
	/**
	 * @return the prox
	 */
	public LinkedNode<T> getNext() {
		return next;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(T data) {
		this.data = data;
	}
	/**
	 * @param prev the prev to set
	 */
	public void setPrev(LinkedNode<T> prev) {
		this.prev = prev;
	}
	/**
	 * @param prox the prox to set
	 */
	public void setNext(LinkedNode<T> next) {
		this.next = next;
	}
}


