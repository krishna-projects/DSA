package com.dsa.recursion;

public class SumOfDigits {

	public static void main(String[] args) {
		int i = 8584;
		System.out.println("Sum of Digit of " + i + " using recursion = " + sumOfDigits(i));
	}

	private static int sumOfDigits(int i) {
		if (i == 0) {
			return 0;
		}
		return (i % 10) + sumOfDigits(i / 10);
	}
}
