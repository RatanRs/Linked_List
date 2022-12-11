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
	 * Method to insert elements..2
	 */
	public void insertElement(Object input, Object value) {
		Node newNode = new Node(value);
		Node temp = head;

		int index = 0;
		while (temp.data != input) {
			index++;
			temp = temp.reference;
		}
		Node left = head;
		Node right = left.reference;
		int index1 = 0;
		while (index1 < index) {
			index1++;
			left = left.reference;
			right = right.reference;
		}
		newNode.reference = right;
		left.reference = newNode;
	}

	public void deleteAtPosition(Object data) {
		int index = 0;
		Node left = head;
		Node right = left.reference;
		while (right.data != data) {
			left = left.reference;
			right = right.reference;
			index++;
		}
		left.reference = right.reference;

	}

	/*
	 * Method for displaying the added elements
	 */
	public Object display() {
		int values = 0;
		Node temp = head;
		while (temp != null) {
			values++;
			if (temp.reference != null)
				System.out.print(temp.data + " > ");
			else
				System.out.println(temp.data);
			temp = temp.reference;
		}
		return "The size of list: " + values;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to the Linked List program");
		LinkedList list = new LinkedList();
		Scanner input = new Scanner(System.in);
		list.addFirst(56);
		list.addLast(30);
		list.addLast(40);
		list.addLast(70);
		list.display();
        list.deleteAtPosition(40);
		System.out.println(list.display());
	}

}