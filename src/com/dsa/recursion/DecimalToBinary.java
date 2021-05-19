/**
 * 
 */
package com.dsa.recursion;

/**
 * @author offic
 *
 */
public class DecimalToBinary {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		generateDecimalToBinary(7);
	}

	private static void generateDecimalToBinary(int i) {
		if (i == 0)
			return;
		generateDecimalToBinary(i / 2);
		System.out.println(i % 2);
	}

}
