package com.bridgelabz;
/***
 * 
 * @param args
 */

public class LinkedList {
	Node head;

	class Node {
		Object data;
		Node reference;
		
		Node(Object data) {
			this.data = data;
		}
	}
	
	public void add(Object data) {
		Node newNode = new Node(data);
		System.out.print(newNode.data+" ");
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to the Linked List program");
		LinkedList list =new LinkedList();
		list.add(56);
		list.add(30);
		list.add(70);
	}

}



