package Day34;

// GFG Problem: https://www.geeksforgeeks.org/problems/implement-queue-using-array/1
// Time: O(1)​, Space: O(n) where n = size of the queue

public class QueueUsingArr {
    class MyQueue {

        int front, rear, size;
        int arr[] = new int[100005];

        MyQueue() {
            front = 0;
            rear = 0;
            size = 0;
        }

        // Function to push an element x in a queue.
        void push(int x) {
            if (size == 100005)
                return;
            arr[rear] = x;
            rear = (rear + 1) % 100005;
            size++;
        }

        // Function to pop an element from queue and return that element.
        int pop() {
            if (size == 0) {
                return -1;
            }
            int val = arr[front];
            front = (front + 1) % 100005;
            size--;
            return val;
        }
    }
}