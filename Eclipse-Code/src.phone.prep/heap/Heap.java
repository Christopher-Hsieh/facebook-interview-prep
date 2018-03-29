package heap;

import node.Node;

public class Heap {
	/*	Step 1 − Create a new node at the end of heap.
	 *	Step 2 − Assign new value to the node.
	 *	Step 3 − Compare the value of this child node with its parent.
	 *	Step 4 − If value of parent is less than child, then swap them.
	 *	Step 5 − Repeat step 3 & 4 until Heap property holds.
	*/
	
	Node root;
	
	public void insert(Node node) {
		if (root == null) {
			root = node;
			return;
		}
		
		
		
	}
}
