package com.dsa.recursion;

public class CountZeros {
    public static void main(String[] args) {
        int number = 30405060;
        System.out.println("Number of 0s in number: " + number + "  = : " + countZero(number, 0));
    }

    private static int countZero(int number, int count) {
        if (number > 0) {
            if (number % 10 == 0)
                count += 1;
            return countZero(number / 10, count);
        }
        return count;
    }
}
