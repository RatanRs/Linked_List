package com.bridgelabz;

import java.util.Scanner;

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
		Node temp = head;
		if (head == null)
			head = newNode;
		else {

			while (temp.reference != null) {
				temp = temp.reference;
			}
			temp.reference = newNode;
		}
	}

	public void addAtPosition(Object data, int position) {
		int index = 0;
		Node newNode = new Node(data);
		Node left = head;
		Node right = left.reference;

		while (index < (position - 1)) {

			left = left.reference;
			right = right.reference;
			index++;
		}

		newNode.reference = right;
		left.reference = newNode;
	}

	public void deleteFirst() {
		head = head.reference;
	}

	public void deleteLast() {

		if (head == null)
			System.out.println("Linked List is Empty");
		else if (head.reference == null)
			head = null;
		else {
			Node temp = head;
			while (temp.reference.reference != null) {
				temp = temp.reference;
			}
			temp.reference = null;
		}
	}

	/*
	 * Method to search elements
	 */
	public Object searchElement(Object input) {
		Node temp = head;
		int index = 0;
		while (temp != null) {
			index++;
			if (temp.data == input) {

				String res = temp.data + " found at index " + index;

				return res;
			}
			temp = temp.reference;
		}
		return null;
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
		Scanner input = new Scanner(System.in);
		list.addFirst(56);
		list.display();
		list.addLast(70);
		list.display();
		list.addFirst(126);
		list.display();
		list.addLast(99);
		list.display();
		list.addFirst(236);
		list.display();
		list.addLast(10);
		list.display();
		// System.out.println("Enter position after which you want to add node: ");
		System.out.println("Enter position at which you want to add node: ");
		int position = input.nextInt();
		list.addAtPosition(30, position);
		list.display();
		list.deleteFirst();
		list.display();
		list.deleteLast();
		list.display();
		System.out.println("Enter element to search in linked list: ");
		int element = input.nextInt();
		System.out.println(list.searchElement(element));
	}

}