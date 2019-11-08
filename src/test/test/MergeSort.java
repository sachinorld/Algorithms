/**
 * 
 */
package test.test;

import java.util.Arrays;

/**
 * @author sachin.gadade
 * 
 * @Date 04-Nov-2019
 *
 */
public class MergeSort {
	/*
	 * Split the array in till the size becomes 1.
	 * Compare
	 * Merge in ascending order
	 * Best case - O(n * log n base 2) = 
	 * 	a. O(n) for merge of entire array
	 *  b. O(2*(n/2) - sorting sub arrays
	 */
	public static void main(String[] args) {
		int[] arr = {10, 6, 4, 11, 2, 30, 20, 7};
		int[] resArr = mergeSort(arr);
		for (int i = 0; i < resArr.length; i++) {
			System.out.println(resArr[i]);
		}
	}

	private static int[] mergeSort(int[] arr) {
		if (arr.length <= 1) {
			return arr;
		}
		int m = arr.length/2;
		// initialize two half arrays
		// copy elements into half arrays
		int[] lArr = Arrays.copyOf(arr, m);
		int[] rArr = Arrays.copyOfRange(arr, m, arr.length);
		
		// divide the lArr and rArr until only one element is left in each arr
		mergeSort(lArr);
		mergeSort(rArr);
		
		// Merge in ascending order
		merge(lArr, rArr, arr);
		
		return arr;
	}

	private static void merge(int[] lArr, int[] rArr, int[] arr) {
		int count = 1;
		int l = 0;
		int r = 0;
		int merged = 0;
		while (l < lArr.length && r < rArr.length) {
			if (lArr[l] < rArr[r]) {
				System.out.println("count: " + count++);
				arr[merged] = lArr[l];
				l++;
			} else {
				System.out.println("count: " + count++);
				arr[merged] = rArr[r];
				r++;
			}
			merged++;
		}
		while (l < lArr.length) {
			System.out.println("count: " + count++);
			arr[merged++] = lArr[l++];
		}
		while (r < rArr.length) {
			System.out.println("count: " + count++);
			arr[merged++] = rArr[r++];
		}
	}

}
