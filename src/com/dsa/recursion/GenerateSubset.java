package com.dsa.recursion;

public class GenerateSubset {

	public static void main(String[] args) {
		String str = "ABC";
		printSub(str, "", 0);
	}

	private static void printSub(String str, String curr, int index) {
		if (index == str.length()) {
			System.err.print(curr + " ");
			return;
		}
		printSub(str, curr, index + 1);
		printSub(str, curr + str.charAt(index), index + 1);
	}

}
