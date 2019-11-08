/**
 * 
 */
package binarytree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class TestMain {

	static Queue<Node> q = new ArrayDeque<>();
	static List<Integer> list = new ArrayList<Integer>();
	/* This is a Binary Search Tree: every node value is greater than node's value in left subtree.
	 * 			6
	 * 		  __|__
	 *       4	   8
	 *     __|__  __|__
	 *     3   5  7   9
	 */
	public static void main(String[] args) {
		BinaryTree bst = new BinaryTree();
		// 1. Insert elements
		insertElements(bst);
		
		// 2. Find an element.
//		boolean contains = containsValue(bst, 10);
//		System.out.println("contains:" + 10 + contains);
		
		Node root = bst.getRoot();
		Queue<Node> q = new ArrayDeque<Node>();
		q.add(root);
		
		// 3. print elements in insertion order
//		pollNodesOfBST(q);
		
		// 4. Print elements in in-order small-parent-big
//		inOrder(root);
//		for (Integer integer : list) {
//			System.out.println(integer);
//		}
		
		// 5. Deleting an element from Tree
		delete(bst, 5);
	}

	private static void delete(BinaryTree bst, int value) {
		bst.deleteRecursive(bst.getRoot(), value);
	}

	private static boolean containsValue(BinaryTree bst, int i) {
		return bst.containsRecursive(bst.getRoot(), i);
	}

	// DFS InOrder
	private static void inOrder(Node currNode) {

		if (currNode.getLeft() != null) {
			inOrder(currNode.left);
		}
		System.out.println("cur nod val:" + currNode.value);
		list.add(currNode.getValue());
		if (currNode.getRight() != null) {
			inOrder(currNode.right);
		}
	}

	public static void insertElements(BinaryTree bst) {
		bst.add(6);
		bst.add(4);
		bst.add(8);
		bst.add(3);
		bst.add(5);
		bst.add(7);
		bst.add(9);
	}

	private static void pollNodesOfBST(Queue<Node> q) {
		while(!q.isEmpty()) {
			Node currNode = q.remove();
			System.out.println("currNode: " + currNode.getValue());
			if (currNode.getLeft() != null) {
				q.add(currNode.getLeft());
			}
			if (currNode.getRight() != null) {
				q.add(currNode.getRight());
			}
		}
	}
}
