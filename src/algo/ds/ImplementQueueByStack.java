package ds;

import java.util.Stack;

public class ImplementQueueByStack {

    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    public static void main(String[] args) {
        ImplementQueueByStack queue = new ImplementQueueByStack();
        queue.enqueue(1);
        queue.enqueue(3);
        queue.enqueue(5);
        queue.enqueue(7);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }

    private void enqueue(int num) {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

        stack1.push(num);
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }

    private int dequeue() {
        return stack1.pop();
    }
}
