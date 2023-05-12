import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstring {

    public static void main(String[] args) {
        System.out.println(findLongestSubString2("aab"));
    }

    public static int findLongestSubString2(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0;
        int right = 0;
        int max = 0;

        while (right < s.length()) {
            if(set.add(s.charAt(right))){
                max = Math.max(max, set.size());
                right++;
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }
        return max;
    }

    public int findLengthLongestSubString(String str) {
        int max = 0;
        int left = 0;
        int right = 0;
        Set<Character> set = new HashSet<>();
        while (right < str.length()) {
            if (set.add(str.charAt(right))) {
                max = Math.max(set.size(), max);
                right++;
            } else {
                set.remove(str.charAt(left));
                left++;
            }
        }
        return max;
    }

    public static String findLongestSubString(String str) {
        int max = 0;
        int left = 0;
        int right = 0;
        int startIdx = 0;
        int endIdx = 0;
        Set<Character> set = new HashSet<>();
        while (right < str.length()) {
            if (set.add(str.charAt(right))) {
                if (set.size() > max) {
                    max = set.size();
                    startIdx = left;
                    endIdx = right;
                }
                right++;
            } else {
                set.remove(str.charAt(left));
                left++;
            }
        }
        return str.substring(startIdx, endIdx);
    }
}
