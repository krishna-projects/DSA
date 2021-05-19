package com.dsa.math;

public class NumerOfDigits {
	public static void main(String[] args) {
		System.out.println(countNumber1(254));
		System.out.println(countNumber2(22145));
	}

	private static int countNumber2(int i) {
		return (int) (1 + Math.floor(Math.log10(i)));
	}

	private static int countNumber1(int i) {
		int count = 0;
		while (i > 0) {
			count++;
			i /= 10;
		}
		return count;
	}
}
