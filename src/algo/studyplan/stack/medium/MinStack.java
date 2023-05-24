package studyplan.stack.medium;

import java.util.Stack;

public class MinStack {

    // https://leetcode.com/problems/min-stack/?envType=study-plan-v2&id=top-interview-150

    public static void main(String[] args) {

    }

    class Node {

        public Node(int value, int minValue) {
            this.value = value;
            this.minValue = minValue;
        }

        int value;
        int minValue;
    }

    Stack<Node> stack;
    int currentMin = Integer.MAX_VALUE;

    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int val) {
        if (val < currentMin) {currentMin = val;}
        stack.push(new Node(val, currentMin));
    }

    public void pop() {
        stack.pop();

        if (stack.isEmpty()) {
            currentMin = Integer.MAX_VALUE;
        } else {
            currentMin = getMin();
        }
    }

    public int top() {
        return stack.peek().value;
    }

    public int getMin() {
        return stack.peek().minValue;
    }
}
