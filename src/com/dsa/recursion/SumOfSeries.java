package com.dsa.recursion;

public class SumOfSeries {

	public static void main(String[] args) {
		System.out.println(sumOfSeries(5));
	}

	private static int sumOfSeries(int i) {
		if (i == 0) {
			return 0;
		}
		return i + sumOfSeries(i - 1);
	}
}
