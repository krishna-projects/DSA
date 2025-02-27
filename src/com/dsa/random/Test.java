package com.dsa.random;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{2, 3, 2}));
    }

    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int candidate1 = 0, candidate2 = 0, count1 = 0, count2 = 0;
        for (int num : nums) {
            if (num == candidate1) {
                count1++;
            } else if (candidate2 == num) {
                count2++;
            } else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            } else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        count2 = 0;
        count1 = 0;
        for (int num : nums) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            }
        }
        if (count1 > (nums.length / 3))
            result.add(candidate1);
        if (count2 > (nums.length) / 3)
            result.add(candidate2);

        return result;
    }
}
