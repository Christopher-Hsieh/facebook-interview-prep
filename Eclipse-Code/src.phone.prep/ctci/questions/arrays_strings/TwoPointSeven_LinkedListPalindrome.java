package ctci.questions.arrays_strings;

import java.util.ArrayList;

import node.Node;

public class TwoPointSeven_LinkedListPalindrome {
	public static void main(String[] args) {
		Node head = new Node('m');
		head.next = new Node('a');
		head.next.next = new Node('d');
		head.next.next.next = new Node('a');
		head.next.next.next.next = new Node('m');
		
		System.out.println(isPalindrome(head));
		
		Node head2 = new Node('m');
		head2.next = new Node('a');
		head2.next.next = new Node('d');
		head2.next.next.next = new Node('d');
		head2.next.next.next.next = new Node('a');
		head2.next.next.next.next.next = new Node('m');
		
		System.out.println(isPalindrome(head2));
	}

	private static boolean isPalindrome(Node head) {
		Node walker = head;
		Node runner = head;
		ArrayList<Character> chars = new ArrayList<Character>();
		while (true) {
			chars.add(walker.c);
			walker = walker.next;
			if (runner.next == null || runner.next.next == null) {
				break;
			}
			runner = runner.next.next;
		}
		
		//runner = head;
		int i = 1;
		while (true) {
			System.out.println("chars.get(chars.size() - i++) " + chars.get(chars.size() - i) + " walker.c " + walker.c);
			if (chars.get(chars.size() - i++) != walker.c) return false;
			if (walker.next != null) {
				walker = walker.next;
			}
			else {
				break;
			}
		}
		
		return true;
	}
}
