package com.dsa.recursion;

public class JosephusProblem {
	public static void main(String[] args) {
		int totalPerson = 100, k = 2;
		System.out.println("Person left = " + getJosephus(totalPerson, k) + "  when total person = " + totalPerson
				+ " and k = " + k);
	}

	private static int getJosephus(int totalPerson, int k) {
		if (totalPerson == 1) {
			return 0;
		} else
			return (getJosephus(totalPerson - 1, k) + k) % totalPerson;
	}
}
