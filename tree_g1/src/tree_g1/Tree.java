package tree_g1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Tree<T> {
	
	private Node<T> root;
	private IteratorDown iteratorDown = new IteratorDown();
	private IteratorWidth iteratorWidth = new IteratorWidth();
	
	//Constructors
	
	public Tree() {}

	public Tree(Node<T> root) {
		
		this.root = root;
	}
	
	//Getters and Setters
	
	public IteratorDown getIteratorDown() {
		return iteratorDown;
	}
	
	public IteratorWidth getIteratorWidth() {
		return iteratorWidth;
	}
	
	public void add(T data){
		if(root ==null){
			root = new Node<T>(data);
			return;
		}
		Node<T> node = this.getLastNode();
		if(node.hasNextLeft()){
			node.setNextRight(new Node<T>(data));
			return;
		}
		node.setNextLeft(new Node<T>(data));
		
	}

	public Node<T> getLastNode(){
		Node<T> node = root;
		
		while(true){
			if(!node.hasNextRight() || !node.hasNextLeft()){
				return node;
			} else{
				node = node.getNextRight();
			}
		}
	}
	
	
	public String deepDownString(){
		
		Node<T> node = root;
		if (root==null){
			return "";
		}
		Stack<Node <T>>lifo = new Stack<Node<T>>();
		StringBuilder stringBuilder = new StringBuilder();		
		
		lifo.push(node);
		
		while(!lifo.isEmpty()){
			node = lifo.pop();
			stringBuilder.append(node.getData());
			
			if(node.hasNextRight()){
				lifo.push(node.getNextRight());
			}
			if(node.hasNextLeft()){
				lifo.push(node.getNextLeft());
			}
			
		}
		return stringBuilder.toString();
		
	}
	
	public String runWidth(){
		Node<T> node = root;
		if (root==null){
			return "";
		}
		Queue<Node <T>>fifo = new LinkedList<Node<T>>();
		StringBuilder stringBuilder = new StringBuilder();
		
		fifo.add(node);

		while(!fifo.isEmpty()){
			node = fifo.poll();
			stringBuilder.append(node.getData());
			
			
			if(node.hasNextLeft()){
				fifo.add(node.getNextLeft());
			}
			
			if(node.hasNextRight()){
				fifo.add(node.getNextRight());
			}
			
			
		}
		return stringBuilder.toString();
	}
	
	
	private class IteratorDown implements Iterable<T>, Iterator<T>{
		
		Node<T> currentNode = null;
		Stack<Node <T>> mLifo = new Stack<Node<T>>();

		@Override
		public Iterator<T> iterator() {
			if(root != null){
				mLifo.push(root);
			}
			// TODO Auto-generated method stub
			return this;
		}
	
		@Override
		public boolean hasNext() {
			if(mLifo.isEmpty()){
				return false;
			}
			currentNode = mLifo.pop();		
			if(currentNode.hasNextRight()){
				mLifo.push(currentNode.getNextRight());
			}
			if(currentNode.hasNextLeft()){
				mLifo.push(currentNode.getNextLeft());
			}
			return true;
		}
	
		@Override
		public T next() {
			return this.currentNode.getData();
		}
	}
	
private class IteratorWidth implements Iterable<T>, Iterator<T>{
		
		Node<T> currentNode = null;
		Queue<Node <T>>mFifo = new LinkedList<Node<T>>();

		@Override
		public Iterator<T> iterator() {
			if(root != null){
				mFifo.add(root);
			}
			// TODO Auto-generated method stub
			return this;
		}
	
		@Override
		public boolean hasNext() {
			if(mFifo.isEmpty()){
				return false;
			}
			currentNode = mFifo.poll();		
			if(currentNode.hasNextLeft()){
				mFifo.add(currentNode.getNextLeft());
			}
			if(currentNode.hasNextRight()){
				mFifo.add(currentNode.getNextRight());
			}
			return true;
		}
	
		@Override
		public T next() {
			return this.currentNode.getData();
		}
	}
}
