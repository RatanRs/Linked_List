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
	public void elements(Object data) {
		Node newNode = new Node(data);
		System.out.print(newNode.data + " ");
	}
	/*
	 * Method to add elements at first
	 */
	public void addFirst(Object data) {
		Node newNode = new Node(data);
		newNode.reference = head;
		head = newNode;
	}
	/*
	 * Method to add elements at last 
	 */
	public void addLast(Object data) {
		Node newNode = new Node(data);
		Node temp=head;
		if(head==null)
			head=newNode;
		else {
			
		while(temp.reference!=null) {
			temp=temp.reference;
		}
		temp.reference=newNode;
		}
	}
	/*
	 * Method to  displaying the added elements
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
		System.out.println("Printing nodes at First");
		list.addFirst(70);
		list.display();
		list.addFirst(30);
		list.display();
		list.addFirst(56);
		list.display();
		System.out.println("-----------------");
		System.out.println("Printing nodes at last");
		list.addLast(56);
		list.display();
		list.addLast(30);
		list.display();
		list.addLast(70);
		list.display();
	}

}