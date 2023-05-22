package studyplan.two_pointer.easy;

public class IsSubsequence {

    //https://leetcode.com/problems/is-subsequence/?envType=study-plan-v2&id=top-interview-150

    public static void main(String[] args) {

    }

    public boolean isSubsequence(String s, String t) {
        int pointerS = 0;
        int pointerT = 0;

        while (pointerS < s.length() && pointerT < t.length()) {
            if (s.charAt(pointerS) == t.charAt(pointerT)) {
                pointerS++;
            }
            pointerT++;
        }

        return pointerS == s.length();
    }
}
