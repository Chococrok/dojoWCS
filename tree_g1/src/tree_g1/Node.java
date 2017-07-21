package tree_g1;

public class Node<T> {

	private T data;
	private Node<T> nextLeft;
	private Node<T> nextRight;
	
	
	public Node(T data) {
		
		this.data = data;
	}

	public Node(T data, Node<T> nextLeft, Node<T> nextRight) {
		
		this.data = data;
		this.nextLeft = nextLeft;
		this.nextRight = nextRight;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node<T> getNextLeft() {
		return nextLeft;
	}

	public void setNextLeft(Node<T> nextLeft) {
		this.nextLeft = nextLeft;
	}

	public Node<T> getNextRight() {
		return nextRight;
	}

	public void setNextRight(Node<T> nextRight) {
		this.nextRight = nextRight;
	}
	
	public boolean hasNextLeft(){
		return nextLeft != null;
	}
	
	public boolean hasNextRight(){
		return nextRight != null;
	}

	
	
}
