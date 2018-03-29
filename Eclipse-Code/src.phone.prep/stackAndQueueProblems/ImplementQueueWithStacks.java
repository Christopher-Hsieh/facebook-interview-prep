package stackAndQueueProblems;

import node.Node;
import stack.MyStack;

public class ImplementQueueWithStacks {
	private MyStack stackOne = new MyStack(); // push pop
	private MyStack stackTwo = new MyStack(); // push pop
	
	
	//push into stack one
	public void enqueue(Node n) {
		stackOne.push(n);
	}


	public Node dequeue() {
		if (stackOne.size() == 0 && stackTwo.size() == 0) {
			return new Node("null");
		}
		// Check if stackTwo is empty
		if (stackTwo.size() == 0) {
			// if stackTwo empty => pop all of stack one into stack two, return the last element in stack one
			int size = stackOne.size();
			for (int i = 0; i < size; i++) {
				stackTwo.push(stackOne.pop());
			}
			return stackTwo.pop();
		}
		// else pop stackTwo and return popped element
		return stackTwo.pop();
	}
	
	public void printBothStacks() {
		MyStack stack1 = stackOne;
		MyStack stack2 = stackTwo;
		
		System.out.println("\nStackOne");
		while (stack1.size() > 0) {
			System.out.println(stack1.pop().data);
		}
		System.out.println("\nStackTwo");
		while (stack2.size() > 0) {
			System.out.println(stack2.pop().data);
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementQueueWithStacks queue = new ImplementQueueWithStacks();
		System.out.println("Enqueued 1 2 3");
		queue.enqueue(new Node(1));
		queue.enqueue(new Node(2));
		queue.enqueue(new Node(3));

		
		System.out.println("Dequeue Single Test");
		System.out.println(queue.dequeue().data);
		queue.enqueue(new Node(4));
		queue.printBothStacks();
		System.out.println("Dequeue all test");
		System.out.println(queue.dequeue().data);
		System.out.println(queue.dequeue().data);
		System.out.println(queue.dequeue().data);
		System.out.println(queue.dequeue().data);
		
		System.out.println("Enqueue String test");
		queue.enqueue(new Node("I am a node"));
		
		System.out.println(queue.dequeue().data);
	}
}
