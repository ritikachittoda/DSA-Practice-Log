package Day35;

import java.util.Stack;

// LeetCode Problem: https://leetcode.com/problems/implement-queue-using-stacks/
// Time: O(1)​, Space: O(n)

public class QueueUsingStack {
    class MyQueue {

        private Stack<Integer> input;
        private Stack<Integer> output;

        public MyQueue() {
            input = new Stack<>();
            output = new Stack<>();
        }

        public void push(int x) {
            input.push(x);
        }

        public int pop() {
            peek();
            return output.pop();
        }

        public int peek() {
            if (output.isEmpty()) {
                while (!input.isEmpty()) {
                    output.push(input.pop());
                }
            }
            return output.peek();
        }

        public boolean empty() {
            return input.isEmpty() && output.isEmpty();
        }
    }
}
