package Day40;

// GFG Problem: https://www.geeksforgeeks.org/problems/delete-node-in-doubly-linked-list/1
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

public class DeleteInDoublyLL {
    public Node delPos(Node head, int x) {
        Node temp = head;
        int count = 1;
        
        if(head == null) return null;
        
        while(temp != null && count < x) {
            temp = temp.next;
            count++;
        }
        
        if(temp == null) return head;
        
        if(temp.prev == null){
            head = temp.next;
            if(head != null) head.prev = null;
        } 
        
        if(temp.prev != null) temp.prev.next = temp.next;
        if(temp.next != null) temp.next.prev = temp.prev;
        
        return head;
        
    }
}
