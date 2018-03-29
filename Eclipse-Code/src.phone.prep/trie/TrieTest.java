package trie;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class TrieTest {
	    private Trie trie;

	    @Before
	    public void setUp() {
	        trie = new Trie();
	        trie.add("at");
	        trie.add("hello");
	        trie.add("been");
	        trie.add("yes");
	        trie.add("water");
	        trie.add("be");
	        trie.add("attire");
	        
	    }

	    @Test
	    public void testInsert() {
	    	trie.printTrie(trie.getRoot(), 0, "", ' ');
	        assertTrue(trie.find("water"));
	        assertTrue(trie.find("at"));
	        assertFalse(trie.find("Beat"));
	        assertFalse(trie.find("Test"));

	        trie.remove("water");
	        assertFalse(trie.find("water"));
	    }

	    //@Test
	    public void testDelete() {

	        assertTrue(trie.find("Hello"));
	        assertTrue(trie.find("at"));
	        trie.remove("Hello");
	        trie.remove("at");
	        assertFalse(trie.find("Hello"));
	        assertFalse(trie.find("at"));
	    }
	
}
