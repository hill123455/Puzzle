import java.util.HashSet;
import java.util.Set;

public class CountGoodSubString {

    public static void main(String[] args) {
        countGoodSubstrings("xyzzaz");
    }

    public static int countGoodSubstrings(String s) {
        int left = 0, right = 0;
        Set<Character> set = new HashSet<>();
        int count = 0;
        while (right < s.length()) {
            if (set.add(s.charAt(right))) {
                right++;
                if(right - left == 3) {
                    count++;
                    set.remove(s.charAt(left));
                    left++;
                }
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }
        return count;
    }
}
