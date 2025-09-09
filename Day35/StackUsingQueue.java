package Day35;

import java.util.LinkedList;
import java.util.Queue;

// LeetCode Problem: https://leetcode.com/problems/implement-stack-using-queues/
// Time: O(1)​, Space: O(n)

public class StackUsingQueue {
    class MyStack {

        private Queue<Integer> q;

        public MyStack() {
            q = new LinkedList<>();
        }

        public void push(int x) {
            q.add(x);
            int size = q.size();
            for (int i = 0; i < size - 1; i++) {
                q.add(q.remove());
            }
        }

        public int pop() {
            if (q.isEmpty())
                return -1;
            return q.remove();
        }

        public int top() {
            if (q.isEmpty())
                return -1;
            return q.peek();
        }

        public boolean empty() {
            return q.isEmpty();
        }
    }
}
