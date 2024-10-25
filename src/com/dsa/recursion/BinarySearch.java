package com.dsa.recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 7, 9, 10, 14, 17};
        int toSearch = 10;
        System.out.println("Binary search : " + toSearch + " found at:" + binarySearch(arr, 0, arr.length - 1, toSearch));
    }

    public static int binarySearch(int[] arr, int start, int end, int target) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == target)
            return mid;
        else if (arr[mid] < target)
            return binarySearch(arr, mid + 1, end, target);
        else
            return binarySearch(arr, start, mid, target);
    }


}
