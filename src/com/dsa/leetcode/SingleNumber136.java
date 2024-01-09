package com.dsa.leetcode;

import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.Set;

public class SingleNumber136 {
    public static void main(String[] args) {
//      in linear time and constant space complexity
        System.out.println("Expected: 1");
        System.out.println(singleNumber(new int[]{2, 2, 1}));
        System.out.println("Expected: 4");
        System.out.println(singleNumber(new int[]{4, 1, 2, 1, 2}));
        System.out.println("Expected: 1");
        System.out.println(singleNumber(new int[]{1}));
        System.out.println("=======================");
        System.out.println("Expected: 1");
        System.out.println(bitWiseSingleNumber(new int[]{2, 2, 1}));
        System.out.println("Expected: 4");
        System.out.println(bitWiseSingleNumber(new int[]{4, 1, 2, 1, 2}));
        System.out.println("Expected: 1");
        System.out.println(bitWiseSingleNumber(new int[]{1}));
    }

    //    here S = O(n) as new Set is creted and T = O(n)
    public static int singleNumber(int[] nums) {
        if (nums.length == 1)
            return nums[0];

        Set<Integer> integers = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!integers.contains(nums[i])) {
                integers.add(nums[i]);
            } else {
                integers.remove(nums[i]);
            }
        }
        return integers.iterator().next();
    }

//    here are taking single number, so S = O(1), and T= O(n)
    public static int bitWiseSingleNumber(int[] nums) {
        int singleNumber = 0;
        for (int n : nums) {
            singleNumber ^= n;
        }
        return singleNumber;
    }
}
