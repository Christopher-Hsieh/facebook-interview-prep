package queue;

import node.Node;

public class MyQueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyQueue queue = new MyQueue();
		System.out.println("Enqueue Test");
		queue.enqueue(new Node(1));
		queue.enqueue(new Node(2));
		queue.enqueue(new Node(3));
		queue.printQueue();
		
		System.out.println("Dequeue Single Test");
		queue.dequeue();
		queue.printQueue();
		
		System.out.println("Dequeue all test");
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.printQueue();
		
		System.out.println("Enqueue String test");
		queue.enqueue(new Node("I am a node"));
		
		queue.printQueue();
	}

}
