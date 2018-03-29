package node;

public class Node {
	public Object data;
	public Node left;
	public Node right;
	
	public Node(Object data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
	
	public char c;
	public Node next;
	
	public Node(char c) {
		this.c = c;
		this.left = null;
		this.right = null;
		this.next = null;
	}
}
