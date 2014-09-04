package junit;

import static org.junit.Assert.*;
import tree.BinaryTree;

import org.junit.Test;

public class TestBinaryTree {

	@Test
	public void test() {
		BinaryTree theTree = new BinaryTree();

		theTree.addNode(50, "Boss");

		theTree.addNode(25, "Vice President");

		theTree.addNode(15, "Office Manager");

		theTree.addNode(30, "Secretary");

		theTree.addNode(75, "Sales Manager");

		theTree.addNode(85, "Salesman 1");



		assertEquals("Sales Manager has the key 75", theTree.findNode(75).toString());
	}

}
