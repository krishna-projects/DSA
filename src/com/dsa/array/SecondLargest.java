package com.dsa.array;

public class SecondLargest {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 35, 40, 13, 16, 38 };
		int arr1[] = { 10, 10 };
		System.out.println("second largest element of arr { 10, 20, 35, 40, 13, 16, 38 }  = " + getSecondLargest(arr));
		System.out.println("second largest element of arr { 10, 20, 35, 40, 13, 16, 38 } from method2  = "
				+ getSecondLargest2(arr));
		System.out.println("second largest element of arr {10, 10}  = " + getSecondLargest(arr1));
		System.out.println("second largest element of arr {10, 10} from method2  = " + getSecondLargest2(arr1));
	}

	private static int getSecondLargest2(int[] arr) {
		int largest = 0;
		int secondLargest = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			}
			if (arr[i] > secondLargest && arr[i] < largest) {
				secondLargest = arr[i];
			}
		}
		return secondLargest;
	}

//	Get second largest from array after getting largest from array
	private static int getSecondLargest(int[] arr) {
		int result = -1;
		int largest = getLargest(arr);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != largest) {
				if (result < arr[i]) {
					result = arr[i];
				}
			}
		}
		return result;
	}

//	Getting largest from array
	private static int getLargest(int[] arr) {
		int largest = arr[0];
		for (int i = -0; i < arr.length; i++) {
			if (largest < arr[i])
				largest = arr[i];
		}
		return largest;
	}

}
