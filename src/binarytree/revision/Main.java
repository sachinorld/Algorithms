package binarytree.revision;

import java.util.ArrayDeque;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		BinaryTree bst = new BinaryTree();
		// 1. Add elements to tree; COMPLEXITY = O(n)
		bst.add(6);
		bst.add(4);
		bst.add(8);
		bst.add(3);
		bst.add(5);
		bst.add(8);
		bst.add(7);
		bst.add(9);
		Queue<Node> q = new ArrayDeque<Node>();
		
		// 2. Breadth First Traversal. COMPLEXITY = O(n)
		q.add(bst.getRoot());
		bst.breadFirstTraversal(q);
		// 3. Depth First Traversal. COMPLEXITY = O(n)
//		bst.depthFirstTraversal();
		
		// 4. Find an element in the tree. COMPLEXITY = O(log n base 2)
		bst.contains_DepthFirstSearch(9); // goes through children before siblings
//		q.add(bst.getRoot());
//		boolean contains = bst.contains_BreadthFirstSearch(q, 2); // goes through siblings before going through children
//		System.out.println("contains "+ 2 + " - " + contains);
	}
}
