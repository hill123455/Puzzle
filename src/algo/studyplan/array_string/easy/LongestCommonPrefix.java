package studyplan.array_string.easy;

import java.util.Arrays;

public class LongestCommonPrefix {

    //https://leetcode.com/problems/longest-common-prefix/?envType=study-plan-v2&id=top-interview-150

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix2(new String[] { "ab", "a" }));
    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder res = new StringBuilder();
        String firstStr = strs[0];
        int index = 0;
        for (char c : firstStr.toCharArray()) {
            for (String str : strs) {
                if (str.length() - 1 < index || str.charAt(index) != c) {
                    return res.toString();
                }
            }
            res.append(c);
            index++;
        }
        return res.toString();
    }

    public static String longestCommonPrefix2(String[] strs) {
        Arrays.sort(strs);
        StringBuilder res = new StringBuilder();
        String longest = strs[strs.length - 1];
        int index = 0;
        for (char c : strs[0].toCharArray()) {
            if (longest.charAt(index) != c) {
                break;
            }
            res.append(c);
            index++;
        }
        return res.toString();
    }
}
