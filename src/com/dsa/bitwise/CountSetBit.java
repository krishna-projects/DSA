package com.dsa.bitwise;

public class CountSetBit {

	public static void main(String[] args) {
		System.out.println("bits in 7 = " + method1(7));
		System.out.println("bits in 7 = " + method2(7));
		System.out.println("bits in 8 = " + method2(8));
		System.out.println("bits in 8 = " + method1(8));
	}

	public static int method1(int n) {
		int result = 0;
		while (n != 0) {
			if (n % 2 != 0) {
				result++;
				n /= 2;
			}
		}
		return result;
	}

	public static int method2(int n) {
		int count = 0;
		while (n > 0) {
			n &= (n - 1);
			count++;
		}
		return count;
	}
}
