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
	
	public int size(BinaryNode<K> root) {
		return (root == null) ? 0 : 1 + size(root.left) + size(root.right);
	}

	public int getHeight(BinaryNode<K> root) {
		return (root == null) ? 0 : 1+Math.max(getHeight(root.left),getHeight(root.right));
	}
	
	public BinaryNode<K> getRoot() {
		return root;
	}

	public void setRoot(BinaryNode<K> root) {
		this.root = root;
	}
	
	public BinaryNode<K> searchElement(BinaryNode<K> root, K search)
	{
		if(root==null || root.key==search)
			return root;
		else if(root.key.compareTo(search)<0)
			return searchElement(root.left,search);
		return searchElement(root.right,search);	
	}
}
