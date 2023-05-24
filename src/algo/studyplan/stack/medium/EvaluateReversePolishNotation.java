package studyplan.stack.medium;

import java.util.List;
import java.util.Stack;

public class EvaluateReversePolishNotation {

    // https://leetcode.com/problems/evaluate-reverse-polish-notation/submissions/956359284/?envType=study-plan-v2&id=top-interview-150

    public static void main(String[] args) {

    }

    public int evalRPN(String[] tokens) {
        List<String> listOperation = List.of("+", "-", "*", "/");
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            if (listOperation.contains(token)) {
                int num2 = stack.pop();
                int num1 = stack.pop();
                switch (token) {
                    case "+": stack.push(num1 + num2);break;
                    case "-": stack.push(num1 - num2);break;
                    case "*": stack.push(num1 * num2);break;
                    case "/": stack.push(num1 / num2);break;
                }
            } else {
                stack.push(Integer.valueOf(token));
            }
        }

        return stack.pop();
    }
}
