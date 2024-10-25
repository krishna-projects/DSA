package com.dsa.leetcode;

public class FirstAndLastBinary34 {
    public static void main(String[] args) {
        int nums[] = {3, 3, 3};
        int target = 3;
//        int[] results = searchRangeBF(nums, target);
//        System.out.println("[" + results[0] + "," + results[1] + "]");
//
        System.out.println("Binary method " + search(nums, 3, true));
        System.out.println("Binary method " + search(nums, 3, false));
    }

    public static int[] searchRangeBF(int[] nums, int target) {
        if (nums.length == 0) {
            return new int[]{-1, -1};
        }
        int pos = -1;
        int start = 0;
        int end = nums.length;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < target)
                start = mid + 1;
            else if (nums[mid] > target)
                end = mid;
            else {
                pos = mid;
                break;
            }
        }
        if (pos != -1) {
            start = pos;
            end = pos;
            int k = 0;
            while (true) {
                k++;
                boolean found = false;
                if (pos - k >= 0 && nums[(pos - k)] == target) {
                    start--;
                    found = true;
                }

                if (pos + k < nums.length && nums[pos + k] == target) {
                    end++;
                    found = true;
                }
                if (!found)
                    break;

            }
            return new int[]{start, end};
        }
        return new int[]{-1, -1};
    }


    public static int search(int[] nums, int target, boolean isFirstIndex) {
        int index = -1;
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > target) {
                end = mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                index = mid;
                if (isFirstIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return index;
    }
}
