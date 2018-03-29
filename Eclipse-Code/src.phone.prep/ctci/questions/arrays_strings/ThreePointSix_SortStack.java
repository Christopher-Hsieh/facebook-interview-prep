package ctci.questions.arrays_strings;

import node.Node;
import stack.MyStack;

public class ThreePointSix_SortStack {
	/*
	 * Sort stack in ascending order (biggest on top)
	 * Only allowed to use one additional stack
	 * Operations are push(), pop(), peek(), isEmpty()
	 */
	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push(new Node(1));
		stack.push(new Node(3));
		stack.push(new Node(6));
		stack.push(new Node(2));
		System.out.println("--- Stack before ---");
		stack.printStack();
		System.out.println("--------------------");
		
		stack = sortStack(stack);
		
		System.out.println("--- Stack after ---");
		stack.printStack();
		System.out.println("--------------------");
	}
	public static MyStack sortStack(MyStack bigStack) {
		Node smallest = null;
		Node biggest = null;
		MyStack smallStack = new MyStack();
		int numBig = 0;
		int numSmall = 0;
		int total = 0;
		
		while(!bigStack.isEmpty()) {
			smallStack.push(bigStack.pop());
			total++;
		}
		
		System.out.println("total: " + total);
		
		while (numSmall + numBig < total) {
			
		}
		
		return bigStack;
		
	}
	
//	public static Node getBig() {
//		
//	}
	
//	public static Node getSmall(MyStack bigStack, MyStack smallStack, int numSmall, int total) {
//		Node smallest = new Node(1000000);
//		for (int i = 0; i < total - numSmall; i++) {
//			Node temp = smallStack.pop();
//			if (temp.data < smallest.data) {
//				smallest = temp;
//			}
//		}
//		return null;
//		
//	}
}
