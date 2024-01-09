package com.dsa.recursion;

public class ReverseString {
    public static void main(String[] args) {
        String toRevers = "Krishna";
        System.out.println("Reversing string: " + toRevers + " Reversed: " + reverse(toRevers));
    }

    public static String reverse(String toReverse) {
        if (!toReverse.isEmpty()) {
            return reverse(toReverse.substring(1)) + toReverse.charAt(0);
        }
        return "";
    }
}
