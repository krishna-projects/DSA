package com.dsa.math;

public class CheckPrime {
	public static void main(String[] args) {
		System.out.println("31 is prime "+isPrime(31));
	}

	static boolean isPrime(int n)
	{
		if(n==1)
			return false;

		if(n==2 || n==3)
			return true;

		if(n%2==0 || n%3==0)
			return false;

		for(int i=5; i*i<=n; i=i+6)
		{
			if(n % i == 0 || n % (i + 2) == 0)
				return false; 
		}

		return true;
	}

}
