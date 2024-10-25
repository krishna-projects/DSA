package com.dsa.algo;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 7, 9, 10, 14, 17};
        int[] arrDesc = {19, 17, 16, 10, 9, 6, 2, 1};
        int toSearch = 17;
        System.out.println("Binary search : " + toSearch + " found at:" + binarySearch(arr, toSearch));
        System.out.println("Order less Binary search : " + toSearch + " found at:" + binarySearchOrder(arrDesc, toSearch));
    }

    public static int binarySearch(int[] arr, int toSearch) {
        int start = 0;
        int end = arr.length;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < toSearch) {
                start = mid + 1;
            } else if (arr[mid] > toSearch) {
                end = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static int binarySearchOrder(int[] arr, int toSearch) {
        int start = 0;
        int end = arr.length;

        boolean isAsc = arr[start] < arr[end - 1];
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == toSearch) {
                return mid;
            }
            if (isAsc) {
                if (arr[mid] < toSearch) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (arr[mid] > toSearch) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
