package com.dsa.bitwise;

public class CheckKthBitSet {

	public static void main(String[] args) {
		System.out.println("kth Bit for n=5 k=2 " + isKthBitSet(5, 1));
	}

	private static boolean isKthBitSet(int n, int k) {
		if ((n & (1 << (k - 1))) == 1) {
			System.out.println("SET");
			return true;
		} else {
			System.out.println("NOT SET");
			return false;
		}
	}

}
