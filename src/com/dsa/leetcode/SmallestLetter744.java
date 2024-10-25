package com.dsa.leetcode;

public class SmallestLetter744 {


    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j', 'j', 'm' };
        char target = 'm';
        System.out.println(nextGreatestLetter(letters, target));
    }

    public static char nextGreatestLetterBF(char[] letters, char target) {
        if (target > letters[letters.length - 1]) {
            return letters[0];
        }
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] > target) {
                return letters[i];
            }
        }
        return letters[0];
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length;
        int left = 0, right = n;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (letters[mid] <= target)
                left = mid + 1;
            else
                right = mid;
        }
//      if element not found and left reached end of array, return first element
        if (left >= n)
            return letters[0];
//      for all other condition returning left element
        return letters[left];
    }
}
