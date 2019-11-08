/**
 * 
 */
package graph;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author sachin.gadade
 * 
 * @Date 05-Nov-2019
 *
 */
public class TestQueue {

	public static void main(String[] args) {
		Queue<Integer> qu = new LinkedList<>();
		qu.add(10);
		qu.add(20);
		qu.add(30);
		qu.add(40);
//		System.out.println(qu.remove());
//		System.out.println("after:" + qu);
		int initSize = qu.size();
		for (int i = 0; i < initSize; i++) {
			Integer qEle = qu.poll();
			if (qEle < 30) {
				System.out.println(qEle);
				qu.add(qEle);
			}
		}
		System.out.println("after rm and add:" + qu);
	}
}
