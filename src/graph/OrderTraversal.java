/**
 * 
 */
package graph;

/**
 * @author sachin.gadade
 * 
 * @Date 06-Nov-2019
 *
 */
public class OrderTraversal {
/*
 * input: abcdexfxxxxxxghxxx
 * Traverse and output as: acfhbegd
 */
	/*
	 *     	  a
  	 *		  b      		c
  	 *		  d    			e    	f
	 *	    						g     h
	 *
	 */
	public static void main(String[] args) {
		Tree<Character> a = new Tree<Character>('a');
		Tree<Character> b = a.addChild('b');
		Tree<Character> c = a.addChild('c');
		Tree<Character> d = b.addChild('d');
		Tree<Character> e = c.addChild('e');
		Tree<Character> f = c.addChild('f');
		Tree<Character> g = f.addChild('g');
		Tree<Character> h = f.addChild('h');
		
		
		
		
	}
}
