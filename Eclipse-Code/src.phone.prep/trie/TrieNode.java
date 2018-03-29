package trie;

import java.util.HashMap;

public class TrieNode {
    private HashMap<Character, TrieNode> children;
    private String text;
    private boolean isWord;

    public TrieNode() {
        children = new HashMap<Character, TrieNode>();
        text = "";
        isWord = false;
    }

    public TrieNode(String text) {
        this();
        this.text = text;
    }

    public HashMap<Character, TrieNode> getChildren() {
        return children;
    }

    public String getText() {
        return text;
    }

    public boolean isWord() {
        return isWord;
    }

    public void setIsWord(boolean word) {
        isWord = word;
    }

    @Override
    public String toString() {
        return text;
    }
}