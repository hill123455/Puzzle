package studyplan.backtracking;

import java.util.*;

public class PalindromePartitioning {

    // https://leetcode.com/problems/palindrome-partitioning/

    public static void main(String[] args) {
        String s = "a";
        System.out.println(partition(s));

    }

    public static List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        backTrack(result, new ArrayList<>(), s, 0);
        return result;
    }

    public static void backTrack(List<List<String>> result, List<String> path, String s, Integer index) {
        if (index == s.length()) {
            result.add(new ArrayList<>(path));
        }
        for (int i = index; i < s.length(); i++) {
            String s1 = s.substring(index, i + 1);
            if (isPalindrome(s1)) {
                path.add(s1);
                backTrack(result, path, s, i + 1);
                path.remove(path.size() - 1);
            }
        }
    }

    public static boolean isPalindrome(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (chars[left] != chars[right]) {return false;}
        }
        return true;
    }
}
