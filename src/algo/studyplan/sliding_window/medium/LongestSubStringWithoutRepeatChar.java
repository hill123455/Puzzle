package studyplan.sliding_window.medium;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithoutRepeatChar {

    // https://leetcode.com/problems/longest-substring-without-repeating-characters/?envType=study-plan-v2&id=top-interview-150

    public static void main(String[] args) {

    }

    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int max = 0;
        int left = 0;
        int right = 0;
        while (right < s.length()) {
            if (!set.add(s.charAt(right))) {
                max = Math.max(max, set.size());
                set.remove(s.charAt(left));
                left++;
            } else {
                right++;
            }
        }
        max = Math.max(max, set.size());
        return max;
    }

}
