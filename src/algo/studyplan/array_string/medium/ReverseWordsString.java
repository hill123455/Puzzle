package studyplan.array_string.medium;

import java.util.List;
import java.util.Stack;

public class ReverseWordsString {

    // https://leetcode.com/problems/reverse-words-in-a-string/?envType=study-plan-v2&id=top-interview-150

//    Input: s = "the sky is blue"
//    Output: "blue is sky the"

    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));
        System.out.println(reverseWords("the sky is blue"));
    }

    public static String reverseWords(String s) {
        Stack<String> stack = new Stack<>();
        String[] list = s.split(" ");
        for (String str : list) {
            if (!str.isEmpty()) {
                stack.push(str);
            }
        }

        StringBuilder res = new StringBuilder();
        while (!stack.isEmpty()) {
            res.append(stack.pop());
            res.append(" ");
        }
        return res.toString().trim();
    }
}
