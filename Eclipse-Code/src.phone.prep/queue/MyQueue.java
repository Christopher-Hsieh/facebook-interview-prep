package queue;

import node.Node;

public class MyQueue {
	
	private int size = 0;
	Node first, last = null;
	
	// Enqueue
	public void enqueue(Node n) {
		size++;
		if (first == null) {
			first = n;
			last = first;
		}
		last.right = n;
		n.left = last;
		last = n;
	}
	
	// Dequeue
	public Node dequeue() {
		if (first == null) {
			return null;
		}
		
		size--;
		Node temp = first;
		
		if (first.right == null) {
			last = null;
			first = null;
			return temp;
		}
		
		first = first.right;
		first.left = null;
		return temp;
	}
	
	// Size
	public int size() {
		return this.size;
	}
	
	// print
	public void printQueue() {
		if (first == null || last == null) {
			System.out.println("Queue is empty");
			return;
		}
		
		Node temp = last;
		for (int i = 0; i < size; i++) {
			System.out.println("i: " + i + " Data: " + temp.data);
			temp = temp.left;
		}
	}
}
