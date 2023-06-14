import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeMap;

public class MainNew {

    public static void main(String[] args) {
        System.out.println(reverseStr("abcdefg", 2));
    }

    public static String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        int start = 0;
        while (start < s.length()) {
            int end = Math.min(s.length() - 1, start + k - 1);
            while (start < end) {
                char temp = chars[end];
                chars[end] = chars[start];
                chars[start] = temp;
                end--;
                start++;
            }
            start += 2 * k;
        }
        return new String(chars);
    }
}
