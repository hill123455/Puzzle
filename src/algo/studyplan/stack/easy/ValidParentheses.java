package studyplan.stack.easy;

import java.util.Stack;

public class ValidParentheses {

    // https://leetcode.com/problems/valid-parentheses/?envType=study-plan-v2&id=top-interview-150

    public static void main(String[] args) {

    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if(c== '(') stack.push(')');
            else if(c== '[') stack.push(']');
            else if(c== '{') stack.push('}');
            else if(stack.isEmpty() || stack.pop() != c) return false;
        }
        return stack.isEmpty();
    }
}
