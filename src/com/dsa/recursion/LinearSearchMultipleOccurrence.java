package com.dsa.recursion;

import java.util.ArrayList;
import java.util.List;

public class LinearSearchMultipleOccurrence {
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 7, 7, 7, 8, 9, 7, 2, 5};
        System.out.println("Find all occurrence :" + findAll(arr, 0, 3));
    }

    private static List<Integer> findAll(int[] arr, int index, int target) {
//        here list will only contain this function call result
        List<Integer> result = new ArrayList<>();
        if (index == arr.length - 1)
            return result;

        if (arr[index] == target)
            result.add(index);

        List<Integer> allOtherIndex = findAll(arr, index + 1, target);
//        adding all recursion function call result to mail list
        result.addAll(allOtherIndex);
        return result;
    }
}
