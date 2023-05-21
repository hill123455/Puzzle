package studyplan.array_string.medium;

import java.util.Arrays;

public class ZigzacConversion {

    // https://leetcode.com/problems/zigzag-conversion/?envType=study-plan-v2&id=top-interview-150

    //    Input: s = "PAYPALISHIRING", numRows = 3
    //    Output: "PAHNAPLSIIGYIR"

    public static void main(String[] args) {
//        System.out.println(convert("PAYPALISHIRING", 3));
        System.out.println(convert("A", 1));

        //PINALSIGYAHRPI
    }

    public static String convert(String s, int numRows) {
        int distance = 2 * (numRows - 1);
        if(distance == 0) return s;
        char[] res = new char[s.length()];
        int resultIndex = 0;
        for (int i = 0; i <= numRows - 1; i++) {
            int index = i;
            while (index < s.length()) {
                res[resultIndex++] = s.charAt(index);
                if (i > 0 && i < numRows - 1 && (index + distance - 2 * i) < s.length()) {
                    res[resultIndex++] = s.charAt(index + distance - 2 * i);
                }
                index += distance;
            }
        }
        return new String(res);
    }
}
