import java.util.Arrays;

public class Nab {

    public static void main(String[] args) {
//        System.out.println(solution("?a???"));

        System.out.println(solution2("BAAABAB"));
        System.out.println(solution2("BBABAA"));
        System.out.println(solution2("AABBB"));

    }

    public static String solution(String S) {
        // Implement your solution here
        char[] chars = S.toCharArray();
        int start = 0;
        int end = S.length() - 1;

        while (start <= end) {
            if (start == end && chars[start] == '?') {
                chars[start] = 'a';
            }
            if (chars[start] == '?' && chars[end] == '?') {
                chars[start] = 'a';
                chars[end] = 'a';
            } else if (chars[start] == '?' && chars[end] != '?') {
                chars[start] = chars[end];
            } else if (chars[start] != '?' && chars[end] == '?') {
                chars[end] = chars[start];
            } else if (chars[start] != chars[end]) {
                return "NO";
            }
            start++;
            end--;
        }
        return new String(chars);
    }

    public static int solution2(String s) {
        final char CHAR_A = 'A';
        int numB = 0;
        int minDel = 0;

        for (char c : s.toCharArray()) {
            if (CHAR_A == c) {
                minDel = Math.min(numB, minDel + 1);
            } else {
                numB++;
            }
        }

        return minDel;
    }

    public static int solution3(int[] A) {
        int sum = Arrays.stream(A).sum();
        int avg = (int) Math.ceil((double) sum / A.length);

        int actions = 0;

        for (int num : A) {
            if (avg > num) {
                actions += avg - num;
            }
        }
        return actions;
    }
}
