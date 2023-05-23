package studyplan.hashmap.easy;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {

    // https://leetcode.com/problems/isomorphic-strings/?envType=study-plan-v2&id=top-interview-150

    // Input: s = "paper", t = "title"
    // Output: true

    // All occurrences of a character must be replaced with another character
    // while preserving the order of characters. No two characters may map to the same
    // character, but a character may map to itself.

    public static void main(String[] args) {
        System.out.println(isIsomorphic2("ab", "aa"));
    }

    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if (map.containsKey(sChar)) {
                if (!map.get(sChar).equals(tChar)) {
                    return false;
                }
            } else {
                if (map.containsValue(tChar)) {
                    return false;
                }
                map.put(sChar, tChar);
            }
        }
        return true;
    }

    public static boolean isIsomorphic2(String s1, String s2) {
        int[] hash = new int[512];
        for (int i = 0; i < s1.length(); i++) {
            if (hash[s1.charAt(i)] != hash[s2.charAt(i) + 256]) {return false;}
            hash[s1.charAt(i)] = hash[s2.charAt(i)] = i + 1;
        }
        return true;
    }
}
