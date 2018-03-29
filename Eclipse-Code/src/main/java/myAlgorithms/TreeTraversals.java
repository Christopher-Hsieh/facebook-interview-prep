package myAlgorithms;

import CtCILibrary.TreeNode;

public class TreeTraversals {

	public static void inOrder(TreeNode node) {
		/*
		 * Left
		 * node
		 * Right
		 * 
		 * Searched smallest to largest
		 */
		
		if (node != null) {
			inOrder(node.left);
			System.out.println(node.data);
			inOrder(node.right);
		}
	}
	
	public static void preOrder(TreeNode node) {
		/*
		 * Node
		 * Left
		 * Right
		 * 
		 * Check the root first
		 */
		if (node != null) {
			System.out.println(node.data);
			preOrder(node.left);
			preOrder(node.right);
		}
	}
	
	public static void postOrder(TreeNode node) {
		/*
		 * Right
		 * Left
		 * Node
		 * 
		 * Root is always last visited
		 */
		if (node != null) {
			postOrder(node.right);
			postOrder(node.left);
			System.out.println(node.data);
		}
	}
	
	public static void printAllTraversals(TreeNode n) {
		System.out.println("-- InOrder --");
		inOrder(n);
		System.out.println("-------------");
		
		System.out.println("-- PreOrder --");
		preOrder(n);
		System.out.println("--------------");
		
		System.out.println("-- PostOrder --");
		postOrder(n);
		System.out.println("---------------");
	}
}
