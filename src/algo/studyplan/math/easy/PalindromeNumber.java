package studyplan.math.easy;

import java.util.Queue;
import java.util.Stack;

public class PalindromeNumber {

    // https://leetcode.com/problems/palindrome-number/?envType=study-plan-v2&id=top-interview-150

    public static void main(String[] args) {
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {return false;}
        int value = x;
        int result = 0;
        while (x > 0) {
            result *= 10;
            result += x % 10;
            x /= 10;
        }
        return result == value;
    }
}
