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
		generateDecimalToBinary(8);
	}

	private static void generateDecimalToBinary(int i) {
		if (i == 0)
			return;
		generateDecimalToBinary(i / 2);
		System.out.print(i % 2);
	}

}
