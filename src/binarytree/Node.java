/**
 * 
 */
package binarytree;

public class Node {

	protected Integer value;
	protected Node left;
	protected Node right;

	public Node(Integer value) {
		this.value = value;
		this.left = null;
		this.right = null;
	}

	/**
	 * @return the value
	 */
	public Integer getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(Integer value) {
		this.value = value;
	}

	/**
	 * @return the left
	 */
	public Node getLeft() {
		return left;
	}

	/**
	 * @param left the left to set
	 */
	public void setLeft(Node left) {
		this.left = left;
	}

	/**
	 * @return the right
	 */
	public Node getRight() {
		return right;
	}

	/**
	 * @param right the right to set
	 */
	public void setRight(Node right) {
		this.right = right;
	}

	/**
	 * @return
	 */
	public boolean hasChildren() {
		if (this.left != null || this.right != null) {
			return true;
		}
		return false;
	}

	/**
	 * @param value2
	 * @return
	 */
	public boolean hasChildOf(int value2) {
		if (this.getLeft().getValue() == value) {
			this.setLeft(null);
		} else if (this.getRight().getValue() == value) {
			this.setRight(null);
		}
		return false;
	}

}
