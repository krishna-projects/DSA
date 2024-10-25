package com.dsa.recursion;

public class ArraySortedOrNot {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 7, 8, 10, 14,5};
        System.out.println("Array is sorted: " + isArraySorted(arr, 0));
    }

    private static boolean isArraySorted(int[] arr, int i) {
        if (arr.length <= 2)
            return true;

        if (i < arr.length - 1)
            return arr[i] <= arr[i + 1] && isArraySorted(arr, i + 1);
        else
            return true;
    }
}
