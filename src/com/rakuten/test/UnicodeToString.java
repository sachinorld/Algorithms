package com.rakuten.test;

public class UnicodeToString {

	public static void main(String[] args) {
		System.out.println("Start");
		String unicodeChars = "\u30B7\u30B9\u30C6\u30E0\u30E1\u30F3\u30C6\u30CA\u30F3\u30B9\u4E2D\u3067\u3059";
		unicodeChars = unicodeChars.replace("\\", "");
		String [] arr = unicodeChars.split("u");
		StringBuilder text = new StringBuilder();
		
		for (int i = 0; i < arr.length; i++) {
			int hexValue = Integer.parseInt(arr[i], 16);
			text.append(hexValue);
		}
		
		System.out.println(text);
	}
}
