package com.dsa.common;

public class Test {

	public static void main(String[] args) {
		System.out.println("Hello world");
		System.out.println(new Throwable().getStackTrace()[0].getLineNumber());
	}
}
