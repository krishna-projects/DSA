package com.dsa.math;

public class HCF {

	public static void main(String[] args) {
		System.out.println("HCF for 12 , 15 is " + gcd(12, 15));
	}

	static int gcd(int a, int b) {
		System.out.println(" a = " + a + "  b = " + b);
		if (b == 0)
			return a;

		return gcd(b, a % b);
	}

}
