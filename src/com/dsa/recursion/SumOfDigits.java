package com.dsa.recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        int num = 4322;
        System.out.println("sum of digits for num: " + num + " sum: " + sumOfDigits(num));
    }

    public static int sumOfDigits(int num) {
        if (num > 0) {
            return num % 10 + sumOfDigits(num / 10);
        }
        return 0;
    }
}
