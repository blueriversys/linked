package com.blueriver.linked;

public class LinkedNodeDriver {
	private LinkedNode head;
	private LinkedNode tail;
	
	private void setFirst(LinkedNode head) {
		this.head = head;
	}
	
	private void add(LinkedNode item) {
		LinkedNode obj = head;
		LinkedNode prev = null;
		
		while (true) {
			if (obj.getProx() == null) {
				break;
			}
			prev = obj;
			obj = obj.getProx();
		}
		
		item.setPrev(obj); // update this item
		obj.setPrev(prev);
		obj.setProx(item);
		tail = item;
	}
	
	
	private void remove(LinkedNode item) {
		if (head == null)
			return;
		
		LinkedNode obj = head;
		LinkedNode prev = null;
		
		while (true) {
			if (obj.equals(item)) {
				break;
			}
			prev = obj;
			if (obj.getProx() == null)
				return; // not found
			
			obj = obj.getProx();
		}
		
		LinkedNode prox = obj.getProx();
		
		if (prev != null) {
			prev.setProx(obj.getProx());
		}
		else { // first item
			if (prox==null) {
				head = null;
				tail = null;
			}
			else {
				prox.setPrev(null);
				head = prox;
			}
			return;
		}
		
		
		
		if (prox != null) {
			prox.setPrev(prev);
		}
		else { // last item
			prev.setProx(null);
			tail = prev;
		}
	}
	
	private void list() {
		if (head == null)
			return;
		LinkedNode obj = head;
		System.out.println("content: "+obj.getData());
		
		while (obj.getProx() != null) {
			obj = obj.getProx();
			System.out.println("content: "+obj.getData());
		}
		
	}
	
	private void listFromTail() {
		if (tail == null)
			return;
		LinkedNode obj = tail;
		System.out.println("content: "+obj.getData());
		
		while (obj.getPrev() != null) {
			obj = obj.getPrev();
			System.out.println("content: "+obj.getData());
		}
	}
	
	public static void main(String[] args) {
		LinkedNodeDriver driver = new LinkedNodeDriver();
		LinkedNode obj = new LinkedNode("C");
		driver.setFirst(obj);
		LinkedNode obj1 = new LinkedNode("B");
		driver.add(obj1);
		LinkedNode obj2 = new LinkedNode("N");
		driver.add(obj2);
		LinkedNode obj3 = new LinkedNode(" ");
		driver.add(obj3);
		LinkedNode obj4 = new LinkedNode("R");
		driver.add(obj4);
		LinkedNode obj5 = new LinkedNode("a");
		driver.add(obj5);
		LinkedNode obj6 = new LinkedNode("y");
		driver.add(obj6);
		
		// now list
		driver.list();
		System.out.println("");
		driver.listFromTail();
		
		// delete
		System.out.println("");
		LinkedNode obj10 = new LinkedNode("v");
		driver.remove(obj6);
		driver.list();
		System.out.println("");
		driver.listFromTail();
		
		System.out.println("");
		LinkedNode obj11 = new LinkedNode("l");
		driver.setFirst(obj11);
		driver.list();
		driver.remove(obj11);
		driver.list();
		driver.listFromTail();
	}
}
