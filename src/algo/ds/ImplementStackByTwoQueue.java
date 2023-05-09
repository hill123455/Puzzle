package ds;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackByTwoQueue {
    private Queue<Integer> queue1 = new LinkedList<>();
    private Queue<Integer> queue2 = new LinkedList<>();

    public static void main(String[] args) {
        ImplementStackByTwoQueue stack = new ImplementStackByTwoQueue();
        stack.push(3);
        stack.push(5);
        stack.push(7);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }

    private void push(int num) {
        while (!queue1.isEmpty()) {
            queue2.add(queue1.poll());
        }
        queue1.add(num);

        while (!queue2.isEmpty()){
            queue1.add(queue2.poll());
        }
    }

    private int pop() {
        return queue1.poll();
    }

}
