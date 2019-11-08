package depth.first.search;

public class Node {

	int value;
	Node left;
	Node right;
	
	// Unlike BinaryTree this tree may have 
	// a.more than 2 children b. elements not in any order
	// So a List of children
	public Node(int value) {
		this.value = value;
		this.left = this.right = null;
	}
	
	public static Node of(int value) {
		return new Node(value);
	}
}
