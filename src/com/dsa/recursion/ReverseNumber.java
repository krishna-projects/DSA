package com.dsa.recursion;

public class ReverseNumber {
    static int sum = 0;

    public static void main(String[] args) {
        int number = 12456;
        int reversed = reverse(number);
        System.out.println("Reverse of number: " + number + " = " + sum);
    }


    public static int reverse(int number) {
        if (number > 0) {
            sum = sum * 10 + number % 10;
            reverse(number / 10);
        }
        return 0;
    }

}
