package com.dsa.math;

public class TrainlingZeroInFactorial {
	public static void main(String[] args) {
		System.out.println(getTrailingZero(251));
	}

	private static int getTrailingZero(int n) {
		int res = 0;
		for (int i = 5; i <= n; i = i * 5) {
			res = res + (n / i);
		}
		return res;
	}
}
