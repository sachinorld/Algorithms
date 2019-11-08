/**
 * 
 */
package binarytree;

public class BinaryTree {
	
	/**
	 * @return the root
	 */
	public Node getRoot() {
		return root;
	}

	/**
	 * @param root the root to set
	 */
	public void setRoot(Node root) {
		this.root = root;
	}

	private Node root;

	public void add(int value) {
		root = addRecursive(root, value);
	}

	private Node addRecursive(Node currentNode, int value) {
		// if val is null then it is leaf node. create a new node.
		if (currentNode == null) {
			return new Node(value);
		}
		
		// if less than current make it left child. I f greater then make it right child
		// else if equal then return current node.
		if (value < currentNode.getValue()) {
			currentNode.left = addRecursive(currentNode.getLeft(), value);
		} else if (value > currentNode.getValue()) {
			currentNode.right = addRecursive(currentNode.getRight(), value);
		}
		return currentNode;
	}

	public boolean containsRecursive(Node current, int value) {
		if (current == null) {
			return false;
		}

		if (value == current.value)
			return true;

		if (value < current.value)
			return containsRecursive(current.left, value);
		else
			return containsRecursive(current.right, value);
	}

	public void deleteRecursive(Node currNode, int value) {
		if (value == currNode.value) {
			// delete
			currNode = deleteNode(currNode);
		}
		if (value < currNode.value) {
			deleteRecursive(currNode.left, value);
		}
		deleteRecursive(currNode.right, value);
	}

	private Node deleteNode(Node currNode) {
		// 1. if node has no child
		if (!currNode.hasChildren()) {
			return null;
		}
		// 2. if node has any one child
		if (currNode.getLeft() == null) 
			return currNode.right;
		if (currNode.right == null)
			return currNode.left;
		
		// 3. if node has both children
		
		
		return null;
	}
}
