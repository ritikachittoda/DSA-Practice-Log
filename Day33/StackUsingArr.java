package Day33;

// GFG Problem: https://www.geeksforgeeks.org/problems/implement-stack-using-array/1
// Time: O(1)​, Space: O(n) where n = stack capacity

public class StackUsingArr {
    int arr[];
    int top, cap;
    
    public StackUsingArr() {
        cap = 1000;
        arr = new int[cap];
        top = -1;
    }
    
    public void push(int x) {
        if(top == cap - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = x;
    }
    
    public int pop() {
        if(top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--]; 
    }

    public int peek() {
        if(top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }
}
