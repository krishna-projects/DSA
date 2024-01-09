package com.dsa.algo;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = {2, 7, 5, 12, 3, 12, 15, 4, 6};
        System.out.println("orignal array");
        printArray(arr);
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("sorted array");
        printArray(arr);
    }

    public static void mergeSort(int[] arr, int start, int end) {
        if (start < end) {
//            calculating mid of array
            int mid = start + ((end - start) / 2);

//            dividing array into smaller part
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);

//            merging smaller array into sorted form
            merge(arr, start, mid, end);
        }
    }

    public static void merge(int[] arr, int start, int mid, int end) {
//        calculating length of merged array, e-s+1, as indexing starts from 0
        int[] merged = new int[end - start + 1];
        int leftIdx = start;
        int rightIdx = mid + 1;
        int k = 0;
//        check for both the array and put smaller into merged array
        while (leftIdx <= mid && rightIdx <= end) {
            if (arr[leftIdx] < arr[rightIdx]) {
                merged[k++] = arr[leftIdx++];
            } else {
                merged[k++] = arr[rightIdx++];
            }
        }
//        put all element from left sorted
        while (leftIdx <= mid) {
            merged[k++] = arr[leftIdx++];
        }
//        put all element from right sorted
        while (rightIdx <= end) {
            merged[k++] = arr[rightIdx++];
        }

//       coping merged array to original array
        for (int i = 0, j = start; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    public static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
