package binarytree.revision;

import java.util.ArrayDeque;
import java.util.Queue;

public class BinaryTree {

	private Node root;

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	public void add(int value) {
		root = addRecursive(root, value);
	}

	// Recursive
	private Node addRecursive(Node currNode, int value) {
		// if new node then create and return.
		if (currNode == null) {
			return new Node(value);
		}
		// if value is less than currNode value, then add it to left child
		if (value < currNode.value) {
			currNode.left = addRecursive(currNode.left, value);
		} else if (value > currNode.value) {
			// if value is greater than currNode value, then add it to right child
			currNode.right = addRecursive(currNode.right, value);
		}
		return currNode;
	}

	public void breadFirstTraversal(Queue<Node> q) {
		while (!q.isEmpty()) {
			Node node = q.remove();
			System.out.println(node.value);
			if (node.left != null) {
				q.add(node.left);
			}
			if (node.right != null) {
				q.add(node.right);
			}
		}
	}

	// Inorder: 3456789
	// Preorder: 6 435 879
	public void depthFirstTraversal() {
		Node node = this.root;
		// pre order
		dftPreOrder(node);
	}

	// Recursive
	private void dftPreOrder(Node node) {
		// change order of syso to make inorder or postorder
		if (node != null) {
			System.out.println(node.value);
			dftPreOrder(node.left);
			dftPreOrder(node.right);
		}
	}

	public void contains_DepthFirstSearch(int value) {
		boolean contains = containsRecursive(this.root, value);
		System.out.println("contains:" + contains);
	}

	// Recursive
	private boolean containsRecursive(Node currNode, int value) {
		// if node is null -> does not contain
		if (currNode == null)
			return false;
		System.out.println("Checking " + currNode.value);
		// If found then true
		if (currNode.value == value)
			return true;

		// if less than current node value then find for left
		if (value < currNode.value) {
			return containsRecursive(currNode.left, value);
		} else {
			// if greater than current node value than find for right
			return containsRecursive(currNode.right, value);
		}
	}

	// This is for a generic tree.
	// For a BinarySearchTree (where left subtree is always smaller than right one),
	// we can check less than or greater condition to reduce iter.
	public boolean contains_BreadthFirstSearch(Queue<Node> q, int value) {

		while (!q.isEmpty()) {
			Node current = q.remove();

			if (value == current.value)
				return true;
			else if (current.left != null && value <= current.left.value)
				q.add(current.left);
			else if (current.right != null && value >= current.right.value)
				q.add(current.right);
		}
		return false;
	}
}
