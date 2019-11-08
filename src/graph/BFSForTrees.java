/**
 * 
 */
package graph;

import java.util.ArrayDeque;
import java.util.Queue;

public class BFSForTrees {

	/*        10
	 *     2      4
	 *     3
	 *
	 * We are searching for element 4 in the tree
	 * Complexity of BFS Tree: Queue visits each node once in the tree = O(n).
	 */ 
	public static void main(String[] args) {
		Queue<Tree<Integer>> q = new ArrayDeque<>();
		Tree<Integer> root = Tree.of(10);
		Tree<Integer> two = root.addChild(2);
		Tree<Integer> four = root.addChild(4);
		Tree<Integer> three = two.addChild(3);
		
		// add root to queue
		q.add(root);
		System.out.println("no of traversals:" +search(4, q));
	}

	/**
	 * @param i
	 * @param ele
	 */
	private static int search(Integer value, Queue<Tree<Integer>> q) {
		int cnt = 0;
		while (!q.isEmpty()) {
			cnt++;
			Tree<Integer> currentNode = q.remove();
			
			if (currentNode.getValue().equals(value)) {
				System.out.println(currentNode.getValue()); 
				break;
			} else {
				q.addAll(currentNode.getChildren());
			}
		}
		return cnt;
	}
	
	
}
