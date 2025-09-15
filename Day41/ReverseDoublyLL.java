package Day41;

// GFG Problem: https://www.geeksforgeeks.org/problems/reverse-a-doubly-linked-list/1 
// Time: O(n), Space: O(1)

class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class ReverseDoublyLL {
    public Node reverse(Node head) {
        if(head == null || head.next == null) return head;
        
        Node curr = head;
        Node temp = null;
        
        while(curr != null) {
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;
            curr = curr.prev;
        }
        
        if(temp != null) {
            head = temp.prev;
        }
        
        return head;
    }
}
