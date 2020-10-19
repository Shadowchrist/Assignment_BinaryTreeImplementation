package binarysearchtree;

public class ImplementBST<K extends Comparable<K>> {
	
	private BinaryNode<K> root;
	
	public void add(K key) {
		this.root = addNodeRecursively(root, key);
	}

	private BinaryNode<K> addNodeRecursively(BinaryNode<K> current, K key) {
		if (current == null)
			return new BinaryNode<K>(key);
		int compareOutput = key.compareTo(current.key);
		if (compareOutput == 0)
			return current;

		if (compareOutput < 0)
			current.left = addNodeRecursively(current.left, key);
		else if (compareOutput > 0)
			current.right = addNodeRecursively(current.right, key);
		return current;
	}
	
	public int size() {
		return this.getHeight(root);
	}

	private int getHeight(BinaryNode<K> root) {
		if(root==null)
			return 0;
		return Math.max(1+getHeight(root.left), 1+getHeight(root.right));
	}
}
