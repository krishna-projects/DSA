package com.dsa.random;

public class CeilingFloorOfNumber {
    public static void main(String[] args) {
//        given array of number {2,3,5,7,9,10,14,16,20} , need to get target number or just larger number then given
//        like for target 14, result = 14 and target 15 result will be 16
//        for sorted array given, always go with binary search algo
        int[] arr = {2, 3, 5, 7, 9, 10, 14, 16, 20};
        int target = 17;
        System.out.println("Ceiling : " + target + " value: " + arr[ceiling(arr, target)]);
    }

    public static int ceiling(int[] arr, int toSearch) {
        int start = 0;
        int end = arr.length;

        boolean isAsc = arr[start] < arr[end - 1];
        while (start <= end) {
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
        return start;
    }

}
