package Day40;

// GFG Problem: https://www.geeksforgeeks.org/problems/insert-a-node-in-doubly-linked-list/1
// Time: O(n), Space: O(1)

class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}

public class InsertInDoublyLL {
    Node insertAtPos(Node head, int p, int x) {
        Node newNode = new Node(x);
        
        if(head == null) return newNode;
        
        Node temp = head;
        int count = 0;
        
        while(temp != null && count < p) {
            temp = temp.next;
            count++;
        }
        
        if(temp == null) return head;
        
        newNode.next = temp.next;
        if(temp.next != null) temp.next.prev = newNode;
        temp.next = newNode;
        newNode.prev = temp;
        
        return head;
    }
}