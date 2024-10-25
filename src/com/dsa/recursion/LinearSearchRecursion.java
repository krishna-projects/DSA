package com.dsa.recursion;

public class LinearSearchRecursion {
    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 9, 1, 10, 44, 22, 33, 61};
        System.out.println("Linear search :" + linearSearch(arr, 0, 120));
    }

    private static int linearSearch(int[] arr, int i, int target) {
        if (arr[i] == target) {
            return i;
        }
        if (i == arr.length - 1)
            return -1;
        return linearSearch(arr, i + 1, target);
    }

}
