package com.dsa.recursion;

public class RecursionDemo {

	public static void main(String[] args) {
		recursionDemo1(3);
		System.out.println();
		System.out.println();
		recursionDemo2(3);
	}

	/*
	 * for first call, first sysout is executed and second sysout is on waiting
	 */
	private static void recursionDemo1(int i) {
		if (i == 0) {
			return;
		}
		System.out.println(new Throwable().getStackTrace()[0].getLineNumber() + " -> " + i); // print 3 then i-1, print
																								// 2,1
		recursionDemo1(i - 1);
		System.out.println(new Throwable().getStackTrace()[0].getLineNumber() + " -> " + i); // first 3 goes to stack
																								// for
																								// waitint then 2 then
																								// 1, so
																								// prints 1 2 3
	}

	private static void recursionDemo2(int i) {
		if (i == 0) {
			return;
		}
		recursionDemo2(i - 1);
		System.out.println(new Throwable().getStackTrace()[0].getLineNumber() + " -> " + i);
		recursionDemo2(i - 1);
	}
}
