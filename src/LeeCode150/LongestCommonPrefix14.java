package LeeCode150;

import java.util.ArrayList;

public class LongestCommonPrefix14 {
    public static void main(String[] args) {
        String[] strs = {"ab", "a"};
        System.out.println(longestCommonPrefix(strs));
        ArrayList<Integer> list = new ArrayList<>();
    }

    public static String longestCommonPrefix(String[] strs) {
        String first = strs[0];
        if (strs.length == 1) {
            return first;
        }

        int index = 0;
        for (int i = 0; i < first.length(); i++) {
            boolean match = true;
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() > i && strs[j].charAt(i) != first.charAt(i)) {
                    match = false;
                    break;
                }
            }
            if (match) {
                index++;
            } else {
                break;
            }
        }
        return first.substring(0, index);
    }
}
