package studyplan.two_pointer.easy;

public class ValidPalindrome {

    // https://leetcode.com/problems/valid-palindrome/?envType=study-plan-v2&id=top-interview-150

    public static void main(String[] args) {
        System.out.println(isPalindrome(" "));
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        int start = 0;
        int end = s.length() - 1;

        while (start < s.length()) {
            if (s.charAt(start) != s.charAt(end)) {return false;}
            start++;
            end--;
        }

        return true;

    }
}
