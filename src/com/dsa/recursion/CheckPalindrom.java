package com.dsa.recursion;

public class CheckPalindrom {

	public static void main(String[] args) {
		String str = "ABAB";
		System.out.println("Checking if " + str + " is palindrome or not " + checkPalindrome(str, 0, str.length() - 1));

	}

	private static boolean checkPalindrome(String str, int start, int end) {
		if (start >= end) {
			return true;
		}
		return ((str.charAt(start) == str.charAt(end)) && checkPalindrome(str, start + 1, end - 1));
	}
}
