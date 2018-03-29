package trie;

import java.util.Set;

public class Trie {

	private TrieNode root;
	
	public TrieNode getRoot() {
		return this.root;
	}
	
	public Trie() {
		this.root = new TrieNode();
	}
	
	public boolean find(String string) {
		char[] charArray = string.toCharArray();
		TrieNode trieNode = this.root;
		for (int i = 0; i < charArray.length; i++) {
			if (trieNode.getChildren().containsKey(charArray[i])) {
				trieNode = trieNode.getChildren().get(charArray[i]);
			} else {
				return false;
			}
		}
		return true;
	}

	
	public void remove(String string) {
//		char[] charArray = string.toCharArray();
//		TrieNode trieNode = this.root;
//		
//		MyStack stack = new MyStack();
//		
//		for (int i = 0; i < charArray.length; i++) {
//			if (trieNode.getChildren().containsKey(charArray[i])) {
//				trieNode = trieNode.getChildren().get(charArray[i]);
//				stack.push(new Node(trieNode));
//			} else {
//				System.out.println("Error removing " + string + "could not find all of it");
//				return;
//			}
//		}
//		
//		int stackSize = stack.size();
//		
//		// TODO 
//		for (int i = 0; i < stackSize; i++){
//			trieNode = (TrieNode) stack.pop().data;
//			if (trieNode.isWord() == true) {
//				return;
//			}
//		}
	}

	public void add(String string) {
		//pie
		TrieNode trieNode = root;
		char[] chars = string.toCharArray();
		
		for (int i = 0; i < chars.length; i++) {
			if (isCharInNode(trieNode, chars[i])) {
				trieNode = trieNode.getChildren().get(chars[i]);
			}
			else {
				trieNode = addChildNode(trieNode, chars[i]);
			}
		}
		trieNode.setIsWord(true);
	}
	
	public TrieNode addChildNode(TrieNode trieNode, char c) {
		TrieNode newTrieNode = new TrieNode(Character.toString(c));
		trieNode.getChildren().put(c, newTrieNode);
		return newTrieNode;
	}

	public boolean isCharInNode(TrieNode trieNode, char c) {
		Set<Character> children = trieNode.getChildren().keySet();
		if (children.contains(c)) {
			return true;
		}
		return false;
	}
	
	public void printTrie(TrieNode trieNode, int depth, String parent, Character lastKey) {
		Set<Character> keys = trieNode.getChildren().keySet();

		
		if (depth == 0) {
			System.out.println("");
		}
		
		System.out.println(depth + " Key: " + Character.toString(lastKey) + "  Parent: " + parent );
		if (trieNode.isWord()) {
			System.out.println("Is a word");
		}
		
		for (Character key : keys) {
			printTrie(trieNode.getChildren().get(key), depth + 1, parent.concat(Character.toString(key)), key);
		}
	}
}
