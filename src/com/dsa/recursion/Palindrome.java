package com.dsa.recursion;

public class Palindrome {
    public static void main(String[] args) {
        String str = "123454321";
        System.out.println("String " + str + " is palindrome : " + isPalindrome(str));
    }

    private static boolean isPalindrome(String str) {
        return checkPalindrome(str, 0, str.length() - 1);
    }

    private static boolean checkPalindrome(String str, int start, int end) {
        if (start >= end) {
            return true;
        }
        return str.charAt(start) == str.charAt(end) && checkPalindrome(str, start + 1, end - 1);
    }
}
