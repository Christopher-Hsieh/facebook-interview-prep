package stack;

import node.Node;

public class MyStack {
	
	private int size = 0;
	Node head = null;
	
	public void push(Node n) {
		if (head == null) {
			head = n;
		}
		else {
			head.right = n;
			n.left = head;
			head = n;
		}
		size++;
	}
	
	public Node pop() {
		if (head == null) {
			return null;
		}
		
		Node temp = head;
		size--;
		if (head.left == null) {
			head = null;
			return temp;
		}
		head = head.left;
		head.right = null;
		return temp;
	}
	
	public Node peek() {
		return head;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		if (size == 0 || head == null) return true;
		return false;
	}
	
	// print
	public void printStack() {
		if (size == 0) {
			System.out.println("Stack is empty");
			return;
		}
		Node temp = head;
		for (int i = size; i > 0; i--) {
			System.out.println("Position: " + i + " Data: " + temp.data);
			temp = temp.left;
		}
	}
}
