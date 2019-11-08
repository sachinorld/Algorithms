/**
 * 
 */
package graph;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Optional;
import java.util.Queue;
import java.util.Set;

/**
 * @author sachin.gadade
 * 
 * @Date 06-Nov-2019
 *
 */
public class BFSForGraph {

	/**		
	 * 		3\
	 * 		| \
	 *      |  \
	 * 2----4----5
	 * 		|  /
	 * 		| /
	 *		7/
	 * Complexity of BFS for Graph:
	 * The Queue visits n no of nodes. 
	 * Queue visits c no of connections (in worst case all conn i.e if node is not found)
	 * So O(n or c)  In graph c might be greater than nodes
	 */
	public static void main(String[] args) {
		Queue<Node<Integer>> q = new ArrayDeque<Node<Integer>>();
		Node<Integer> two = new Node<Integer>(2);
		Node<Integer> four = new Node<Integer>(4);
		Node<Integer> three = new Node<Integer>(3);
		Node<Integer> five = new Node<Integer>(5);
		Node<Integer> seven = new Node<Integer>(7);
		two.connect(four);

		four.connect(three);
		four.connect(five);
		four.connect(seven);

		five.connect(three);
		five.connect(seven);

		// we can start the queue with any node in a graph (bi direc association). In a
		// tree we start with root node
		q.add(three);
		
		System.out.println(breadthFirstSearch(7, q));
	}

	private static int breadthFirstSearch(Integer value, Queue<Node<Integer>> q) {
		int cnt = 0;
		Set<Node<Integer>> alreadyVisited = new HashSet<>();
		while (!q.isEmpty()) {
			cnt++;
			// get node from queue.
			Node<Integer> node = q.remove();
			
			// if it is equal to value then return this node
			if (value == node.getValue()) {
				return cnt;
			} else {
				// mark this node as visited.
				alreadyVisited.add(node);
				// add node's neighbors to tail of the queue.
				q.addAll(node.getNeighbours());
				// from queue remove all visited nodes.
				q.removeAll(alreadyVisited);
			}
		}
		return cnt;
	}
}

