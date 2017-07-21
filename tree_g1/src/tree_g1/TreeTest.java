package tree_g1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TreeTest {

	@Test
	public void testEmpty() {
		Tree<Character> tree = new Tree<Character>(null);
		assertEquals("", tree.deepDownString());
	}
	
	@Test
	public void testDeepDown() {
		Node<Character> root = new Node<Character>('a');
		Node<Character> b = new Node<Character>('b');
		Node<Character> c = new Node<Character>('c');
		Node<Character> d = new Node<Character>('d');
		Node<Character> e = new Node<Character>('e');
		Node<Character> f = new Node<Character>('f');
		Node<Character> g = new Node<Character>('g');
		
		root.setNextLeft(b);
		root.setNextRight(c);
		b.setNextLeft(d);
		b.setNextRight(e);
		c.setNextLeft(f);
		c.setNextRight(g);
		Tree<Character> tree = new Tree<Character>(root);
		
		assertEquals("abdecfg", tree.deepDownString());
	}
	
	@Test
	public void testRunWidth() {
		Node<Character> root = new Node<Character>('a');
		Node<Character> b = new Node<Character>('b');
		Node<Character> c = new Node<Character>('c');
		Node<Character> d = new Node<Character>('d');
		Node<Character> e = new Node<Character>('e');
		Node<Character> f = new Node<Character>('f');
		Node<Character> g = new Node<Character>('g');
		
		root.setNextLeft(b);
		root.setNextRight(c);
		b.setNextLeft(d);
		b.setNextRight(e);
		c.setNextLeft(f);
		c.setNextRight(g);
		Tree<Character> tree = new Tree<Character>(root);
		
		assertEquals("abcdefg", tree.runWidth());
	}
	
	@Test
	public void testAddDown() {
		Tree<Character> tree = new Tree<Character>();
		tree.add('a');
		tree.add('b');
		tree.add('c');
		tree.add('d');
		tree.add('e');
		
		assertEquals("abcde", tree.deepDownString());
	}
	
	
	
	@Test
	public void testDeepDownIterator() {
		Tree<Character> tree = new Tree<Character>();
		tree.add('a');
		tree.add('b');
		tree.add('c');
		tree.add('d');
		tree.add('e');
		tree.add('f');
		tree.add('g');
		tree.add('h');
		StringBuilder sb = new StringBuilder();
		for(Character c: tree.getIteratorDown()){
			sb.append(c);
		}
		
		assertEquals("abcdefgh", sb.toString());
	}
	
	@Test
	public void testWidthIterator() {
		Tree<Character> tree = new Tree<Character>();
		tree.add('a');
		tree.add('b');
		tree.add('c');
		tree.add('d');
		tree.add('e');
		tree.add('f');
		tree.add('g');
		tree.add('h');
		StringBuilder sb = new StringBuilder();
		for(Character c: tree.getIteratorWidth()){
			sb.append(c);
		}
		
		assertEquals("abcdefgh", sb.toString());
	}

}
