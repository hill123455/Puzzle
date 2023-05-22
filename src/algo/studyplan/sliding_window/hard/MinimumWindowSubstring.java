package studyplan.sliding_window.hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class MinimumWindowSubstring {

    //https://leetcode.com/problems/minimum-window-substring/?envType=study-plan-v2&id=top-interview-150

//    Input: s = "ADOBECODEBANC", t = "ABC"
//    Output: "BANC"
//    Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.

    public static void main(String[] args) {
        String s = "a";
        String t = "a";
        System.out.println(minWindow(s, t));
    }

    public static String minWindow(String s, String t) {
        Map<Character, Integer> mapT = new HashMap<>();
        Map<Character, Integer> mapHave = new HashMap<>();
        for (char c : t.toCharArray()) {
            mapT.put(c, mapT.getOrDefault(c, 0) + 1);
            mapHave.put(c, 0);
        }

        int minLeft = 0;
        int minRight = Integer.MAX_VALUE;
        int left = 0;
        int right = 0;

        int need = mapT.size();
        int have = 0;
        while (right < s.length()) {
            char rightChar = s.charAt(right);
            if (mapT.containsKey(rightChar)) {
                mapHave.put(rightChar, mapHave.getOrDefault(rightChar, 0) + 1);
                if (Objects.equals(mapHave.get(rightChar), mapT.get(rightChar))) {
                    have++;
                }
            }

            if (have == need) {
                while (left <= right && have == need) {
                    char leftChar = s.charAt(left);
                    if (mapHave.containsKey(leftChar)) {
                        mapHave.put(leftChar, mapHave.get(leftChar) - 1);
                        if (mapHave.get(leftChar) < mapT.get(leftChar)) {
                            have--;
                        }
                    }
                    left++;
                }

                if ((minRight - minLeft) > right - left) {
                    minRight = right;
                    minLeft = left;
                }
            }
            right++;
        }

        if (minRight == Integer.MAX_VALUE) {return "";}
        if (minLeft > 0) {minLeft--;}
        return s.substring(minLeft, minRight + 1);
    }
}
