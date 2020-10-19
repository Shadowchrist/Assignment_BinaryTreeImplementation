package binarysearchtree;

import static org.junit.Assert.*;

import org.junit.Test;

public class ImplementBST_Test {
	
	@Test
	public void ThreeNumbersPushedIntoTheBST() {
		ImplementBST bst = new ImplementBST();
		bst.add(56);
		bst.add(30);
		bst.add(70);
		assertEquals(3, bst.size(bst.getRoot()));
		assertEquals(2, bst.getHeight(bst.getRoot()));
	}
	
	@Test
	public void ThirteenNumbersPushedIntoTheBST() {
		ImplementBST bst = new ImplementBST();
		bst.add(56);
		bst.add(30);
		bst.add(70);
		bst.add(3);
		bst.add(11);
		bst.add(16);
		bst.add(22);
		bst.add(63);
		bst.add(67);
		bst.add(95);
		bst.add(60);
		bst.add(40);
		bst.add(65);
		assertEquals(13, bst.size(bst.getRoot()));
		assertEquals(6, bst.getHeight(bst.getRoot()));
	}
	
	@Test
	public void SearchForElementInTheBST() {
		ImplementBST bst = new ImplementBST();
		bst.add(56);
		bst.add(30);
		bst.add(70);
		bst.add(3);
		bst.add(11);
		bst.add(16);
		bst.add(22);
		bst.add(63);
		bst.add(67);
		bst.add(95);
		bst.add(60);
		bst.add(40);
		bst.add(65);
		BinaryNode result=bst.searchElement(bst.getRoot(),63);
		assertEquals(result.key,63);
	}
}
