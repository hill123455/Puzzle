package studyplan.hashmap.easy;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {

    // https://leetcode.com/problems/word-pattern/?envType=study-plan-v2&id=top-interview-150

    public static void main(String[] args) {

    }

    public boolean wordPattern(String pattern, String s) {
        String[] listString = s.split(" ");
        if(pattern.length() != listString.length) return false;
        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            if (map.containsKey(pattern.charAt(i))) {
                if (!map.get(pattern.charAt(i)).equals(listString[i])) {
                    return false;
                }
            } else {
                if (map.containsValue(listString[i])) {
                    return false;
                }
                map.put(pattern.charAt(i), listString[i]);
            }
        }
        return true;
    }
}
