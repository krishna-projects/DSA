package com.dsa.math;

public class ListAllPPalindromeNumber {
	public static void main(String[] args) {
		for (long l = 0; true; l++) {
			if (checkPalindrome(l))
				System.out.println(l);
		}
	}

	private static boolean checkPalindrome(long i) {
		long rev = 0;
		long origianl = i;
		while (i > 0) {
			long rem = i % 10;
			rev = rev * 10 + rem;
			i /= 10;
		}
		if (rev == origianl) {
			return true;
		}
		return false;
	}
}
