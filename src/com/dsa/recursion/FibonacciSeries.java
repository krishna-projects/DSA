package com.dsa.recursion;

public class FibonacciSeries {

	public static void main(String[] args) {
		System.out.println(printFibonacciNumber(6));
		// 0 1 1 2 3 5 8 13 21 34
	}

	private static int printFibonacciNumber(int i) {
		if (i <= 1) {
			return i;
		}
		return printFibonacciNumber(i - 1) + printFibonacciNumber(i - 2);
	}
}
