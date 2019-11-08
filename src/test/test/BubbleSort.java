/**
 * 
 */
package test.test;

/**
 * @author sachin.gadade
 * 
 * @Date 03-Nov-2019
 *
 */
public class BubbleSort {

	/*
	 * Bubble sort
	 * Worst case if array is descending sorted - O(n2)
	 * Best case if array is ascending sorted - O(n)
	 */
	public static void main(String[] args) {
		int[] arr = {10, 20, 3, 12, 77, 100, 73, 20, 99, 18, 66, 30};
		int[] resultArr = sortBubbling(arr);
		
		for (int i : resultArr) {
//			System.out.println(i);
		}
	}

	/**
	 * @param arr
	 * @return
	 */
	private static int[] sortBubbling(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				System.out.println("count for i=" + i + ", " + count++);
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}
}
