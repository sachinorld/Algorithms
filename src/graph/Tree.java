/**
 * 
 */
package graph;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sachin.gadade
 * 
 * @Date 05-Nov-2019
 *
 */
public class Tree<T> {

	private T value;
	private List<Tree<T>> children;
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
	 * @return the children
	 */
	public List<Tree<T>> getChildren() {
		return children;
	}

	/**
	 * @param children the children to set
	 */
	public void setChildren(List<Tree<T>> children) {
		this.children = children;
	}

	public Tree (T value) {
		this.value = value;
		this.children = new ArrayList<Tree<T>>();
	}
	
	public Tree<T> addChild(T value) {
		Tree<T> newChild = new Tree<T>(value);
		this.children.add(newChild);
		return newChild;
	}
	
	public static <T> Tree<T> of(T value) {
		return new Tree<T>(value);
	}
}
