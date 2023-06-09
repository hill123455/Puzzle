package studyplan.array_string.medium;

import java.util.HashMap;
import java.util.Map;

public class IntegerToRoman {

    // https://leetcode.com/problems/integer-to-roman/?envType=study-plan-v2&id=top-interview-150

    public static void main(String[] args) {

    }

    public String intToRoman(int num) {
        int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] strs = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                result.append(strs[i]);
                num -= values[i];
            }
        }
        return result.toString();
    }
}
