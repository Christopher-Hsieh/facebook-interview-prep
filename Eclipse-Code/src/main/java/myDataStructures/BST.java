package myDataStructures;

import CtCILibrary.AssortedMethods;
import CtCILibrary.TreeNode;

public class BST {

	// Insert
	// Find
	// Delete
	
	// CTCI 4.11 get Random node, node returned is of equal likely hood of all others
	TreeNode root;
	int size;
	
	public BST() {
		this.root = null;
		this.size = 0;
	}
	
	/*
	 * Get random node
	 */
	public int getRandom() {
		//int height = root.height();
		int nodeToFind = AssortedMethods.randomIntInRange(0, size);
		found = false;
		return findRandomNode(root, nodeToFind, 0);
	}
	
	boolean found = false;
	
	public int findRandomNode(TreeNode n, int rnd, int counter) {
		if (rnd <= counter || (n.left == null && n.right == null)) {
			found = true;
			return n.data;
		}
		int count = counter;
		if (n.left != null && n.right != null) {
			int direction = AssortedMethods.randomIntInRange(0, 1);
			if (direction == 0) {
				count = findRandomNode(n.left, rnd, counter++);
			}
			else {
				count = findRandomNode(n.right, rnd, counter++);
			}
			if (found == true) {;
				return count;
			}
		}
		else if (n.left != null) {
			count = findRandomNode(n.left, rnd, counter++);
			if (found == true) {;
				return count;
			}
		}
		
		else if (n.right != null) {
			count = findRandomNode(n.right, rnd, counter++);
			if (found == true) {;
				return count;
			}
		}
		
		return -1;
	}
	
	/*
	 * Delete
	 */
	
	
	/*
	 * Find
	 */
	public void find(int d) {
		System.out.println("");
		finder(root, d);
	}
	
	private void finder(TreeNode node, int d) {
		if (node != null) {
			if (node.data == d) {
				System.out.print("Found it: " + d);
				return;
			}
			System.out.print(node.data+"=>");
			if (d <= node.data) {
				if (node.left == null) System.out.print(" "+ d +" Not Found");
				else {
					finder(node.left, d);
				}
			}
			else if (d > node.data) {
				if (node.right == null) System.out.print("Not Found");
				else {
					finder(node.right, d);
				}
			}
		}
	}

	/*
	 * Insert
	 */
	public void insert(int d){
		size++;
		insert(new TreeNode(d));
	}
	
	public void insert(TreeNode node) {
		if (root == null) 
			root = node;
		else {
			insertInOrder(root, node.data);
		}
	}
	
	public void insertInOrder(TreeNode n, int d) {
		if (n.data >= d) {	// Traverse or insert left
			if (n.left == null) {
				n.left = new TreeNode(d);
			}
			else {
				insertInOrder(n.left, d);
			}
		}
		else { // Traverse or insert right
			if (n.right == null) {
				n.right = new TreeNode(d);
			}
			else {
				insertInOrder(n.right, d);
			}
		}
	}
	
	
}
