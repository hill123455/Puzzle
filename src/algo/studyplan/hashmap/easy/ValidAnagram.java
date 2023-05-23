package studyplan.hashmap.easy;

public class ValidAnagram {

    // https://leetcode.com/problems/valid-anagram/?envType=study-plan-v2&id=top-interview-150

    // Input: s = "anagram", t = "nagaram"
    // Output: true

    public static void main(String[] args) {
    }

    public boolean isAnagram(String s, String t) {
        int[] map = new int[26];
        for (char c : s.toCharArray()) {
            map[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            map[c - 'a']--;
        }
        for (int val : map) {
            if (val > 0) {return false;}
        }
        return true;
    }
}
