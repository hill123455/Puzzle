package daily_challenge;

public class CheckAApprearBeforeB {

    //https://leetcode.com/problems/check-if-all-as-appears-before-all-bs/

    public static void main(String[] args) {

    }

    public boolean checkString(String s) {
        char[] chars = s.toCharArray();
        boolean existB = false;
        for(char c : chars) {
            if(c == 'B') existB = true;
            else if(c == 'A' && existB) {
                return false;
            }
        }
        return true;
    }
}
