import java.util.HashMap;
import java.util.Map;

public class CheckInclusion {

    public static void main(String[] args) {
        System.out.println(checkInclusion("adc", "dcda"));
    }

    public static boolean checkInclusion(String s1, String s2) {
        Map<Character, Integer> mapS1 = new HashMap<>();
        Map<Character, Integer> mapS2 = new HashMap<>();

        for (char c : s1.toCharArray()) {
            mapS1.put(c, mapS1.getOrDefault(c, 0) + 1);
        }

        int left = 0;
        int right = 0;
        while (right < s2.length()) {
            char c2 = s2.charAt(right);
            mapS2.put(c2, mapS2.getOrDefault(c2, 0) + 1);
            if (right - left == s1.length() - 1) {
                // compare
                if (mapS2.entrySet().containsAll(mapS1.entrySet())) {
                    return true;
                } else {

                    if (mapS2.get(s2.charAt(left)) > 1) {
                        mapS2.put(s2.charAt(left), mapS2.get(s2.charAt(left)) - 1);
                    } else {
                        mapS2.remove(s2.charAt(left));
                    }
                    left++;
                }
            }
            right++;
        }
        return false;
    }
}
