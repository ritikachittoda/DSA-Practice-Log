package Day36;

// GFG Problem: https://www.geeksforgeeks.org/problems/implement-stack-using-linked-list/1
// Time: O(1)​, Space: O(n)

public class StackUsingLinkedList {
    class MyStack {
        class StackNode {
            int data;
            StackNode next;

            StackNode(int a) {
                data = a;
                next = null;
            }
        }

        StackNode top;

        // Function to push an integer into the stack.
        void push(int a) {
            StackNode newNode = new StackNode(a);
            newNode.next = top;
            top = newNode;
        }

        // Function to remove an item from top of the stack.
        int pop() {
            if (top == null)
                return -1;
            int val = top.data;
            top = top.next;
            return val;
        }
    }

}