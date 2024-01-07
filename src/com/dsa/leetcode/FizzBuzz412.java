package com.dsa.leetcode;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz412 {
    public static void main(String[] args) {
        System.out.println(fizzBuzz(100));
        System.out.println(fizzBuzz2(100));
    }

//    we can clearly see that here we are using new arraylist, so space complexity S= O(n)
//    also we are iterating till n, so time complexity become T= O(n)

    public static List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                result.add("FizzBuzz");
            else if (i % 3 == 0)
                result.add("Fizz");
            else if (i % 5 == 0)
                result.add("Buzz");
            else
                result.add(String.valueOf(i));
        }
        return result;
    }

    public static List<String> fizzBuzz2(int n) {
        List<String> result = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            result.add(i % 15 == 0 ? "FizzBuzz"
                    : i % 3 == 0 ? "Fizz"
                    : i % 5 == 0 ? "Buzz"
                    : String.valueOf(i));
        }
        return result;
    }
}
