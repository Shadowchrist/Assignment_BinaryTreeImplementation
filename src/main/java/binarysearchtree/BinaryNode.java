package binarysearchtree;

public class BinaryNode<K extends Comparable<K>> {
	public K key;
	public BinaryNode<K> left;
	public BinaryNode<K> right;
	
	public BinaryNode(K key)
	{
		setKey(key);
		setLeft(null);
		setRight(null);
	}

	public BinaryNode<K> getLeft() {
		return left;
	}

	public void setLeft(BinaryNode<K> left) {
		this.left = left;
	}

	public BinaryNode<K> getRight() {
		return right;
	}

	public void setRight(BinaryNode<K> right) {
		this.right = right;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}	
}