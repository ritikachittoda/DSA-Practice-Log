package Day38;

// GFG Problem: https://www.geeksforgeeks.org/problems/linked-list-insertion-1587115620/1
// Time: O(n), Space: O(1)

class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}

public class LinkedListInsetion {
    public Node insertAtEnd(Node head, int x) {
        Node temp = head;
        
        if(head == null)   return new Node(x);
        
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(x);
        
        return head;
        
    }
}
