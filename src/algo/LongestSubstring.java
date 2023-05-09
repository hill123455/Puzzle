import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstring {

    public static void main(String[] args) {
        System.out.println(findLongestSubString("abcdefaadrhfkvotu"));
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
