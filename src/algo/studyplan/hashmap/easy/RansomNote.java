package studyplan.hashmap.easy;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {

    //https://leetcode.com/problems/ransom-note/?envType=study-plan-v2&id=top-interview-150

    //Input: ransomNote = "aa", magazine = "aab"
    //Output: true

    public static void main(String[] args) {
        canConstruct("aa", "aab");
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] hash = new int[26];

        for (char c : ransomNote.toCharArray()) {
            hash[c - 'a'] += 1;
        }

        for (char c : magazine.toCharArray()) {
            hash[c - 'a'] -= 1;
        }

        for (int value : hash) {
            if (value > 0) {return false;}
        }

        return true;
    }
}
