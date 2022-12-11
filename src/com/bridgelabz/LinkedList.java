package com.bridgelabz;

/***
 * 
 * @param args
 */

public class LinkedList {
	Node head;

	/***
	 * 
	 * @author Admin
	 *
	 */
	class Node {
		Object data;
		Node reference;

		Node(Object data) {
			this.data = data;
		}
	}

	/***
	 * 
	 * @param data
	 */
	public void addFirst(Object data) {
		Node newNode = new Node(data);
		newNode.reference = head;
		head = newNode;
	}

	/*
	 * Method for displaying the added elements
	 */
	public void display() {
		if (head == null)
			System.out.println("List is empty");
		else {
			Node temp = head;
			while (temp != null) {
				if (temp.reference != null) {
					System.out.print(temp.data + "=>");
				} else
					System.out.println(temp.data);
				temp = temp.reference;
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to the Linked List program");
		LinkedList list = new LinkedList();
		list.addFirst(70);
		list.display();
		list.addFirst(30);
		list.display();
		list.addFirst(56);
		list.display();
	}

}
