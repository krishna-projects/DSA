package com.dsa.leetcode;

public class MountainPeek852 {
    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 5, 7, 8, 10, 8, 4, 1};
        System.out.println(peakIndexInMountainArray(nums));
    }

    public static int peakIndexInMountainArray(int[] arr) {
        // need to check if middle is highest, if yes return index
        // check for highest in neighbour array, and repeat same
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            // check if middle element is greater than both side of element
//            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
//                return mid;
//            }
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }
}
