package depth.first.search;

import java.util.ArrayDeque;
import java.util.Queue;

public class TestDFSForTree {

	private static int cnt = 0;
	/*	Tree
	 *         4
	 *   3             6
	 * 2   5      	10   11   
	 * 
	 */
	public static void main(String[] args) {
		int arr[] = {4, 3, 6, 2, 5, 10, 11};
		Node root = insertLevel(arr, 0, null);
		TestDFSForTree dfs = new TestDFSForTree();
				
		boolean contains = dfs.search(root, 10);
		System.out.println(contains);
		
	}

	// goto children before siblings
	private boolean search(Node node, int value) {
		if (node == null) return false;
		if (node.value == value) return true;
		
		return search(node.left, value) || search(node.right, value);
	}
	
	private static Node insertLevel(int[] arr, int i, Node node) {
		
		if (i < arr.length) {
			System.out.println("here" + cnt++);
			if (null == node)
				node = new Node(arr[i]);
			
			node.left = insertLevel(arr, (2*i)+1, node.left);
			node.right = insertLevel(arr, (2*i)+2, node.right);
		}
		return node;
	}
}
