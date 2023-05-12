package studyplan.array_string.easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    // https://leetcode.com/problems/roman-to-integer

//    Symbol       Value
//    I             1
//    V             5
//    X             10
//    L             50
//    C             100
//    D             500
//    M             1000

    //    Input: s = "MCMXCIV"
//    Output: 1994
//    Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>() {{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};
        int sum = 0;
        int prev = 0;
        for (int i = s.toCharArray().length; i > 0; i--) {
            int val = map.get(s.charAt(i - 1));
            sum += val > prev ? val : val * -1;
            prev = val;
        }
        return sum;
    }
}
