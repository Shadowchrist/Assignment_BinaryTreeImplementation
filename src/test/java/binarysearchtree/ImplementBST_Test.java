package binarysearchtree;

import static org.junit.Assert.*;

import org.junit.Test;

public class ImplementBST_Test {
	
	@Test
	public void given3Numbers_WhenAddedToBinaryTree_ShouldReturnSizeThree() {
		ImplementBST bst = new ImplementBST();
		bst.add(56);
		bst.add(30);
		bst.add(70);
		
		assertEquals(2, bst.size());
	}
}
