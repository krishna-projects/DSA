package com.dsa.random;

public class PositionInInfiniteArrayBinary {
    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 5, 7, 8, 10, 14, 16, 19, 22, 25};
        int target = 10;
        System.out.println(search(nums, target));
    }

    public static int search(int[] nums, int target) {
        if (nums.length == 0) {
            return -1;
        }
        if (nums[0] == target)
            return 0;

        int[] range = getRange(nums, target);
        if (range[0] != -1) {
            int start = range[0];
            int end = range[1];
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
        }
        return -1;
    }

    private static int[] getRange(int[] nums, int target) {
        int[] result = {-1, -1};
        int end = 1;
        while (nums[end] < target) {
            result[0] = end;
            end = 2 * end;
            result[1] = end;
        }
        return result;
    }
}
