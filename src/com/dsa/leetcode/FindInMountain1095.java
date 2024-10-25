package com.dsa.leetcode;

public class FindInMountain1095 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 1};
        int target = 3;
        System.out.println(findInMountainArray(target, arr));
    }

    public static int findInMountainArray(int target, int[] nums) {
        int start = 0, end = nums.length - 1;
        int result = -1, peak = -1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > nums[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        peak = start;
        // checking left part of peak
        end = start;
        start = 0;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > target) {
                end = mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        // checking right part of array
        start = peak;
        end = nums.length;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < target) {
                end = mid;
            } else if (nums[mid] > target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return result;
    }
}
