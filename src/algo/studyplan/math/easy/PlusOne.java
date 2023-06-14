package studyplan.math.easy;

import java.util.Arrays;
import java.util.Stack;

public class PlusOne {

    // https://leetcode.com/problems/plus-one/description/?envType=study-plan-v2&id=top-interview-150

    public static void main(String[] args) {
        plusOne(new int[] { 9 });
    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] += 1;
            if (digits[i] <= 9) {return digits;}
            digits[i] = 0;
        }

        int[] ret = new int[digits.length + 1];
        ret[0] =1;
        return ret;
    }
}
