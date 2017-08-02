package com.blueriver.app;

public class LinkedNode {
	private String data;
	private LinkedNode prev;
	private LinkedNode prox;
	
	public LinkedNode(String data) {
		this.data = data;
	}
	
	/**
	 * @return the data
	 */
	public String getData() {
		return data;
	}
	/**
	 * @return the prev
	 */
	public LinkedNode getPrev() {
		return prev;
	}
	/**
	 * @return the prox
	 */
	public LinkedNode getProx() {
		return prox;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(String data) {
		this.data = data;
	}
	/**
	 * @param prev the prev to set
	 */
	public void setPrev(LinkedNode prev) {
		this.prev = prev;
	}
	/**
	 * @param prox the prox to set
	 */
	public void setProx(LinkedNode prox) {
		this.prox = prox;
	}
}


