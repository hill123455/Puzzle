package studyplan.array_string.easy;

public class LengthOfTheLastWord {

    // https://leetcode.com/problems/length-of-last-word/?envType=study-plan-v2&id=top-interview-150

    public static void main(String[] args) {
        String a = "   ab  cd   ";
        System.out.println(a.trim());
    }

    public int lengthOfLastWord(String s) {
        int count = 0;
        s = s.trim();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') return count;
            count++;
        }
        return count;
    }
}
