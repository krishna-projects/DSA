package com.dsa.recursion;

public class Fibonacci {
    public static void main(String[] args) {
//        getting nth ficonacci number
        System.out.println(fibo(5));
    }

    private static int fibo(int i) {
        if (i < 2)
            return i;
        return fibo(i - 1) + fibo(i - 2);
    }
}
