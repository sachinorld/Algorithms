/**
 * 
 */
package com.rakuten.test;

/**
 * @author sachin.gadade
 * 
 * @Date 01-Nov-2019
 *
 */
public class Candies {

	public static void main(String[] args) {
		
		int childrn = 3;
		int candies = 12;
		int given = 0;
		int[] arr = new int[childrn];
		
		for (int i = 1; given < candies; i++) {
			int left = candies - given;
			int ele = i;
			if (left <= i)  {
				ele = left;
			}
			arr[(i-1)%childrn] = arr[(i-1)%childrn] + ele;
			given += i;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
