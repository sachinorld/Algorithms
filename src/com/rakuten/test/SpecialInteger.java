/**
 * 
 */
package com.rakuten.test;

/**
 * @author sachin.gadade
 * 
 * @Date 02-Nov-2019
 *
 */
public class SpecialInteger {

	public static void main(String[] args) {
		String[] arr = { "22", "121" };
		int cnt = 0;
		for (String str : arr) {
			if (isSpecial(str)) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

	/**
	 * @param string
	 * @return
	 */
	private static boolean isSpecial(String str) {
		Integer num = Integer.parseInt(str);
		for (int i = 2; i <= num / 2; i++) {
			if (isPrimeNumber(i)) {
				Integer reverse = reverseNum(i);

				if (i + reverse == num) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * @param highPrime
	 * @return
	 */
	private static Integer reverseNum(Integer num) {
		Integer reverse = 0;
		while (num > 0) {
			reverse = reverse * 10 + num % 10;
			num = num / 10;
		}
		return reverse;
	}

	/**
	 * @param num
	 * @return
	 */
	private static boolean isPrimeNumber(Integer num) {
		for (int j = 2; j < num; j++) {

			if (num % j == 0) {
				return false;
			}
		}
		return true;
	}
}
