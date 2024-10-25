package com.dsa.algo.sorting;

import com.dsa.random.Utility;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2, 7, 5, 12, 3, 12, 15, 4, 6};
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
//            if no swapping happened means arrays is already sorted
            if (!swapped)
                break;
        }
        System.out.println("sorted array: " + arr.length);
        Utility.printArray(arr);
    }
}
