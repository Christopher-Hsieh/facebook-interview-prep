package stack;

import node.Node;

public class MyStackTest {
	public static void main(String[] args) {

		MyStack stack = new MyStack();
		
		System.out.println("Push Test");
		stack.push(new Node(1));
		stack.push(new Node(2));
		stack.push(new Node(3));
		stack.printStack();
		
		System.out.println("Pop Single Test");
		stack.pop();
		stack.printStack();
		
		System.out.println("Pop all test");
		System.out.println("Popped: " + stack.pop().data);
		System.out.println("Popped: " + stack.pop().data);
		try {
				System.out.println("Popped: " + stack.pop().data);
		} catch (NullPointerException e) {
			System.out.println("Popped: null");
		}
		stack.printStack();
		
		System.out.println("Push String test");
		stack.push(new Node("I am a node"));
		
		stack.printStack();
	}
}
