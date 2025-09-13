package Day39;

// GFG Problem: https://www.geeksforgeeks.org/problems/search-in-linked-list-1664434326/1
// Time: O(n), Space: O(1)

class Node {
   int data;
    Node next;

    Node(int d)  { data = d;  next = null; }
}

public class SearchInLL {
    public boolean searchKey(Node head, int key) {
        Node temp = head;
        
        if(head == null) return false;
        
        while(temp != null) {
            if(temp.data == key) {
                return true;
            }
            temp = temp.next;
        }
        
        return false;
    }
}
