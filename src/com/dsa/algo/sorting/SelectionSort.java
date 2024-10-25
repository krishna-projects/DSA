package com.dsa.algo.sorting;

import com.dsa.random.Utility;

import java.util.LinkedList;

public class SelectionSort {
    //    selection sort first finds the minimum element in unsorted part
//    and then move to first index in unsorted array
    public static void main(String[] args) {
        int[] arr = {2, 7, 5, 12, 3, 12, 15, 4, 6};
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[min])
                    min = j;
            }
            if (min != i) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
        LinkedList<String> linkedList = new LinkedList<>();
        Utility.printArray(arr);
    }
}
