/**
 * 
 */
package graph;

import java.util.HashSet;
import java.util.Set;

/**
 * @author sachin.gadade
 * 
 * @Date 06-Nov-2019
 *
 */
public class Node<T> {

	private T value;
	private Set<Node<T>> neighbours;
	
	public Node(T value) {
		this.value = value;
		this.neighbours = new HashSet<Node<T>>();
	}
	
	public void connect(Node<T> node) {
		// if trying associate the node to itself, then throw excpetion
		if (this == node) throw new IllegalArgumentException();
		// associate new node to this node
		this.neighbours.add(node);
		// associate this node to new node in two ways 
		node.neighbours.add(this);
	}

	/**
	 * @return the value
	 */
	public T getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(T value) {
		this.value = value;
	}

	/**
	 * @return the neighbours
	 */
	public Set<Node<T>> getNeighbours() {
		return neighbours;
	}

	/**
	 * @param neighbours the neighbours to set
	 */
	public void setNeighbours(Set<Node<T>> neighbours) {
		this.neighbours = neighbours;
	}
}
